/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RealNodes;

/**
 *
 * @author Cristian
 */
public class NumberNode extends Node{
    private double number;
    
    public NumberNode(double number){
        this.number=number;
    }

    public double evaluate(){
        return this.number;
    }

}
