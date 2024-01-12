#!/bin/bash

# Définition du chemin vers le répertoire contenant les fichiers CSV
CSV_DIR=~/ecados/csv_files/

# Modèle URI par défaut
MODEL_URI="ajouter/chemin/truc.xmi"

# Noms des fichiers CSV
CSV_FILE1=$CSV_DIR/exemple_csv_age.csv
CSV_FILE2=$CSV_DIR/exemple_csv_chaussure_externe.csv

# Exécution du script Java avec les valeurs par défaut
java Tableur "$MODEL_URI" "$CSV_FILE1" "nomTableExterne1" "$CSV_FILE2" "nomTableExterne2"
