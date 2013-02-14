
package UnaryRealOperationNodes;

import RealNodes.ConstantNumberNode;
import RealNodes.RealNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AbsoluteValueOperationNodeTest {
    
    @Test
    public void testEvaluate() {
        RealNode num1 = new ConstantNumberNode(1);
        RealNode negativeNum2 = new ConstantNumberNode(-2);
        RealNode abso1 = new AbsoluteValueOperationNode(num1);
        RealNode abso2 = new AbsoluteValueOperationNode(negativeNum2);
        assertEquals(1,abso1.evaluate(),0);
        assertEquals(2,abso2.evaluate(),0);
        
    }
}
