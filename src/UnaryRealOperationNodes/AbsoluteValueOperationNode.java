/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnaryRealOperationNodes;

import RealNodes.RealNode;

/**
 *
 * @author Cristian
 */
public class AbsoluteValueOperationNode extends UnaryRealOperationNode{

    
    @Override
    public double evaluate() {
        return getChildren().evaluate()<0 ? -getChildren().evaluate() : getChildren().evaluate();
    }

    public AbsoluteValueOperationNode(RealNode children) {
        super(children);
    }
    
}
