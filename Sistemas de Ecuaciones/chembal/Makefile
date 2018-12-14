
all: classes jars

classes:
	javac -cp lib/antlr-3.3-complete.jar -sourcepath sources sources/*.java -d build

jars: classes
	jar cfm chembal.jar sources/Manifest -C build . 
	jar cfm chemlet.jar sources/Manifest -C build . 

testclasses: jars
	javac -cp lib/junit-4.8.2.jar:lib/antlr-3.3-complete.jar:chembal.jar -sourcepath tests tests/*.java -d tests/build

test: testclasses
	java -cp lib/junit-4.8.2.jar:chembal.jar:antlr-3.3-complete.jar:tests/build org.junit.runner.JUnitCore MainTest
	java -cp lib/junit-4.8.2.jar:chembal.jar:antlr-3.3-complete.jar:tests/build org.junit.runner.JUnitCore ChemicalParserTest
