/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicNodes;

/**
 *
 * @author Cristian
 */
public class AndLogicOperatorNode extends LogicBinaryOperatorNode{

    public AndLogicOperatorNode(LogicNode leftNode, LogicNode rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public boolean evaluate() {
        return (getLeftNode().evaluate()&&getRightNode().evaluate());
    }   
}
