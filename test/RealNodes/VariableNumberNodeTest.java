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


public class VariableNumberNodeTest {

    @Test
    public void testSetVariable() {
        System.out.println("Set Variable");
        VariableNumberNode variable1 = new VariableNumberNode(0);
        variable1.setVariable(2);
        assertEquals(2,variable1.evaluate(),0);
    }

    /**
     * Test of evaluate method, of class VariableNumberNode.
     */
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate VariableNumberNode");
        RealNode variable1 = new VariableNumberNode(1);
        assertEquals(1,variable1.evaluate(),0);
    }
}
