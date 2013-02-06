/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtree;

import Nodes.NumberNode;
import BinaryOperationNodes.SumNode;
import Nodes.Node;
import BinaryOperationNodes.MultiplicationNode;

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
        
        Node multiplicacion = new MultiplicationNode(num2, num3);
        Node suma = new SumNode(num1,multiplicacion);
        
        System.out.println(suma.evaluate());
    }
}
