/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RealNodes;

/**
 *
 * @author Cristian
 */
public class VariableNumberNode extends RealNode{

    double variable;

    public VariableNumberNode(double variable) {
        this.variable = variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }
    
    @Override
    public double evaluate() {
        return this.variable;
    }
    
}
