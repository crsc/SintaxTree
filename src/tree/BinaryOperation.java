package tree;

import types.Type;
import types.DoubleType;
import types.IntegerType;
import calculators.*;
import calculators.NumberCalculator;
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
        return execute(findCalculator(left, right), left, right);
    }

    private Calculator findCalculator(Type left, Type right) {
        if (left == null) return null;
        if (right == null) return null;
        if ((left instanceof DoubleType) && (right instanceof DoubleType))
            return new NumberCalculator();
        if ((left instanceof IntegerType) && (right instanceof DoubleType))
            return new NumberCalculator();
        if ((left instanceof DoubleType) && (right instanceof IntegerType))
            return new NumberCalculator();
        if ((left instanceof IntegerType) && (right instanceof IntegerType))
            return new NumberCalculator();
        return null;
        
    }

    private Type execute(Calculator calculator, Type left, Type right) {
        if (calculator == null) return null;
        try {
            Method method = calculator.getClass().getMethod(operation.getName(), left.getClass(), right.getClass());
            return (Type)(method.invoke(calculator, left, right));
        }
        catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
        
    }

}
