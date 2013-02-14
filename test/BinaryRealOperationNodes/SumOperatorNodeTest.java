/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryRealOperationNodes;

import RealNodes.ConstantNumberNode;
import RealNodes.RealNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class SumOperatorNodeTest {
    
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate Sum");
        RealNode num1 = new ConstantNumberNode(1);
        RealNode num2 = new ConstantNumberNode(2);
        RealNode sum1 = new SumOperatorNode(num1,num2);
        double expResult = 3.0;
        assertEquals(expResult, sum1.evaluate(), 0.0);
        
        RealNode num0 = new ConstantNumberNode(0);
        RealNode sum2 = new SumOperatorNode(sum1,num0);
        assertEquals(expResult, sum2.evaluate(),0.0);
        
        RealNode numNegative = new ConstantNumberNode(-1);
        expResult-=1;
        RealNode sum3 = new SumOperatorNode(sum2,numNegative);
        assertEquals(expResult, sum3.evaluate(),0.0);
    }
}
