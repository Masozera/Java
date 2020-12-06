/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       

//Bicycle Stuff

    Bicycle bicycle = new Bicycle("Biyachi","Red");
    System.out.println(bicycle.getname());

    bicycle.printData();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter distance : ");
    
    int bicycleDistance = scanner.nextInt();
    
    bicycle.run(bicycleDistance);
    
    
    System.out.println("=================");
    
    Car car = new Car("Ferrari","Red");
    System.out.println("【Car Info】");
    car.printData();
    
    System.out.println("-----------------");
    System.out.println("Enter distance to move: ");
    int carDistance = scanner.nextInt();
    car.run(carDistance);
    
    System.out.println("-----------------");
    System.out.println("Enter amount of Fuel to refuel: ");
    int refuelAmount = scanner.nextInt();
    car.Charge(refuelAmount);
    
    // Note Fields other than fuel such as name, color, and distance are declared as private instance fields in the Vehicle class, and external classes like Car can't directly access them (encapsulation). When you want to allow external access to private instance fields, use a getter method.
   
   }
    
}
