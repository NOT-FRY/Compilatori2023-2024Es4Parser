package tree_structure.Expression;

import tree_structure.Node;
import tree_structure.Visitor;

public class  false_const extends Node implements Expression {
    private boolean value;

    @Override
    public String toString() {
        return "false_const{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof false_const that)) return false;
        return getValue() == that.getValue();
    }


    public  false_const() {
        this.value = false;
    }

    public boolean getValue() {
        return value;
    }


    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}