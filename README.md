# Installation and Running

## Make sure you have the Java Development Kit (JDK) installed

This project requires Java 8 or higher.

## Download and Install SootUp and Soot

SootUp and Soot are the core dependencies of this project. You need to configure these dependencies in your project.

### Example Maven Configuration:

```xml
<dependencies>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.core</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.java.core</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.java.sourcecode</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.java.bytecode</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.jimple.parser</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.callgraph</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.analysis</artifactId>
        <version>1.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.soot-oss</groupId>
        <artifactId>sootup.qilin</artifactId>
        <version>1.3.0</version>
    </dependency>
</dependencies>
```



# Code Analysis
## Initialize the Analysis Input Location:
The code use this two line to get Class path for analysis and count the number of Goto statements. It can modify the path to your class path. It should put the bytecode file here.

```
Path pathToBinary = Paths.get("src/test/resources/TestClass/binary");
AnalysisInputLocation inputLocation = PathBasedAnalysisInputLocation.create(pathToBinary, null);
```
## Compile and Run
Just run the main method of GotoCounter Class. There is already put on test file "testGoto.class" in the src/test/resources/TestClass/binary.

## Output the Statistical Result:
sample output: 
```
Found goto statement: goto
Total goto statements: 2
```

