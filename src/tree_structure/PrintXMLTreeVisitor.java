package tree_structure;
import tree_structure.Expression.*;
import tree_structure.Expression.Expression;

import tree_structure.Statement.*;
import tree_structure.Statement.Statement;

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

        a.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

         a.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</AddOp>");
        return null;
    }

    @Override
    public Object visit(AndOp a) {
        out.println("<AndOp>");
        out.println("<leftVal>");

        a.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        a.getRight().accept(this);
        out.println("</rightVal>");
        out.println("</AndOp>");

        return null;
    }

    @Override
    public Object visit(AssignStatement a) {
        out.println("<AssignStatement>");
        ArrayList<Identifier> identifiers = a.getIdentifiers();
        for(Identifier i : identifiers){
            i.accept(this);
        }
        ArrayList<Expression> expressions = a.getExpressions();
        for(Expression e : expressions){
            e.accept(this);
        }
        out.println("</AssignStatement>");
        return null;
    }

    @Override
    public Object visit(BodyOp b) {
        out.println("<BodyOp>");
        ArrayList<VarDeclInterface> varDeclList = b.getVarDeclList();
        for(VarDeclInterface v : varDeclList){
            if(v instanceof VarDeclOp)
                visit((VarDeclOp) v);
            else if(v instanceof  AssignStatement)
                visit((AssignStatement) v);
        }
        ArrayList<Statement> statements = b.getStatementList();
        for(Statement s : statements){
            s.accept(this);
        }
        out.println("</BodyOp>");
        return null;
    }

    @Override
    public Object visit(DiffOp d) {
        out.println("<DiffOp>");
        out.println("<leftVal>");

        d.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        d.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</DiffOp>");

        return null;
    }

    @Override
    public Object visit(DivOp d) {
        out.println("<DivOp>");
        out.println("<leftVal>");

        d.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        d.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</DivOp>");
        return null;
    }

    @Override
    public Object visit(ElifOp e) {
        out.println("<ElifOp>");
        e.getExpression().accept(this);
        e.getBody().accept(this);
        out.println("</ElifOp>");
        return null;
    }

    @Override
    public Object visit(EQOp e) {
        out.println("<EQOp>");
        out.println("<leftVal>");

        e.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        e.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</EQOp>");

        return null;
    }

    @Override
    public Object visit(False_const f) {
        out.println("<false_const>");
        out.println(f.getValue());
        out.println("</false_const>");
        return null;
    }

    @Override
    public Object visit(FunCallOp f) {
        out.println("<FunCallOp>");
        f.getIdentifier().accept(this);
        ArrayList<Expression> expressions = f.getExpressions();
        for(Expression e : expressions){
            e.accept(this);
        }
        out.println("</FunCallOp>");
        return null;
    }

    @Override
    public Object visit(FunctionOp f) {
        out.println("<FunctionOp>");
        f.getIdentifier().accept(this);
        ArrayList<ProcFunParamOp> paramOps = f.getProcFunParamOpList();
        for(ProcFunParamOp p : paramOps){
            p.accept(this);
        }
        ArrayList<Type> types = f.getReturnTypes();
        out.println("<ReturnTypes>");
        for(Type t : types){
            out.println(t);
        }
        out.println("</ReturnTypes>");
        f.getBody().accept(this);
        out.println("</FunctionOp>");
        return null;
    }

    @Override
    public Object visit(GEOp g) {
        out.println("<GEOp>");
        out.println("<leftVal>");

        g.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        g.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</GEOp>");

        return null;
    }

    @Override
    public Object visit(GTOp g) {
        out.println("<GTOp>");
        out.println("<leftVal>");

        g.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        g.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</GTOp>");

        return null;
    }

    @Override
    public Object visit(Identifier i) {
        Qualifier q = i.getQualifier();
        String qualifierString ="";
        if(q!=null){
            qualifierString += " qualifier='";
            qualifierString += q.toString();
            qualifierString +="'";
        }
        out.println("<Identifier" + qualifierString + ">");
        out.println(i.getName());
        out.println("</Identifier>");
        return null;
    }

    @Override
    public Object visit(IfStatement i) {
        out.println("<IfStatement>");
        i.getExpression().accept(this);
        i.getBody().accept(this);
        ArrayList<ElifOp> elifOps = i.getElifList();
        for(ElifOp p : elifOps) {
            p.accept(this);
        }
        i.getElseBody().accept(this);
        out.println("</IfStatement>");

        return null;
    }

    @Override
    public Object visit(Integer_const i) {
        out.println("<Integer_const>");
        out.println(i.getValue());
        out.println("</Integer_const>");
        return null;
    }

    @Override
    public Object visit(LEOp l) {
        out.println("<LEOp>");
        out.println("<leftVal>");

        l.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        l.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</LEOp>");

        return null;
    }

    @Override
    public Object visit(LTOp l) {
        out.println("<LTOp>");
        out.println("<leftVal>");

        l.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        l.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</LTOp>");

        return null;
    }

    @Override
    public Object visit(MulOp m) {
        out.println("<MulOp>");
        out.println("<leftVal>");

        m.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        m.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</MulOp>");
        return null;
    }

    @Override
    public Object visit(NEOp n) {
        out.println("<NEOp>");
        out.println("<leftVal>");

        n.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        n.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</NEOp>");

        return null;
    }

    @Override
    public Object visit(NotOp n) {
        out.println("<NotOp>");
        out.println("<value>");

        n.getValue().accept(this);

        out.println("</value>");
        out.println("</NotOp>");
        return null;
    }

    @Override
    public Object visit(OrOp o) {
        out.println("<OrOp>");
        out.println("<leftVal>");

        o.getLeft().accept(this);

        out.println("</leftVal>");
        out.println("<rightVal>");

        o.getRight().accept(this);

        out.println("</rightVal>");
        out.println("</OrOp>");

        return null;
    }

    @Override
    public Object visit(ProcFunParamOp p) {
        out.println("<ProcFunParamOp>");
        p.getIdentifier().accept(this);
        Type type = p.getType();
        out.println("<Type>");
        out.println(type);
        out.println("</Type>");
        out.println("</ProcFunParamOp>");
        return null;
    }

    @Override
    public Object visit(ProcedureOp p) {
        out.println("<ProcedureOp>");
        p.getIdentifier().accept(this);
        ArrayList<ProcFunParamOp> paramOps = p.getProcFunParamOpList();
        for(ProcFunParamOp pr : paramOps){
            pr.accept(this);
        }
        p.getBody().accept(this);
        out.println("</ProcedureOp>");
        return null;
    }

    @Override
    public Object visit(ProgramOp p) {
        out.println("<ProgramOp>");
        ArrayList<VarDeclInterface> varDeclList = p.getVarDeclList();
        for(VarDeclInterface v : varDeclList){
            if(v instanceof VarDeclOp)
                visit((VarDeclOp) v);
            else if(v instanceof  AssignStatement)
                visit((AssignStatement) v);
        }
        ArrayList<? extends FunctionOrProcedure> paramOps = p.getFunProcList();
        for(FunctionOrProcedure n : paramOps){
            n.accept(this);
        }
        out.println("</ProgramOp>");
        return null;
    }

    @Override
    public Object visit(ReadStatement r) {
        out.println("<ReadStatement>");
        ArrayList<Expression> expressions = r.getExpressions();
        for(Expression v : expressions ){
            v.accept(this);
        }
        out.println("</ReadStatement>");
        return null;
    }

    @Override
    public Object visit(Real_const r) {
        out.println("<Real_const>");
        out.println(r.getValue());
        out.println("</Real_const>");
        return null;
    }

    @Override
    public Object visit(ReturnStatement r) {
        out.println("<ReturnStatement>");
        out.println("<Values>");
        ArrayList<Expression> expressions = r.getExpressions();
        for(Expression e : expressions){
            e.accept(this);
        }
        out.println("</Values>");
        out.println("</ReturnStatement>");
        return null;
    }

    @Override
    public Object visit(String_const s) {
        out.println("<String_const>");
        out.println(s.getValue());
        out.println("</String_const>");
        return null;
    }

    @Override
    public Object visit(True_const t) {
        out.println("<True_const>");
        out.println(t.getValue());
        out.println("</True_const>");
        return null;
    }

    @Override
    public Object visit(UminusOp u) {
        out.println("<UminusOp>");
        out.println("<Value>");

        u.getValue().accept(this);

        out.println("</Value>");
        out.println("</UminusOp>");
        return null;
    }

    @Override
    public Object visit(VarDeclOp v) {
        out.println("<VarDeclOp>");
        ArrayList<Expression> Expressions = v.getExpressionList();
        for(Expression i : Expressions ){
            i.accept(this);
        }
        Type type = v.getType();
        out.println("<Type>");
        out.println(type);
        out.println("</Type>");
        out.println("</VarDeclOp>");

        return null;
    }

    @Override
    public Object visit(WhileStatement w) {
        out.println("<WhileStatement>");
        w.getExpression().accept(this);
        w.getBody().accept(this);
        out.println("</WhileStatement>");
        return null;
    }

    @Override
    public Object visit(WriteStatement w) {
        out.println("<WriteStatement>");
        WritingType writingType = w.getWritingType();
        out.println("<WritingType>");
        out.println(writingType);
        out.println("</WritingType>");
        ArrayList<Expression> expressions = w.getExpressions();
        for(Expression e : expressions) {
            e.accept(this);
        }
        out.println("</WriteStatement>");
        return null;
    }

    @Override
    public Object visit(ElseOp e) {
        out.println("<ElseOp>");
        e.getBody().accept(this);
        out.println("</ElseOp>");
        return null;
    }

    @Override
    public Object visit(IterOp i) {
        out.println("<IterOp>");
        ArrayList<VarDeclInterface> varDeclList = i.getVarDeclList();
        for(VarDeclInterface v : varDeclList){
            if(v instanceof VarDeclOp)
                visit((VarDeclOp) v);
            else if(v instanceof  AssignStatement)
                visit((AssignStatement) v);
        }
        ArrayList<? extends FunctionOrProcedure> paramOps = i.getFunProcList();
        for(FunctionOrProcedure n : paramOps){
            n.accept(this);
        }
        out.println("</IterOp>");
        return null;
    }

    @Override
    public Object visit(IOArg i) {
        out.println("<IOArg>");
        if(i.isDollarSign()){
            out.println("<DollarSign>");
            out.println("</DollarSign>");
        }
        i.getExpression().accept(this);
        out.println("</IOArg>");
        return null;
    }

    public Object visit(ProcedureExpression p) {

        if(p.getIdentifier()!=null) {
            out.println("<ProcedureExpression reference = '"+p.isReference() +"'>");
            p.getIdentifier().accept(this);
        }else{
            out.println("<ProcedureExpression>");
        }
        if(p.getExpression()!=null)
            p.getExpression().accept(this);
        out.println("</ProcedureExpression>");
        return null;
    }

    @Override
    public Object visit(ProcCallOp p) {
        out.println("<ProcCallOp>");
        ArrayList<ProcedureExpression> Expressions = p.getProcedureExpressions();
        for(ProcedureExpression i : Expressions ){
            i.accept(this);
        }
        p.getIdentifier().accept(this);
        out.println("</ProcCallOp>");
        return null;
    }
}
