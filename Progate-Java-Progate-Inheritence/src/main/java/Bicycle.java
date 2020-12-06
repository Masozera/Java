/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Bicycle extends Vehicle {
    
    
//    Bicycle(){
//        super();   This is if you want to call a print statement in the super class and print it it out
//    }
    
    // Let's use the constructor to set a value for the instance fields declared in a superclass. 
    //First of all, we have to define the constructor in both superclass and subclass, as shown below. 
    //We then pass an argument to super() in the constructor of the subclass, 
    //and finally call the constructor of the superclass.
    
     Bicycle (String name, String color){
    super(name, color);
  }
    
    // The code below calls an instance method from the super class if the instance fields are not private
    
//    public void printData(){   
//        super.printData();
//    }
    
}
