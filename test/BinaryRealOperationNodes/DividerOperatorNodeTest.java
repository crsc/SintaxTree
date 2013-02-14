
package BinaryRealOperationNodes;

import RealNodes.ConstantNumberNode;
import RealNodes.RealNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DividerOperatorNodeTest {
    
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate Divider");
        RealNode num1 = new ConstantNumberNode(1);
        RealNode num2 = new ConstantNumberNode(2);
        RealNode div1 = new DividerOperatorNode(num1,num2);
        assertEquals(0.5, div1.evaluate(), 0.0);
        
        RealNode num0 = new ConstantNumberNode(0);
        RealNode div2 = new DividerOperatorNode(div1,num0);
        assertEquals(Double.POSITIVE_INFINITY, div2.evaluate(),0.0);
        
        RealNode numNegative = new ConstantNumberNode(-1);
        RealNode div3 = new DividerOperatorNode(div1,numNegative);
        assertEquals(-0.5, div3.evaluate(),0.0);
        
        RealNode div4 = new DividerOperatorNode(numNegative,num0);
        assertEquals(Double.NEGATIVE_INFINITY,div4.evaluate(),0.0);
    }
}
