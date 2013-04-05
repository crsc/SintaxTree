package tree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import types.IntegerType;
import types.DoubleType;

public class drawingTest {

    @Test
    public void testIntegerToString() {
        IntegerType Arg1 = new IntegerType(2);
        assertEquals("2",Arg1.toString());
    }
    
    @Test
    public void testDoubleToString() {
        DoubleType Arg1 = new DoubleType(2.0);
        assertEquals("2.0",Arg1.toString());
    }
    
    @Test
    public void testBinaryOperationToString() {
        BinaryOperation mockArg1 = mock(BinaryOperation.class);
        when(mockArg1.toString()).thenReturn("2+3*5");
        assertEquals("2+3*5",mockArg1.toString());
    }
    
}