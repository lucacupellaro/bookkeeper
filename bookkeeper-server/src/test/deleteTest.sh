#!/bin/bash

TARGET_DIR="/home/luca/ISW2/DeAngelis/Bookkeeper17/bookkeeper/bookkeeper-server"

echo "🔍 Eliminazione dei test in: $TARGET_DIR"

# Elimina tutti i file .java dentro src/test/java/
find "$TARGET_DIR/src/test/java" -type f -name "*.java" -print -delete

# Rimuove tutte le cartelle vuote rimaste
find "$TARGET_DIR/src/test/java" -type d -empty -print -delete

echo "✅ Tutti i test sono stati rimossi da $TARGET_DIR"
