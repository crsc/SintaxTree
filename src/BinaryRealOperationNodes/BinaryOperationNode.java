/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryRealOperationNodes;

import RealNodes.RealNode;
import RealNodes.RealOperationNode;

/**
 *
 * @author Cristian
 */
public abstract class BinaryOperationNode extends RealOperationNode{
    private RealNode leftNode;
    private RealNode rightNode;

    public BinaryOperationNode(RealNode leftNode, RealNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public RealNode getLeftNode() {
        return leftNode;
    }

    public RealNode getRightNode() {
        return rightNode;
    }
    
    
}
