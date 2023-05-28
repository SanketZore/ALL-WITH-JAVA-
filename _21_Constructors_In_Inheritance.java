
class Base1{

    public Base1(){
        System.out.println("I am a Constructor.");
    }
    public Base1(int a){
        System.out.println("I am a Overloaded Constructor with value of a as "+a);
    }
    public Base1(int a,int b){
        System.out.println("I am a Overloaded Constructor with value of a and b as "+a+" and "+b);
    }

    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }

}


class Derived extends Base1{
    
    int y;
    public Derived() {
        super(6);
        System.out.println("I am Derived class constructor");
    }
    public Derived(int a,int b) {
        super(30,20);
        System.out.println("I am a Overloaded Constructor with value of a and b as "+a+" and "+b);
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

}


class ChildOfDerived extends Derived{
     ChildOfDerived(){
        System.out.println("I am child of derived Constructor");
    }
     ChildOfDerived(int x,int y,int z,int s){
        super(x,y);
        System.out.println("I am child of derived Constructor with values.");
    }
}


public class _21_Constructors_In_Inheritance {

    public static void main(String[] args) {

/*
When a Derived class is extended from the base class, the constructor of the base class is executed first followed by the constructor of the derived class.

For the following Inheritance hierarchy, the constructor are executed in the order 1 --> 2 --> 3

        c1 --> Parent
        |
        C2 --> Child       // Constructor Execute in Top to bottom Order.
        |
        C3 --> GrandChild
 */


        // Base1 base=new Base1();
        // Derived values=new Derived(15,65);
        ChildOfDerived cd=new ChildOfDerived();

        
       


    }
}
