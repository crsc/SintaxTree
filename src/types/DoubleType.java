
package types;

public class DoubleType extends Type<Double>{

    public DoubleType(Double value) {
        super(value);
    }
    
    @Override
    public String toString(){
        return Double.toString(getValue());
    }
   
}
