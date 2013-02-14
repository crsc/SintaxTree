/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RealNodes;

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
public class ConstantNumberNodeTest {
    
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate ConstantNumberNode");
        RealNode num1 = new ConstantNumberNode(1);
        assertEquals(1, num1.evaluate(), 0.0);
    }
}
