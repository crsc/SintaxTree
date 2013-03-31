package tree;

import types.Type;

public class Constant extends Token {
    private Type value;

    public Constant(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    @Override
    public Type evaluate() {
        return getValue();
    }
    
    
    
}
