package fr.n7.swingTableur;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.Map.Entry;

public class UtilisateurTableur {

    /*
     * Problèmes observés :
     * - les contraintes sont toutes à 0, même pour celles où l'on ajoute une
     * contrainte de chaque ...
     * -
     */

    public JFrame frame;
    public JTable t1, t2;
    // public static int tailleColonneID = 0;

    public Map<String, Colonne> tableau = new HashMap<String, Colonne>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UtilisateurTableur main = new UtilisateurTableur();
            // if (args[0] != null) tailleColonneID = Integer.parseInt(args[0]);

            // Pour lancer un exemple de base
            main.createAndShowGUI();

            // // Exemple de données pour les colonnes
            // Map<String, List<Object>> colonnes = new HashMap<>();
            // colonnes.put("ID", List.of("1", "2", "3"));
            // colonnes.put("Age", List.of("25", "30", "22"));
            // colonnes.put("Name", List.of("Alice", "Bob", "Charlie"));

            // main.createTableFromTableur(colonnes);
        });
    }

    public boolean checkConstraints(String columnName, int columnNumber, String cellValue) {
        if (tableau.containsKey(columnName)) {
            Colonne colonne = tableau.get(columnName);

            System.out.println();

            // Récupérer les contraintes de la colonne
            Set<Contrainte> contraintes = colonne.getContraintes();
            System.out.println("taille de contraintes : " + contraintes.size());
            // Vérifier les contraintes
            for (Contrainte contrainte : contraintes) {
                if (!contrainte.verifier(cellValue)) {
                    System.out.println("La contrainte n'est pas respectée pour la cellule [" + columnNumber + ", " +
                            columnName + "].");
                    return false;
                } else {
                    System.out.println("La contrainte est respectée pour " + cellValue);
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Méthode pour créer la visualisation graphique depuis un argument colonnes
     * 
     * @param colonnes
     */
    private void createTableFromTableur(Map<String, List<Object>> colonnes) {
        this.frame = new JFrame("Tableur Swing");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Créer la barre de menu
        JMenuBar menuBar = createMenuBar(tabbedPane);
        frame.setJMenuBar(menuBar);

        // Création des colonnes
        for (Entry<String, List<Object>> entry : colonnes.entrySet()) {
            final String key = entry.getKey();
            final List<Object> value = entry.getValue();

            // Traitement key-value
            List<String> col = new ArrayList<>();
            for (Object obj : value) {
                col.add(obj.toString());
            }

            // Création d'une colonne avec des contraintes
            Set<Contrainte> contraintes = new LinkedHashSet<>();
            contraintes.add(new ContrainteType(Contrainte.FORMAT_STRING));
            Colonne colonne = new Colonne(key, col, contraintes);

            tableau.put(key, colonne);
        }

        JTable t1 = addTable(tabbedPane, "Table1", tableau.get("ID"),
                new ArrayList<>(tableau.values()));
        changeRenderAllColumns(t1);

        Button button1 = new Button("Test !");
        JTable menuTable = new JTable();

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        tabbedPane.add("Button Tab", buttonPanel);

        tabbedPane.add(menuTable);

        frame.getContentPane().add(tabbedPane);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createAndShowGUI() {
        this.frame = new JFrame("Tableur Swing");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Créer la barre de menu
        JMenuBar menuBar = createMenuBar(tabbedPane);
        frame.setJMenuBar(menuBar);

        Set<Contrainte> contraintes_ages = new LinkedHashSet<>();
        contraintes_ages.add(new ContrainteValeur(0, Integer.MAX_VALUE));
        contraintes_ages.add(new ContrainteType(Contrainte.FORMAT_INT));

        Set<Contrainte> contraintes_word = new LinkedHashSet<>();
        contraintes_word.add(new ContrainteType(Contrainte.FORMAT_WORD));
        System.out.println(contraintes_ages.size());

        // Création des colonnes
        Colonne colonneID_1 = new Colonne("ID", List.of("1", "2", "3"));
        setConstraintColumnID(colonneID_1);
        tableau.put(colonneID_1.getColonneName(), colonneID_1);

        Colonne colonne2 = new Colonne("Age_1", List.of("25", "30", "22"), contraintes_ages);
        tableau.put(colonne2.getColonneName(), colonne2);

        Colonne colonne3 = new Colonne("Name_1", List.of("Alice", "Bob", "Charlie"), contraintes_word);
        tableau.put(colonne3.getColonneName(), colonne3);

        Colonne colonne4 = new Colonne("Name_2", List.of("John", "Jane", "Doe"), contraintes_word);
        tableau.put(colonne4.getColonneName(), colonne4);

        Colonne colonneID_2 = new Colonne("ID", List.of("4", "5", "6"));
        setConstraintColumnID(colonneID_2);
        tableau.put(colonneID_2.getColonneName(), colonneID_2);

        Colonne colonne6 = new Colonne("Age_2", List.of("28", "35", "40"), contraintes_ages);
        tableau.put(colonne6.getColonneName(), colonne6);

        t1 = addTable(tabbedPane, "Table1", colonneID_1,
                List.of(colonne3, colonne2));
        changeRenderAllColumns(t1);

        t2 = addTable(tabbedPane, "Table2", colonneID_2,
                List.of(colonne4, colonne6));
        changeRenderAllColumns(t2);

        Button button1 = new Button("Test !");
        JTable menuTable = new JTable();

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        tabbedPane.add("Button Tab", buttonPanel);

        tabbedPane.add(menuTable);

        frame.getContentPane().add(tabbedPane);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void setConstraintColumnID(Colonne colonne) {
        colonne.addContrainte(new ContrainteValeur(0, Float.MAX_VALUE));
        colonne.addContrainte(new ContrainteType(Contrainte.FORMAT_INT));
    }

    private JTable addTable(JTabbedPane tabbedPane, String tableName, Colonne colonneID, List<Colonne> colonnes) {
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");

        for (Colonne colonne : colonnes) {
            tableModel.addColumn(colonne.getColonneName());
        }

        int rowCount = Math.max(colonneID.getLignes().size(), colonnes.get(0).getLignes().size());
        System.out.println(rowCount);
        for (int i = 0; i < rowCount; i++) {
            Object[] row = new Object[colonnes.size() + 1];
            row[0] = colonneID.getLignes().get(i);
            for (int j = 0; j < colonnes.size(); j++) {
                row[j + 1] = colonnes.get(j).getLignes().get(i);
            }
            tableModel.addRow(row);
        }

        JTable table = new JTable(tableModel);
        table.setName(tableName);

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Table Name: " + tableName), BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        tabbedPane.addTab(tableName, panel);

        // Provisoirement, on enregistre la table quand on ouvre avec swing
        printTable(table);
        saveFile(table, table.getName() + ".csv");
        System.out.println();

        return table;
    }

    private void printTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        // Imprime les en-têtes des colonnes
        for (int j = 0; j < colCount; j++) {
            System.out.print(model.getColumnName(j));
            if (j < colCount - 1) {
                System.out.print(",");
            }
        }
        System.out.println(); // Nouvelle ligne après les en-têtes

        // Imprime les données ligne par ligne
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(model.getValueAt(i, j));
                if (j < colCount - 1) {
                    System.out.print(",");
                }
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de données
        }
    }

    /**
     * Permet de faire apparaître graphiquement là où se trouvent des erreurs en
     * affichant les celulles invalides en rouge.
     * 
     * @param table la table dont on souhaite ajouter sur ses colonnes le traitement
     *              graphique
     */
    public void changeRenderAllColumns(JTable table) {
        int nbColumns = table.getColumnModel().getColumnCount();

        for (int i = 0; i < nbColumns; i++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(i);
            tableColumn.setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                        boolean hasFocus, int row, int column) {
                    Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
                            column);

                    // Vérifier les contraintes lorsqu'une cellule est rendue
                    String columnName = table.getColumnName(column);
                    int columnNumber = column - 1;
                    if (!checkConstraints(columnName, columnNumber, value.toString())) {
                        // if (!checkConstraints(table.getColumnModel().getColumn(column),
                        // value.toString())) {
                        cell.setBackground(Color.RED);
                        System.out.println("FAUX");
                    } else {
                        if (isSelected) {
                            cell.setBackground(table.getSelectionBackground());
                        } else {
                            cell.setBackground(table.getBackground());
                        }

                    }

                    return cell;
                }
            });
        }
    }

    /**
     * Sauvegarde le fichier de la table en paramètre en .csv, de nom fileName.csv
     * 
     * @param table
     * @param fileName
     */
    private void saveFile(JTable table, String fileName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Écrit les en-têtes des colonnes
            for (int j = 0; j < colCount; j++) {
                writer.write(model.getColumnName(j));
                if (j < colCount - 1) {
                    writer.write(",");
                }
            }
            writer.newLine(); // Nouvelle ligne après les en-têtes

            // Écrit les données ligne par ligne
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    writer.write(String.valueOf(model.getValueAt(i, j)));
                    if (j < colCount - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine(); // Nouvelle ligne après chaque ligne de données
            }

            System.out.println("Données enregistrées dans le fichier : " + fileName);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'enregistrement dans le fichier : " + e.getMessage());
        }
    }

    private JMenuBar createMenuBar(JTabbedPane tabbedPane) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("TO DO : ajouter save");
                saveFile(t1, "out" + t1.getName() + ".csv");
                saveFile(t2, "out" + t2.getName() + ".csv");
                return;
            }
        });
        fileMenu.add(saveItem);

        JMenuItem printItem = new JMenuItem("Print");
        printItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printTable((JTable) tabbedPane.getTabComponentAt(0));
            }
        });
        fileMenu.add(printItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Voulez-vous vraiment quitter ?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Sauvegarder ici si nécessaire
                    System.exit(0);
                } else {
                    return;
                }
            }
        });

        fileMenu.add(exitItem);

        // Ajouter un gestionnaire d'événements pour la fermeture de la fenêtre
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Voulez-vous vraiment quitter ?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Sauvegarder ici si nécessaire
                    System.exit(0);
                } else {
                    return;
                }
            }
        });

        JMenu customMenu = new JMenu("Custom");

        JMenuItem method1Item = new JMenuItem("Method 1");
        method1Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ajoutez le code pour la méthode 1 ici
                JOptionPane.showMessageDialog(frame, "Method 1 not implemented yet.");
            }
        });
        customMenu.add(method1Item);

        JMenuItem method2Item = new JMenuItem("Method 2");
        method2Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ajoutez le code pour la méthode 2 ici
                JOptionPane.showMessageDialog(frame, "Method 2 not implemented yet.");
            }
        });
        customMenu.add(method2Item);

        menuBar.add(fileMenu);
        menuBar.add(customMenu);

        return menuBar;
    }
}
