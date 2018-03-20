/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprogra;

import domain.Car;
import domain.Circle;
import domain.Figure;
import domain.Motor;
import domain.Square;
import domain.Wheel;
import java.util.ArrayList;

/**
 *
 * @author jeanp
 */
public class PracticaProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car = new Car(2012, "Supra", "Toyota");
        Motor motor = new Motor(500, 6);
        Wheel wheels= new Wheel(4, 13);
        
        ArrayList<Wheel> wheelSpecs = new ArrayList<Wheel>();
        wheelSpecs.add(wheels);
        car.setWheelSpecs(wheelSpecs);
        car.setBrand("Toyota");
        
        car.printCar();
        
        Figure figura = new Square(80, 4, 4, 16, 4);
        System.out.println(figura.toString());
        
        Figure figura2 = new Circle(50, 12, 20, 1);
        System.out.println(figura2.toString());
    }
    
}
