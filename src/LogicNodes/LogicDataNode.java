/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicNodes;

/**
 *
 * @author Cristian
 */
public class LogicDataNode extends LogicNode{
    
    private boolean value;

    public LogicDataNode(boolean value) {
        this.value = value;
    }
    
    @Override
    public boolean evaluate() {
        return this.value;
    }
    
}
