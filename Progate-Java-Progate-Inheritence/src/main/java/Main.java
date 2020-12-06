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
        
        Car car         = new Car("Sizuki","Red");
        Bicycle bicycle = new Bicycle("Kajoba","Green");
        
        
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Enter Distance to move");       
        int distanceToMove = scanner.nextInt();       
        car.run(distanceToMove);
        
        System.out.println("Enter amount to refuel");          
        int amountToRefuel = scanner.nextInt();
        car.fuelRecharge(amountToRefuel);
        
//        car.setColor("Red");
//        car.setName("Benz");
       
        car.printData();
        
        Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
        Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
        
        //Using the setOwner instance method,
        // Set the owner of car to person1 .
        //2. Set the owner of bicycle to person2.
        
        // Set the owner of car to person1 using the setOwner instance method
        
        car.setOwner(person1);
        
         // Set the owner of bicycle to person2 using the setOwner instance method 
         bicycle.setOwner(person2);

         
         // Get the owner of car using the getOwner instance method,
         // and use printData to print the owner information
         System.out.println("-----------------");
         System.out.println("【Car Owner Info】");
         car.getOwner().printData();
         
         // and use printData to print the owner information
         System.out.println("-----------------");
           System.out.println("【Bicycle Owner Info】");
           bicycle.getOwner().printData();

           
           // Make person1 purchase car using the buy instance method
     person1.buy(car);
   
    
    // Make person2 purchase bicycle using the buy instance method
     person2.buy(bicycle);
   
     
    }
}
