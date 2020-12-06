/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
class Car{
   private String name;
  private String color;
  private int distance = 0;
  private int fuel  = 100;
  
  Car(String name, String color){
    this.name = name;
    this.color= color;
  }
  public void printData() {
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + this.distance + "km");
    System.out.println("Fuel: " + this.fuel + "L");
  }
  
  public void run(int distance) {
    System.out.println("Distance to move or Moving " + distance + "km ...");
     if (distance <= this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    System.out.println("Distance: " + this.distance + "km");
    System.out.println("Fuel: " + this.fuel + "L");
    } else {
      System.out.println("Not enough fuel, please refuel!");
    }   
  }
  
  public void Charge(int litre){
      System.out.println("Adding Fuel" + litre + "Litres");
      if(litre <= 0){
          System.out.println("No fuel added");
      }else if (litre + this.fuel >= 100) {
      System.out.println("Fuel added. Tank now full!");
      this.fuel += litre;
    } else {
      System.out.println("Fuel added. But not a full tank!");
      this.fuel += litre;
    }
      System.out.println("Fuel Remaining: " + this.fuel + "L");
  }
    
      
  }
  
 
