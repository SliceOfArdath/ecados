#!/bin/bash

# Définition du chemin vers le répertoire contenant les fichiers CSV
FILE_DIR="../projet/fr.n7.tableur.edit/src-gen/fr/n7/tableur/transformation/Tableur.java"

# Modèle URI par défaut
MODEL_URI="TableTest.xmi"

# Noms des fichiers CSV
CSV_FILE1=$"./exemple_csv_age.csv"
CSV_FILE2=$"./exemple_csv_chaussure_externe.csv"

# Exécution du script Java avec les valeurs par défaut
java $FILE_DIR $MODEL_URI $CSV_FILE1 nomTableExterne1 $CSV_FILE2 nomTableExterne2
