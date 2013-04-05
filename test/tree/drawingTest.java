package tree;

import org.junit.Test;
import static org.junit.Assert.*;
import types.IntegerType;
import types.DoubleType;

public class drawingTest {

    @Test
    public void testIntegerToString() {
        IntegerType arg1 = new IntegerType(2);
        assertEquals("2",arg1.toString());
    }
    
    @Test
    public void testDoubleToString() {
        DoubleType arg1 = new DoubleType(2.0);
        assertEquals("2.0",arg1.toString());
    }
    
    @Test
    public void testBinaryOperationToString() {
        Constant c1 = new Constant(new IntegerType(2));
        Constant c2 = new Constant(new IntegerType(3));
        Constant c3 = new Constant(new IntegerType(5));
        BinaryOperation Operation1 = new BinaryOperation(Operator.product, c2, c3);
        BinaryOperation Operation2 = new BinaryOperation(Operator.add, c1, Operation1);
        assertEquals("(2+(3*5))",Operation2.toString());
    }
    
}