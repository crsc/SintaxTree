/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicNodes;

/**
 *
 * @author Cristian
 */
public abstract class LogicUnaryOperatorNode extends LogicNode{
    private LogicNode children;
    
    public LogicUnaryOperatorNode(LogicNode children){
        this.children=children;
    }
}
