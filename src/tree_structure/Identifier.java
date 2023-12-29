package tree_structure;

import tree_structure.Expression.Expression;

import java.util.Objects;

public class Identifier extends Node implements Expression {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identifier that)) return false;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public Object accept(Visitor v) {
        return null;
    }
}
