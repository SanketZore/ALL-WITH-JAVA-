

/*
WRITING A CUSTOM CLASS
We can write a custom class as follows:

public class Employee{
    int id;        ----> Attribute1
    String Name;   ----> Attribute2
}

Any real world object = properties + Behavoiur
       Object in OOPs = Attribuets + Methods
properties --= Properties means color, ram, size, weight. 
 */


/*
A CLASS WITH METHODS
We can add methods to our class Employee as follows:
public class Employee{
    public int id;
    public String name;

    public int getSalery(){
        // code
    }
    public void getSalery(){
        // code
    }
}
 */



class Employee{            // Custom Class
    int id;
    int salery;
    String Name;
    public void printDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+Name);
        System.out.println("Salery: "+salery);
    }

    public int getSalery(){
        return salery;
    }
}



public class _14_Creating_Java_Class {

    public static void main(String[] args) {
        
        System.out.println("This is our Custom Class");

     Employee employee=new Employee();    // Instantiating a new Employee Object
     Employee manager=new Employee();    // Instantiating a new Employee Object
     // Setting Attributes or Properties for Employee
     employee.Name="Sanket";   
     employee.id=1;
     employee.salery=150000;
     employee.printDetails();
     int salery=employee.getSalery();
     System.out.println(salery);
     // Setting Attributes or Properties for Manager
     manager.Name="Rohit";
     manager.id=2;
     manager.salery=250000;
     manager.printDetails();
     int salery1=manager.getSalery();
     System.out.println(salery1);
     // Printing the Attributes
    //  System.out.println("Employee Name: "+employee.Name);
    //  System.out.println("Salery: "+employee.salery);



    }
    
}
