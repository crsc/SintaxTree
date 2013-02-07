/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtree;

import RealNodes.NumberNode;
import BinaryRealOperationNodes.SumOperatorNode;
import RealNodes.Node;
import BinaryRealOperationNodes.MultiplicationOperatorNode;
import LogicNodes.AndLogicOperatorNode;
import LogicNodes.LogicBinaryOperatorNode;
import LogicNodes.LogicDataNode;
import LogicNodes.OrLogicOperatorNode;
import LogicNodes.LogicNode;

/**
 *
 * @author Cristian
 */
public class SintaxTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node num1 = new NumberNode(1);
        Node num2 = new NumberNode(2);
        Node num3 = new NumberNode(3);
        
        Node multiplicacion = new MultiplicationOperatorNode(num2, num3);
        Node suma = new SumOperatorNode(num1,multiplicacion);
        
        System.out.println(suma.evaluate());
        
        LogicNode data1 = new LogicDataNode(true);
        LogicNode data2 = new LogicDataNode(false);
        LogicNode data3 = new LogicDataNode(true);
        LogicNode andOperation = new AndLogicOperatorNode(data1, data2);
        LogicNode orOperation = new OrLogicOperatorNode(andOperation, data3);
        
        System.out.println(orOperation.evaluate());
    }
}
