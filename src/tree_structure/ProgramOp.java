package tree_structure;

import java.util.ArrayList;

public class ProgramOp extends Node{
    private ArrayList<VarDeclOp> varDeclList;
    private ArrayList<? extends Node> funProcList;

    public ProgramOp(ArrayList<VarDeclOp> varDeclList, ArrayList<? extends Node> funProcList) {
        this.varDeclList = varDeclList;
        this.funProcList = funProcList;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }

    public ArrayList<VarDeclOp> getVarDeclList() {
        return varDeclList;
    }

    public void setVarDeclList(ArrayList<VarDeclOp> varDeclList) {
        this.varDeclList = varDeclList;
    }

    public ArrayList<? extends Node> getFunProcList() {
        return funProcList;
    }

    public void setFunProcList(ArrayList<? extends Node> funProcList) {
        this.funProcList = funProcList;
    }
}
