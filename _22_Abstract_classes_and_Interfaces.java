

/**To implement Interfaces Make Interface class and define-or-create methods in that class then use implements and again call all methods, in that class. 

Class in which we define methods before Implementing is called as Abstract Class.

Interface is a group of methods which must be called.


To implement Interfaces Make Interface class and define-or-create methods in that class then use implements and again call all methods, in that class. Class in which we define methods before Implementing is called as Abstract Class. Interface is a group of methods which must be called.

**/

interface cycle{
    int a=20;
    void applyBrake(int increase);
    void speedUp(int decrease);
}
interface Horncycle{
    void applyHorrn3g();
    void applyHorrn5g();
}

class AvonCycle implements cycle,Horncycle{
    public void applyBrake(int decrement){
        System.out.println("Applying Brake...");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyHorrn3g(){
        System.out.println("Horn 3G");
    }
    public void applyHorrn5g(){
        System.out.println("Horn 5G");
    }
}



class  _22_Abstract_classes_and_Interfaces{
  public static void main(String[] args) {
   
        AvonCycle cycleSanket=new AvonCycle();
        cycleSanket.applyBrake(1);
        // You can create properties in interfaces
        System.out.println(cycleSanket.a);
        //You cannot modify the properties in Interfaces as they are final
  




/*
What does abstract (class) mean?
--> Abstract in english means -> Existing in thought or as an idea without concrete existance.

Abstract method
--> A method that is declared without an implementation

        abstract void moveTo(double X, double Y)


Abstract Class
If a class includes abstract methods, then the class itself must be declared abstract, as in:

        public abstract class phoneModel{
                abstract void SwitchOff();
                // more code;
        }

 */



}
}






// class base2{

//     public base2() {
//             System.out.println("Mai base2 ka constructor hoon");
//     }
//     public void sayHello(){
//         System.out.println("Hello");
//     }
//     abstract public void greet();
//     // abstract public void greet2();
// }

// class child2 extends base2{
//     public void greet(){
//         System.out.println("Good Morning");
//     }
// }


// abstract class child3 extends base2{
//     public void th(){
//         System.out.println("I am Good!");
//     }
// }







