randoop #!/bin/bash

TEST_CLASS="org.apache.bookkeeper.proto.checksum.DigestManager"
RANDOOP_JAR="randoop-all-4.3.3.jar"
OUTPUT_DIR="randoop-tests"

echo "📦 Generazione classpath con Maven..."
mvn dependency:build-classpath -Dmdep.outputFile=cp.txt

echo "🚀 Esecuzione Randoop su $TEST_CLASS"
java -classpath "$(cat cp.txt):target/classes:target/test-classes:$RANDOOP_JAR" \
  randoop.main.Main gentests \
  --testclass="$TEST_CLASS" \
  --junit-output-dir="$OUTPUT_DIR" \
  --no-error-revealing-tests=false \
  --no-regression-tests=false \
  --null-ratio=0.3 \
  --string-maxlen=20 \
  --forbid-null=false \
  --time-limit=120


echo "✅ Test generati in $OUTPUT_DIR"