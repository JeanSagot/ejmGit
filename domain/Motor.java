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
public class Motor {
    //attributes
    private int horsePower;
    private int displacement;

    //Constructors
    public Motor() {
        this.horsePower = 0;
        this.displacement = 0;
    }

    public Motor(int horsePower, int displacement) {
        this.horsePower = horsePower;
        this.displacement = displacement;
    }
    
    //getters and setters

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    
    //toString Method

    @Override
    public String toString() {
        return "Motor{" + "horsePower=" + horsePower + ", displacement=" + displacement + '}';
    }
    
    
}
