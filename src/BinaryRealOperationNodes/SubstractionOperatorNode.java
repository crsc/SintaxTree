/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryRealOperationNodes;

import RealNodes.RealNode;

/**
 *
 * @author Cristian
 */
public class SubstractionOperatorNode extends BinaryOperationNode{

    public SubstractionOperatorNode(RealNode leftNode, RealNode rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate()-getRightNode().evaluate());
    }
    
}
