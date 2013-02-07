/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryRealOperationNodes;

import RealNodes.Node;

/**
 *
 * @author Cristian
 */
public class DividerOperatorNode extends BinaryOperationNode{

    public DividerOperatorNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate()/getRightNode().evaluate());
    }
    
}
