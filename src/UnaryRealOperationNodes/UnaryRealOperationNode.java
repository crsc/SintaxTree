/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnaryRealOperationNodes;

import RealNodes.RealNode;
import RealNodes.RealOperationNode;

/**
 *
 * @author Cristian
 */
public abstract class UnaryRealOperationNode extends RealOperationNode{
    private RealNode children;
    
    public UnaryRealOperationNode(RealNode children){
        this.children=children;
    }

    public RealNode getChildren() {
        return children;
    }
    //TODO unary operations
}
