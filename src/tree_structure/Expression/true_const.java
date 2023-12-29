package tree_structure.Expression;

import tree_structure.Node;
import tree_structure.Visitor;

public class  true_const extends Node implements Expression {
    private boolean value;

    @Override
    public String toString() {
        return "true_const{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof true_const trueConst)) return false;
        return getValue() == trueConst.getValue();
    }

    public  true_const() {
        this.value = true;
    }

    public boolean getValue() {
        return value;
    }


    @Override
    public Object accept(Visitor v){
        return v.visit(this);
    }
}
