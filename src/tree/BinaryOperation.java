package tree;

import types.Type;
import types.DoubleType;
import types.IntegerType;
import calculators.*;
import calculators.NumberCalculator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryOperation extends Operation {
    private Operator operation;
    private Token leftChild;
    private Token rightChild;

    public BinaryOperation(Operator operation, Token leftChild, Token rightChild) {
        this.operation = operation;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    @Override
    public Type evaluate() {
        Type left = leftChild.evaluate();
        Type right = rightChild.evaluate();
        return execute(left, right);
    }

    private Type execute(Type left, Type right) {
        try {
            Method method = CalculatorsMethods.methodsMap.get(getSignature(left, right));
            return (Type)(method.invoke(method.getDeclaringClass().newInstance(),left, right));
        }
        catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            System.out.println(ex);
            return null;
        }
        
    }
    
    private String getSignature(Type left, Type right){
        String signature = operation.getName()+ left.getClass().getSimpleName()+right.getClass().getSimpleName();
        return signature;
    }

}
