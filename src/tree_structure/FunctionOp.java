package tree_structure;

import java.util.ArrayList;

public class FunctionOp extends Node{

    private Identifier identifier;
    private ArrayList<ProcFunParamOp> procFunParamOpList;
    private ArrayList<Type> procFunTypes;

    private BodyOp body;

    public FunctionOp(Identifier identifier, ArrayList<ProcFunParamOp> procFunParamOpList, ArrayList<Type> procFunTypes, BodyOp body) {
        this.identifier = identifier;
        this.procFunParamOpList = procFunParamOpList;
        this.procFunTypes = procFunTypes;
        this.body = body;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ArrayList<ProcFunParamOp> getProcFunParamOpList() {
        return procFunParamOpList;
    }

    public void setProcFunParamOpList(ArrayList<ProcFunParamOp> procFunParamOpList) {
        this.procFunParamOpList = procFunParamOpList;
    }

    public ArrayList<Type> getProcFunTypes() {
        return procFunTypes;
    }

    public void setProcFunTypes(ArrayList<Type> procFunTypes) {
        this.procFunTypes = procFunTypes;
    }

    public BodyOp getBody() {
        return body;
    }

    public void setBody(BodyOp body) {
        this.body = body;
    }

    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }




}
