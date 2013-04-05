package tree;

import types.Type;

public abstract class Token {
    
    public abstract Type evaluate();
    
    @Override
    public abstract String toString();

}
