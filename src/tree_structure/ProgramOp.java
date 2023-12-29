package tree_structure;

import java.util.ArrayList;
import java.util.Objects;

interface FunctionOrProcedure{
     Object accept(Visitor v);
}

public class ProgramOp extends Node{
    private ArrayList<VarDeclOp> varDeclList;
    private ArrayList<? extends FunctionOrProcedure> funProcList;

    public ProgramOp(ArrayList<VarDeclOp> varDeclList, ArrayList<? extends FunctionOrProcedure> funProcList) {
        this.varDeclList = varDeclList;
        this.funProcList = funProcList;
    }

    @Override
    public String toString() {
        return "ProgramOp{" +
                "varDeclList=" + varDeclList +
                ", funProcList=" + funProcList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProgramOp programOp)) return false;
        return Objects.equals(getVarDeclList(), programOp.getVarDeclList()) && Objects.equals(getFunProcList(), programOp.getFunProcList());
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

    public ArrayList<? extends FunctionOrProcedure> getFunProcList() {
        return funProcList;
    }

    public void setFunProcList(ArrayList<? extends FunctionOrProcedure> funProcList) {
        this.funProcList = funProcList;
    }
}
