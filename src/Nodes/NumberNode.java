/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

/**
 *
 * @author Cristian
 */
public class NumberNode extends Node{
    private int number;
    
    public NumberNode(int number){
        this.number=number;
    }

    public int evaluate(){
        return this.number;
    }

}
