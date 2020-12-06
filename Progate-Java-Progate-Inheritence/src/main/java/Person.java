/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("My name is " + this.fullName() + ".");
    System.out.println("I am " + this.age + " years old.");
    System.out.println("I am " + this.height + "m tall.");
    System.out.println("I weigh " + this.weight + "kg.");
    System.out.println("My BMI is " + Math.round(this.bmi()) + ".");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
    //Let's define the buy instance method so that a Person class instance can purchase a vehicle. 
  //The vehicle to buy is either an instance of the Car class or an instance of the Bicycle class.
  //The argument of the buy instance method should accept an instance of either type, 
  //so we need to overload the method as seen below.
  
  
     // Define the buy method, it should accept Car type arguments
    public void buy(Car car){
      car.setOwner(this);  //Inside the buy instance method, we use the setter of the Car instance received as an argument to change its owner.
    }

  // Define the buy method, it should accept Bicycle type arguments
  public void buy(Bicycle bicycle){
    bicycle.setOwner(this);
    // this referss to the Person instance used to call the buy instance method.
  }
  
  //There is a way to solve this problem. 
  //As shown in the examples below, by accepting an instance of the Vehicle type as a parameter, 
  //the buy instance method is able to take an instance of the Car class as well as the Bicycle class.
  
  //There is a way to solve this problem. As shown in the examples below, 
  //by accepting an instance of the Vehicle type as a parameter, 
  //the buy instance method is able to take an instance of the Car class as well as the Bicycle class.
  

// Combine the two methods below into a single method
 
  
//  public void buy(Vehicle vehicle) {
//    vehicle.setOwner(this);
//  }
  
  
  }


