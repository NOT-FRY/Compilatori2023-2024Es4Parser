package tree_structure;

import java.util.Objects;

enum Qualifier {
    OUT,
    INOUT,
    IN
}
public class ProcFunParamOp extends Node{
    private Qualifier qualifier;
    private Identifier identifier;
    private Type type;

    public ProcFunParamOp(Qualifier qualifier, Identifier identifier, Type type) {
        this.qualifier = qualifier;
        this.identifier = identifier;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProcFunParamOp{" +
                "qualifier=" + qualifier +
                ", identifier=" + identifier +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcFunParamOp that)) return false;
        return getQualifier() == that.getQualifier() && Objects.equals(getIdentifier(), that.getIdentifier()) && getType() == that.getType();
    }


    public Qualifier getQualifier() {
        return qualifier;
    }

    public void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}
