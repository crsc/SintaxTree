/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnaryOperationNodes;

import Nodes.Node;
import Nodes.OperationNode;

/**
 *
 * @author Cristian
 */
public abstract class UnaryOperationNode extends OperationNode{
    private Node children;
    
    public UnaryOperationNode(Node children){
        this.children=children;
    }

    public Node getChildren() {
        return children;
    }
    
    //TODO unary operations
}
