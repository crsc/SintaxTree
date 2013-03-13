package tree;

import tree.Operator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryOperatorTest {
    
    @Test
    public void testAddDoubleDouble() {
        Type t1 = new DoubleType(5.0);
        Constant d1 = new Constant(t1);
        Type t2 = new DoubleType(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.add, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testAddDoubleInteger() {
        Type t1 = new DoubleType(5.0);
        Constant d1 = new Constant(t1);
        Type t2 = new IntegerType(3);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.add, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testAddIntegerDouble() {
        Type t1 = new IntegerType(5);
        Constant d1 = new Constant(t1);
        Type t2 = new DoubleType(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.add, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testAddIntegerInteger() {
        Type t1 = new IntegerType(5);
        Constant d1 = new Constant(t1);
        Type t2 = new IntegerType(3);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.add, d1, d2);
        assertEquals(IntegerType.class, token.evaluate().getClass());
        assertEquals(Integer.class, token.evaluate().getValue().getClass());
        assertEquals(8.0, (Integer) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testSubstractDoubleDouble() {
        Type t1 = new DoubleType(5.0);
        Constant d1 = new Constant(t1);
        Type t2 = new DoubleType(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.substract, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(2.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testSubstractDoubleInteger() {
        Type t1 = new DoubleType(5.0);
        Constant d1 = new Constant(t1);
        Type t2 = new IntegerType(3);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.substract, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(2.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testSubstractIntegerDouble() {
        Type t1 = new IntegerType(5);
        Constant d1 = new Constant(t1);
        Type t2 = new DoubleType(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.substract, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(2.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testSubstractIntegerInteger() {
        Type t1 = new IntegerType(5);
        Constant d1 = new Constant(t1);
        Type t2 = new IntegerType(3);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.substract, d1, d2);
        assertEquals(IntegerType.class, token.evaluate().getClass());
        assertEquals(Integer.class, token.evaluate().getValue().getClass());
        assertEquals(2.0, (Integer) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testProductDoubleDouble() {
        Type t1 = new DoubleType(5.0);
        Constant d1 = new Constant(t1);
        Type t2 = new DoubleType(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.product, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(15.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testProductDoubleInteger() {
        Type t1 = new DoubleType(5.0);
        Constant d1 = new Constant(t1);
        Type t2 = new IntegerType(3);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.product, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(15.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testProductIntegerDouble() {
        Type t1 = new IntegerType(5);
        Constant d1 = new Constant(t1);
        Type t2 = new DoubleType(3.0);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.product, d1, d2);
        assertEquals(DoubleType.class, token.evaluate().getClass());
        assertEquals(Double.class, token.evaluate().getValue().getClass());
        assertEquals(15.0, (Double) token.evaluate().getValue(), 0.001);
    }
    
    @Test
    public void testProductIntegerInteger() {
        Type t1 = new IntegerType(5);
        Constant d1 = new Constant(t1);
        Type t2 = new IntegerType(3);
        Constant d2 = new Constant(t2);
        Token token = new BinaryOperation(Operator.product, d1, d2);
        assertEquals(IntegerType.class, token.evaluate().getClass());
        assertEquals(Integer.class, token.evaluate().getValue().getClass());
        assertEquals(15.0, (Integer) token.evaluate().getValue(), 0.001);
    }
}
