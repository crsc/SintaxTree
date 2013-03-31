package calculators;

import types.Type;
import types.DoubleType;
import types.IntegerType;
import anotations.OperatorSymbol;
import tree.*;

public class NumberCalculator extends Calculator {
    
    @OperatorSymbol(symbol="+")
    public Type add(DoubleType arg0, DoubleType arg1) {
        return new DoubleType(arg0.getValue() + arg1.getValue());
    }

    @OperatorSymbol(symbol="+")
    public Type add(DoubleType arg0, IntegerType arg1) {
        return new DoubleType(arg0.getValue() + arg1.getValue());
    }
   
    @OperatorSymbol(symbol="+")
    public Type add(IntegerType arg0, DoubleType arg1) {
        return new DoubleType(arg0.getValue() + arg1.getValue());
    }
    
    @OperatorSymbol(symbol="+")
    public Type add(IntegerType arg0, IntegerType arg1) {
        return new IntegerType(arg0.getValue() + arg1.getValue());
    }
    
    @OperatorSymbol(symbol="-")
    public Type substract(DoubleType arg0, DoubleType arg1){
        return new DoubleType(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorSymbol(symbol="-")
    public Type substract(DoubleType arg0, IntegerType arg1){
        return new DoubleType(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorSymbol(symbol="-")
    public Type substract(IntegerType arg0, DoubleType arg1){
        return new DoubleType (arg0.getValue() - arg1.getValue());
    }
    
    @OperatorSymbol(symbol="-")
    public Type substract(IntegerType arg0, IntegerType arg1){
        return new IntegerType(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorSymbol(symbol="*")
    public Type product(DoubleType arg0, DoubleType arg1) {
        return new DoubleType(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorSymbol(symbol="*")
    public Type product(DoubleType arg0, IntegerType arg1) {
        return new DoubleType(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorSymbol(symbol="*")
    public Type product(IntegerType arg0, DoubleType arg1) {
        return new DoubleType(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorSymbol(symbol="*")
    public Type product(IntegerType arg0, IntegerType arg1) {
        return new IntegerType(arg0.getValue() * arg1.getValue());
    }
}
