/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author jeanp
 */
public class Car {
    
    //attributes
    private int year;
    private String model;
    private String brand;
    private ArrayList<Wheel> carSpecs;

    
    //Constructors
    public Car() {
        this.year = 0;
        this.model = "";
        this.brand = "";
    }

    public Car(int year, String model, String brand) {
        this.year = year;
        this.model = model;
        this.brand = brand;
    }
    
    //getters and setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<Wheel> getWheelSpecs() {
        return carSpecs;
    }

    public void setWheelSpecs(ArrayList<Wheel> carSpecs) {
        this.carSpecs = carSpecs;
    }
    
    
    //toString method

    public void printCar(){
        System.out.println("Car Info: "+this.brand);
        for (int i = 0; i < this.getWheelSpecs().size(); i++) {
            System.out.println(this.getWheelSpecs().get(i).toString());
        }
    }
    
    
}
