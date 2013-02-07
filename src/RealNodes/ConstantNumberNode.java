/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RealNodes;

/**
 *
 * @author Cristian
 */
public class ConstantNumberNode extends Node{
    
    double constant;

    public ConstantNumberNode(double constant) {
        this.constant = constant;
    }
    
    @Override
    public double evaluate() {
        return this.constant;
    }
    
}
