package tree_structure;

import java.util.ArrayList;
import java.util.Objects;

public class FunctionOp extends Node implements FunctionOrProcedure{

    private Identifier identifier;
    private ArrayList<ProcFunParamOp> procFunParamOpList;
    private ArrayList<Type> returnTypes;

    private BodyOp body;

    public FunctionOp(Identifier identifier, ArrayList<ProcFunParamOp> procFunParamOpList, ArrayList<Type> returnTypes, BodyOp body) {
        this.identifier = identifier;
        this.procFunParamOpList = procFunParamOpList;
        this.returnTypes = returnTypes;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FunctionOp that)) return false;
        return Objects.equals(getIdentifier(), that.getIdentifier()) && Objects.equals(getProcFunParamOpList(), that.getProcFunParamOpList()) && Objects.equals(getReturnTypes(), that.getReturnTypes()) && Objects.equals(getBody(), that.getBody());
    }


    @Override
    public String toString() {
        return "FunctionOp{" +
                "identifier=" + identifier +
                ", procFunParamOpList=" + procFunParamOpList +
                ", procFunTypes=" + returnTypes +
                ", body=" + body +
                '}';
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

    public ArrayList<Type> getReturnTypes() {
        return returnTypes;
    }

    public void setReturnTypes(ArrayList<Type> returnTypes) {
        this.returnTypes = returnTypes;
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
