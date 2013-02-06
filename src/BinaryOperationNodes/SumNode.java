/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryOperationNodes;

import BinaryOperationNodes.BinaryOperationNode;
import Nodes.Node;

/**
 *
 * @author Cristian
 */
public class SumNode extends BinaryOperationNode{

    public SumNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public int evaluate() {
        return (getLeftNode().evaluate()+getRightNode().evaluate());
    }
    
}
