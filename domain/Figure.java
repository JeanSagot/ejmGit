/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author jeanp
 */
public class Figure {
    
    //attributes
    private int sides;
    
    //Constructors
    public Figure() {
        this.sides = 0;
    }

    public Figure(int sides) {
        this.sides = sides;
    }
    
    //getters and setters

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
    
    //toString
    @Override
    public String toString() {
        return "Figure{" + "sides=" + sides + '}';
    }
}
