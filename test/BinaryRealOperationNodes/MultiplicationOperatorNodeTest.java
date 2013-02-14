package BinaryRealOperationNodes;

import RealNodes.ConstantNumberNode;
import RealNodes.RealNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MultiplicationOperatorNodeTest {
  
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate Multiplication");
        RealNode num1 = new ConstantNumberNode(1);
        RealNode num2 = new ConstantNumberNode(2);
        RealNode mult1 = new MultiplicationOperatorNode(num1,num2);

        assertEquals(2, mult1.evaluate(), 0.0);
        
        RealNode num0 = new ConstantNumberNode(0);
        RealNode mult2 = new MultiplicationOperatorNode(mult1,num0);
        assertEquals(0.0, mult2.evaluate(),0.0);
        
        RealNode numNegative = new ConstantNumberNode(-1);
        RealNode mult3 = new MultiplicationOperatorNode(mult1,numNegative);
        assertEquals(-2, mult3.evaluate(),0.0);
    }
}
