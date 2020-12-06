/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */

public class Bicycle {
    private String name;
    private String color;
    private int distance = 0;
    
    
    Bicycle(String name, String color){
        this.name = name;
        this.color = color;
    }
    
     void printData(){
    
    System.out.println("My name is " + this.color);
    System.out.println("My name is " + this.getname());
    System.out.println("Distance:" + this.distance + "km");
    }
    
    String getname(){     // Note that a getter helps you to access an instace field outside the class ie noramlly when you want to print it out outside the class iits defined in.
     return this.name;
    }
    
    void run(int distance){
     System.out.println("Moving" + distance + "km...");
     this.distance += distance;
     System.out.println("Distance:" + this.distance + "km");
    }
    
    
}
