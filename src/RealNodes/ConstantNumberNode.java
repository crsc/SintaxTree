/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RealNodes;

/**
 *
 * @author Cristian
 */
public class ConstantNumberNode extends RealNode{
    private double number;
    
    public ConstantNumberNode(double number){
        this.number=number;
    }

    public double evaluate(){
        return this.number;
    }

}
