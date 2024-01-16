package fr.n7.swingTableur;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

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
import java.util.List;
import java.util.Vector;

public class Main {

    public JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        this.frame = new JFrame("Tableur Swing");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Créer la barre de menu
        JMenuBar menuBar = createMenuBar(tabbedPane);
        frame.setJMenuBar(menuBar);

        // Ajoutez autant de tables que vous le souhaitez
        addTable(tabbedPane, "Table1", new Colonne("ID", List.of("1", "2", "3")),
                List.of(new Colonne("Name", List.of("John", "Jane", "Doe")),
                        new Colonne("Age", List.of("25", "30", "22"))));

        addTable(tabbedPane, "Table2", new Colonne("ID", List.of("4", "5", "6")),
                List.of(new Colonne("Name", List.of("Alice", "Bob", "Charlie")),
                        new Colonne("Age", List.of("28", "35", "40"))));

        Button button1 = new Button("Test !");
        JTable menuTable = new JTable();
        menuTable.add(button1);
        tabbedPane.add(menuTable);

        frame.getContentPane().add(tabbedPane);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private void addTable(JTabbedPane tabbedPane, String tableName, Colonne colonneID, List<Colonne> colonnes) {
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");
        for (Colonne colonne : colonnes) {
            tableModel.addColumn(colonne.getColonneName());
        }

        int rowCount = Math.max(colonneID.getLignes().size(), colonnes.get(0).getLignes().size());
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

        printTable(table);
        saveFile(table, table.getName() + ".csv");
        System.out.println();
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
                return;
            }
        });
        fileMenu.add(saveItem);

        JMenuItem printItem = new JMenuItem("Print");
        printItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printTable((JTable) tabbedPane.getTabComponentAt(0));
                ;
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
                } else{
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
