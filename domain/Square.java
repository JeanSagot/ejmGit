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
public class Square extends Figure{
    //attributes
    private int area;
    private int width;
    private int height;
    private int perimeter;

    //Constructors

    public Square(int area, int width, int height, int perimeter) {
        this.area = area;
        this.width = width;
        this.height = height;
        this.perimeter = perimeter;
    }

    public Square(int area, int width, int height, int perimeter, int sides) {
        super(sides);
        this.area = area;
        this.width = width;
        this.height = height;
        this.perimeter = perimeter;
    }
   
    
    //getters and setters

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    
    //toString method

    @Override
    public String toString() {
        return "Square{" + "area=" + area + ", width=" + width + ", height=" + height + ", perimeter=" + perimeter + '}';
    }
    
    
}
