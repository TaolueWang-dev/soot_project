import sootup.core.inputlocation.AnalysisInputLocation;
import sootup.core.jimple.common.stmt.JGotoStmt;
import sootup.core.jimple.common.stmt.JIfStmt;
import sootup.core.jimple.common.stmt.Stmt;
import sootup.core.jimple.javabytecode.stmt.JSwitchStmt;
import sootup.core.model.Body;
import sootup.core.model.SootClass;
import sootup.core.model.SootMethod;
import sootup.core.views.View;
import sootup.java.bytecode.inputlocation.PathBasedAnalysisInputLocation;
import sootup.java.core.views.JavaView;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

public class GotoCounter {
    public static void main(String[] args) {
        Path pathToBinary = Paths.get("src/test/resources/TestClass/binary");
        AnalysisInputLocation inputLocation = PathBasedAnalysisInputLocation.create(pathToBinary, null);

        View view = new JavaView(inputLocation);

        String className = "testGoto";
        SootClass sootClass = view.getClass(view.getIdentifierFactory().getClassType(className)).get();

        Set<? extends SootMethod> methods = sootClass.getMethods();

        int gotoCount = 0;

        for (SootMethod method : methods) {
            System.out.println("Analyzing method: " + method.getName());
            System.out.println(method.getBody());
            Body body = method.getBody();
            for (Stmt stmt : body.getStmts()) {
                if (stmt instanceof JGotoStmt) {
                    System.out.println("Found goto statement: " + stmt);
                    gotoCount++;
                }
                else if (stmt instanceof JIfStmt) {
                    System.out.println("Found if statement: " + stmt);
                    gotoCount++;
                }
                else if (stmt instanceof JSwitchStmt) {
                    System.out.println("Found switch statement: " + stmt);
                    gotoCount++;
                }
            }
        }

        System.out.println("Total goto statements: " + gotoCount);
    }
}
