/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Vehicle {
    private String name;
    private String color;
    // Declare the owner instance field
    private Person owner;
  
    void printData(){
    
    }
    
    void setName(String name){
       this.name = name;
    }
    
    
    String getName(){
        return this.name;
    }
    
    void setColor(String color){
       this.color = color;
    }
    
    
    String getColor(){
        return this.color;
    }
    
    // Define the getter for the owner field
    public Person getOwner(){
      return this.owner;
    }
  // Define the setter for the owner field
    public void setOwner(Person person) {
       this.owner = person;
     }
    
    //CConstructor
    Vehicle(String name, String color){
    this.name=name;
    this.color=color;
    System.out.println("Called the Super constructor");
  }
    
    
    // Note
   //There is a way to declare a method with content that has not yet been decided. 
    //By prefixing the method declaration with abstract as shown below, we can declare what is called an abstract method. 
    //We don't implement anything inside abstract method
    
    // abstract public void run (int distance); in the Veicle class
    
    //Note 
    
    //An abstract method will cause an error if the subclass doesn't override it. 
    //So you can force subclasses to override the abstract method and define what it does
    
//    public  void run(int distance){    In the Car class
//        this.distance  += distance;
//                
//    }
    
    
    
     // Class Type Fields
    //We can create a class instance as an instance field by declaring a variable of class type.
    //Let's create an instance field named owner of type Person like in the example below.
}
