/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Car extends Vehicle {
    public  int distance =0;
    public  int fuel =100;
    
    // Let's use the constructor to set a value for the instance fields declared in a superclass. 
    //First of all, we have to define the constructor in both superclass and subclass, as shown below. 
    //We then pass an argument to super() in the constructor of the subclass, 
    //and finally call the constructor of the superclass.
    
    Car (String name, String color){
    super(name, color);
  }

    
    void run(int distance){
        System.out.println("Distance to move is :" + distance);
        this.distance += distance;
        this.fuel -= distance;
    }

    void fuelRecharge(int recharge){
         System.out.println("Fuel to recharge :" + recharge);
         if(recharge+this.fuel>=100){
             System.out.println("Refueled Tank now Full!");
             this.fuel+=recharge;
         }else{
         System.out.println("Refueled Tbut not full tankt! ");
         }
    }

void printData(){
    
System.out.println("This car's color is:" + this.getColor());

System.out.println("This car's name is:" + this.getName());

System.out.println("The Fuel remaining" + fuel);
}



}