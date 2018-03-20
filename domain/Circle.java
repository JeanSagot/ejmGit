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
public class Circle extends Figure{
    //attributes
    private int radius;
    private int diameter;
    private int circunference;
    
    //constructors

    public Circle(int radius, int diameter, int circunference) {
        this.radius = radius;
        this.diameter = diameter;
        this.circunference = circunference;
    }

    public Circle(int radius, int diameter, int circunference, int sides) {
        super(sides);
        this.radius = radius;
        this.diameter = diameter;
        this.circunference = circunference;
    }
    
    
    //getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getCircunference() {
        return circunference;
    }

    public void setCircunference(int circunference) {
        this.circunference = circunference;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", circunference=" + circunference + '}';
    }
}
