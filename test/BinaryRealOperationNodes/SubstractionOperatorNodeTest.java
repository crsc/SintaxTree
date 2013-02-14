package BinaryRealOperationNodes;

import RealNodes.ConstantNumberNode;
import RealNodes.RealNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubstractionOperatorNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("Evaluate Substraction");
        RealNode num1 = new ConstantNumberNode(1);
        RealNode num2 = new ConstantNumberNode(2);
        RealNode subs1 = new SubstractionOperatorNode(num2,num1);
        assertEquals(1, subs1.evaluate(), 0.0);
        
        RealNode num0 = new ConstantNumberNode(0);
        RealNode subs2 = new SubstractionOperatorNode(subs1,num0);
        assertEquals(1, subs2.evaluate(),0.0);
        
        RealNode numNegative = new ConstantNumberNode(-1);
        RealNode subs3 = new SubstractionOperatorNode(subs1,numNegative);
        assertEquals(2, subs3.evaluate(),0.0);
    }
}
