package tree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import types.*;

public class drawingTest {

    @Test
    public void testIntegerToString() {
        IntegerType mockArg1 = mock(IntegerType.class);
        when(mockArg1.toString()).thenReturn("2");
        assertEquals("2",mockArg1.toString());
    }
    
    @Test
    public void testDoubleToString() {
        DoubleType mockArg1 = mock(DoubleType.class);
        when(mockArg1.toString()).thenReturn("2.0");
        assertEquals("2.0",mockArg1.toString());
    }
    
    @Test
    public void testBinaryOperationToString() {
        BinaryOperation mockArg1 = mock(BinaryOperation.class);
        when(mockArg1.toString()).thenReturn("2+3*5");
        assertEquals("2+3*5",mockArg1.toString());
    }
    
}