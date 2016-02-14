// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import pers.xia.jpython.parser.PythonNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class Assert extends stmtType {
    public exprType test;
    public exprType msg;

    public Assert(exprType test, exprType msg) {
        this.test = test;
        this.msg = msg;
    }

    public Assert(exprType test, exprType msg, PythonNode parent) {
        this(test, msg);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        return "Assert";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitAssert(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}