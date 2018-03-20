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
public class Wheel {
    
    //attributes
    private int rim;
    private int width;
    
    //Constructors

    public Wheel() {
        this.rim = 0;
        this.width = 0;
    }

    public Wheel(int rim, int width) {
        this.rim = rim;
        this.width = width;
    }
    
    //getters and setters

    public int getRim() {
        return rim;
    }

    public void setRim(int rim) {
        this.rim = rim;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    //toString method

    @Override
    public String toString() {
        return "Wheel{" + "rim=" + rim + ", width=" + width + '}';
    }
    
    
}
