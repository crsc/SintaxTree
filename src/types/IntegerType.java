
package types;


public class IntegerType extends Type<Integer>{

    public IntegerType(Integer value) {
        super(value);
    }
    
    @Override
    public String toString(){
        return Integer.toString(getValue());
    }
    
}
