/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryRealOperationNodes;

import RealNodes.Node;
import RealNodes.OperationNode;

/**
 *
 * @author Cristian
 */
public abstract class BinaryOperationNode extends OperationNode{
    private Node leftNode;
    private Node rightNode;

    public BinaryOperationNode(Node leftNode, Node rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }
    
    
}
