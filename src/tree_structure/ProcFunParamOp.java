package tree_structure;

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
