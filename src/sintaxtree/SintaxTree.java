/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtree;

import RealNodes.ConstantNumberNode;
import BinaryRealOperationNodes.SumOperatorNode;
import RealNodes.RealNode;
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
        RealNode num1 = new ConstantNumberNode(1);
        RealNode num2 = new ConstantNumberNode(2);
        RealNode num3 = new ConstantNumberNode(3);
        
        RealNode multiplicacion = new MultiplicationOperatorNode(num2, num3);
        RealNode suma = new SumOperatorNode(num1,multiplicacion);
        
        System.out.println(suma.evaluate());
        
        LogicNode data1 = new LogicDataNode(true);
        LogicNode data2 = new LogicDataNode(false);
        LogicNode data3 = new LogicDataNode(true);
        LogicNode andOperation = new AndLogicOperatorNode(data1, data2);
        LogicNode orOperation = new OrLogicOperatorNode(andOperation, data3);
        
        System.out.println(orOperation.evaluate());
    }
}
