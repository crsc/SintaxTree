/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicNodes;

/**
 *
 * @author Cristian
 */
public abstract class LogicBinaryOperatorNode extends LogicNode{
    
    private LogicNode leftNode;
    private LogicNode rightNode;   

    public LogicBinaryOperatorNode(LogicNode leftNode, LogicNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public LogicNode getLeftNode() {
        return leftNode;
    }

    public LogicNode getRightNode() {
        return rightNode;
    }

}
