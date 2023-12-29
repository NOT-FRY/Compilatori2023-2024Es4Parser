package tree_structure;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PrintXMLTreeVisitor implements Visitor {

    PrintWriter out;

    public PrintXMLTreeVisitor(String filename) throws FileNotFoundException {
        out = new PrintWriter(filename+".xml");
    }

    public void dispose(){
        out.close();
    }

    @Override
    public Object visit(AddOp a) {
        out.println("<AddOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) a.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) a.getRight().accept(this);
        out.println(rightVal);
        out.println("</rightVal>");
        out.println("</AddOp>");
        return null;
    }

    @Override
    public Object visit(AndOp a) {
        out.println("<AndOp>");
        out.println("<leftVal>");
        boolean leftVal =
                (Boolean) a.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        boolean rightVal =
                (Boolean) a.getRight().accept(this);
        out.println(rightVal);
        out.println("</rightVal>");
        out.println("</AndOp>");

        return null;
    }

    @Override
    public Object visit(AssignStatement a) {
        out.println("AssignStatement");
        ArrayList<Identifier> identifiers = a.getIdentifiers();
        for(Identifier i : identifiers){
            i.accept(this);
        }
        ArrayList<Expression> expressions = a.getExpressions();
        for(Expression e : expressions){
            e.accept(this);
        }
        out.println("/AssignStatement");
        return null;
    }

    @Override
    public Object visit(BodyOp b) {
        out.println("BodyOp");
        ArrayList<VarDeclOp> varDeclList = b.getVarDeclList();
        for(VarDeclOp v : varDeclList){
            v.accept(this);
        }
        ArrayList<Statement> statements = b.getStatementList();
        for(Statement s : statements){
            s.accept(this);
        }
        out.println("/BodyOp");
        return null;
    }

    @Override
    public Object visit(DiffOp d) {
        out.println("<DiffOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) d.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) d.getRight().accept(this);
        out.println(rightVal);
        out.println("</rightVal>");
        out.println("</DiffOp>");

        return null;
    }

    @Override
    public Object visit(DivOp d) {
        out.println("<DivOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) d.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) d.getRight().accept(this);
        out.println(rightVal);
        out.println("</rightVal>");
        out.println("</DivOp>");
        return null;
    }

    @Override
    public Object visit(ElifOp e) {
        out.println("ElifOp");
        e.getExpression().accept(this);
        e.getBody().accept(this);
        out.println("/ElifOp");
        return null;
    }

    @Override
    public Object visit(EQOp e) {
        out.println("<EQOp>");
        out.println("<leftVal>");
        Expression leftVal =
                (Expression) e.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        Expression rightVal =
                (Expression) e.getRight().accept(this);
        out.println(rightVal);
        out.println("</rightVal>");
        out.println("</EQOp>");

        return null;
    }

    @Override
    public Object visit(false_const f) {
        out.println("<false_const>");
        out.println(f.getValue());
        out.println("</false_const>");
        return null;
    }

    @Override
    public Object visit(FunCallOp f) {
        out.println("FunCallOp");
        f.getIdentifier().accept(this);
        ArrayList<Expression> expressions = f.getExpressions();
        for(Expression e : expressions){
            e.accept(this);
        }
        out.println("/FunCallOp");
        return null;
    }

    @Override
    public Object visit(FunctionOp f) {
        out.println("FunctionOp");
        f.getIdentifier().accept(this);
        ArrayList<ProcFunParamOp> paramOps = f.getProcFunParamOpList();
        for(ProcFunParamOp p : paramOps){
            p.accept(this);
        }
        ArrayList<Type> types = f.getProcFunTypes();
        out.println("Types");
        for(Type t : types){
            out.println(t);
        }
        out.println("/Types");
        out.println("/FunctionOp");
        return null;
    }

    @Override
    public Object visit(GEOp g) {
        out.println("<GEOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) g.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) g.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/GEOp");

        return null;
    }

    @Override
    public Object visit(GTOp g) {
        out.println("<GTOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) g.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) g.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/GTOp");

        return null;
    }

    @Override
    public Object visit(IfStatement i) {
        return null;
    }

    @Override
    public Object visit(integer_const i) {
        out.println("<integer_const>");
        out.println(i.getValue());
        out.println("</integer_const>");
        return null;
    }

    @Override
    public Object visit(LEOp l) {
        out.println("<LEOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) l.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) l.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/LEOp");

        return null;
    }

    @Override
    public Object visit(LTOp l) {
        out.println("<LTOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) l.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) l.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/LTOp");

        return null;
    }

    @Override
    public Object visit(MulOp m) {
        out.println("<MulOp>");
        out.println("<leftVal>");
        int leftVal =
                (Integer) m.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        int rightVal =
                (Integer) m.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/MulOp");
        return null;
    }

    @Override
    public Object visit(NEOp n) {
        out.println("<NEOp>");
        out.println("<leftVal>");
        Expression leftVal =
                (Expression) n.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        Expression rightVal =
                (Expression) n.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/NEOp");

        return null;
    }

    @Override
    public Object visit(NotOp n) {
        out.println("<Notp>");
        out.println("value");
        boolean value =
                (Boolean) n.getValue().accept(this);
        out.println(value);
        out.println("/value");
        out.println("/NotOp");
        return null;
    }

    @Override
    public Object visit(OrOp o) {
        out.println("<OrOp>");
        out.println("<leftVal>");
        boolean leftVal =
                (Boolean) o.getLeft().accept(this);
        out.println(leftVal);
        out.println("</leftVal>");
        out.println("<rightVal>");
        boolean rightVal =
                (Boolean) o.getRight().accept(this);
        out.println(rightVal);
        out.println("/rightVal");
        out.println("/OrOp");

        return null;
    }

    @Override
    public Object visit(ProcFunParamOp p) {
        return null;
    }

    @Override
    public Object visit(ProgramOp p) {
        return null;
    }

    @Override
    public Object visit(ReadStatement r) {
        return null;
    }

    @Override
    public Object visit(real_const r) {
        out.println("<real_const>");
        out.println(r.getValue());
        out.println("</real_const>");
        return null;
    }

    @Override
    public Object visit(ReturnStatement r) {
        return null;
    }

    @Override
    public Object visit(string_const s) {
        out.println("<string_const>");
        out.println(s.getValue());
        out.println("</string_const>");
        return null;
    }

    @Override
    public Object visit(true_const t) {
        out.println("<true_const>");
        out.println(t.getValue());
        out.println("</true_const>");
        return null;
    }

    @Override
    public Object visit(UminusOp u) {
        out.println("<UminusOp>");
        out.println("value");
        Expression value =
                (Expression) u.getValue().accept(this);
        out.println(value);
        out.println("/value");
        out.println("/UminusOp");
        return null;
    }

    @Override
    public Object visit(VarDeclOp v) {
        return null;
    }

    @Override
    public Object visit(WhileStatement w) {
        return null;
    }

    @Override
    public Object visit(WriteStatement w) {
        return null;
    }
}
