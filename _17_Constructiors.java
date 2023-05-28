

class MyNameSanket{
    private int id,Salery;
    private String Name;


    // Constructor Basically means creating class and method name same. 

    public MyNameSanket(){    // Constructor
        Name="Rohit";
        id=64;
    }
    public MyNameSanket(String N,int I){  // Constructor Overloading 
        Name=N;
        id=I;
    }
    public MyNameSanket(int s){
        Salery=s;
    }
    public void setName(String n){Name=n;}
    public String getName(){return Name;}
    public void setId(int i){this.id=i;}
    public int getId(){return id;}
    // public void setSalery(int s){Salery=s;}
    public int getSalery(){return Salery;}

}








public class _17_Constructiors {
    public static void main(String[] args) {

/*
Constructors in Java
A member function used to initialize an object while creating it.

 MyNameSanket sanket=new MyNameSanket();
 sanket.setName("Sanket");

In order to write our own Constructor, we define a method with name same as class name.

public MyNameSanket(){
    name="Your Name";
}

 */

MyNameSanket Rohit=new MyNameSanket();   
Rohit.setName("Sanket");
Rohit.setId(56);
System.out.println(Rohit.getName());
System.out.println(Rohit.getId());


/*
Constructor Overloading in java
Constructor can be overloaded just like other methods in java. We can overload the Employee constructor like below:

MyNameSanket sanket=new MyNameSanket("SanketZore",99);
System.out.println(sanket.getName());
System.out.println(sanket.getId());

Note: 1. Constructor can take parameters without being overloaded.

      2. There can be more than two overloaded contructors.

 */

MyNameSanket sanket=new MyNameSanket("SanketZore",99);
System.out.println(sanket.getName());
System.out.println(sanket.getId());
  
/*
Quick Quiz : Overload the Employee Constructor to initialize the salery to Rs 10000.
*/

MyNameSanket salery=new MyNameSanket(10000);
System.out.println(salery.getSalery());

    }
    
}
