

class Base{
    int x;

    public int getX() {
        System.out.println("I am in Base myName is getter. ");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void myPrint(){
        System.out.println("Iam a Contructor.");
    }
   
}



class Derived extends Base{           // Base is like to father to Dereivd
    int Y;

    public int getY() {
        System.out.println("I am in Derived myName is getter. ");
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

}


class Animal{
    String animal;

    public String getAnimalSound() {
        return animal;
    }

    public void setAnimalSound(String animal) {
        this.animal = animal;
    }
}
class cat extends Animal{

}


public class _20_Inheritance {


    public static void main(String[] args) {
        
/*
Inheritance is used to borrow properties & methods from an existing class.

        |Phone|  --->  |SmartPhone|
        |SuperClass|  --->  |SubClass|       subClass extends Superclass

Declaring Inheritance in Java
Inheritance in java is declared using extends keyword.

        |SuperClass|
            |
         |SubClass|        ----> SubClass extends the SuperClass

More Examples:

    Vehicle  Animal  Animal  Vehicle
     |         |       |        |
    Car       Dog     Cat      Tuck

When a class inherits from a superclass, it inherits parts of superclass methods and fields. Java doesn't support multiple inheritance i.e two classes cannot be superclasses for a subclass. 

*/



// Creating an object of Derived class
// Base base=new Base();
// base.setX(20);
// System.out.println("X(Base): "+base.getX());

// Creating an object of Derived class

// Derived d=new Derived();
// d.setX(25);             // We can excess x which is in Base class from Derived Class. This is Inheritence.  
// d.setY(30);
// System.out.println("X(Derived): "+d.getX());
// System.out.println("Y: "+d.getY());


cat anim=new cat();
anim.setAnimalSound("Moew Meow");
System.out.println("Cat Sound: "+anim.getAnimalSound());

    }
}
