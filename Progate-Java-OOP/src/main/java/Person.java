

public class Person {
    public String name;
    public String residence;
    public String firstName;
    public String secondName;
    public String lastName;
    public static int count = 0;   //Class field
    public void hello(){
        System.out.println("Heloo");
        System.out.println("Heloo my name is: " + this.name); //When an instance calls the method, this is replaced by the instance.
         System.out.println("Heloo my residence is: " + this.residence);
    }
    
    Person(String name, String residence, String firstName, String secondName ){   // Constructor
        Person.count++;
        System.out.println("Succesfully created a constructor");
        this.name = name;                                                          // Setting the value of the instance field
        this.residence = residence;
        this.firstName = firstName;
        this.secondName = secondName;
        
    }
   
    Person(String name, String residence, String firstName, , String secondName, String lastName ){   // Constructor
        this(name, residence, firstName,  secondName);
        this.lastName = lastName;
        
    }
    
    //When we create an instance using new, we can pass arguments to the () of new ClassName(). Then, the arguments are passed to the constructor to be called immediately after. Using this, we can pass information to the constructor.

    
    // In OPP Now, we enable the instance method to get a value of its own instance field using this, we don't pass an argument
    public String fullName(){
        if (this.lastName == null) {
      return this.firstName + " " + this.secondName;
    } else {
      return this.firstName + " " + this.secondName + " " + this.lastName;
    }
    }
    
   
    
    public void PrintData(){    //Defining a method to allow a method print  its its own data
        System.out.println("The fullname is " + this.fullName());
    }
    
    
    
    
    
    
    
    
}
