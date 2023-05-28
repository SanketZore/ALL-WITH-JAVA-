

class Employee{
    int salery;
    String name;

    public int getSalery(){
        return salery;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    
    }
}


class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callHimanshu(){
        System.out.println("calling Himanshu...");
    }
    public void callShubham(){
        System.out.println("calling Shubham...");
    }
}


class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


class Rectangle{
    int length,width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }

}


class TommyVecetti{
    public void hitting(){
        System.out.println("Hitting");
    }
    public void running(){
        System.out.println("Running");
    }
    public void firing(){
        System.out.println("Firing");
    }
}


class Circle{
    int radius;
    float pi=3.14f;
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}







public class _15_Questions_on_OOPs {
    public static void main(String[] args) {
        

/*
Question 1) ---> Create a class Employee with following properties and methods:
    - salery(property)(int)
    - getSalery(method returning int)
    - name(property)(string)
    - getName(method returning string)
    - setName(method changing name)
 */

// Employee employee=new Employee();
// employee.setName("Sanket");      // by default value assigns null after making string.
// System.out.println(employee.getName());
// employee.salery=150000;
// System.out.println(employee.getSalery());




/*
Question 2) ---> Create a class cellphone with methods to print "ringing...", "vibrating..." etc;
 */

// cellphone phone=new cellphone();
// phone.ringing();
// phone.vibrating();
// phone.callHimanshu();
// phone.callShubham();




/*
Question 3) ---> Create a class Square with a method to initialize its side, calculating area, perimeter etc.
 */

// Square square=new Square();
// square.side=3;
// System.out.println(square.area());
// System.out.println(square.perimeter());




/*
Question 4) ---> Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.
 */

// Rectangle rectangle=new Rectangle();
// rectangle.length=5;
// rectangle.width=3;
// System.out.println(rectangle.area());
// System.out.println(rectangle.perimeter());




/*
Question 5) ---> Create a class TommyVecetti fro Rockstar Games capable of hitting (print hitting...), running , firing etc.
 */

// TommyVecetti rockstar_games=new TommyVecetti();
// rockstar_games.firing();
// rockstar_games.hitting();
// rockstar_games.running();




/*
Question 6) ---> Create a class Circle with a method to initialize its side, calculating area, perimeter etc.
 */

Circle circle=new Circle();
circle.radius=5;
System.out.println(circle.area());
System.out.println(circle.perimeter());



    }
    
}
