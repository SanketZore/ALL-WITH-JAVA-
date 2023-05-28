

class Cylinder{
    private int radius,height;

    public Cylinder(int radius,int height) {       // CONSTRUCTOR
        this.radius = radius;
        this.height = height;
    }
    public void setradius(int radius){
        this.radius=radius;
    }
    public int getradius(){
        return radius;
    }
    public void setheight(int height){
        this.height=height;
    } 
    public int getheight(){
        return height;                // Math.PI gives the actual value of pi.
    }
    public double SurfaceArea(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
        
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }  
}


class Rectangle{
    private int Length,Breadth;

    
    public int getLength() {
        return Length;
    }
    public void setLength(int length) {
        Length = length;
    }
    public int getBreadth() {
        return Breadth;
    }
    public void setBreadth(int breadth) {
        Breadth = breadth;
    }
    public Rectangle(){
        this.Length=4;
        this.Breadth=5;
    }
    public Rectangle(int length, int breadth) {
        Length = length;
        Breadth = breadth;
    }
}


class Sphere{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double Volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
    public double Area(){
        return 4*Math.PI*radius*radius;
    }

}




public class _19_Practice_Set_On_Access_Modifiers {
    public static void main(String[] args) {

/*
Question 1) ---> Create a class cylinder and use getterss and setters to set its radius and height.
 */

        // Cylinder cylinder=new Cylinder();
        // cylinder.setradius(5);
        // System.out.println("cylinder Radius: "+cylinder.getradius());
        // cylinder.setheight(10);
        // System.out.println("cylinder Height: "+cylinder.getheight());
        




/*
Question 2) ---> Use 1 to calculate surface area and volume of the cylinder.
 */
    // Cylinder cylinder=new Cylinder();
    // cylinder.setradius(5);
    // cylinder.setheight(10);
    // System.out.println("Surface Area: "+cylinder.SurfaceArea());
    // System.out.println("Volume: "+cylinder.Volume());



/*
Question 3) ---> Use a Constructor and repeat 1.
 */

// Cylinder cylinder=new Cylinder(10,5);
// System.out.println("Surface Area: "+cylinder.SurfaceArea());
// System.out.println("Volume: "+cylinder.Volume());



/*
Question 4) ---> Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
 */

Rectangle rect=new Rectangle(12,56);
System.out.println(rect.getLength());
System.out.println(rect.getBreadth());




/*
Question 5) ---> Repeat 1 for a Sphere
 */
Sphere sphere=new Sphere();
sphere.setRadius(5);
System.out.println(sphere.Area());
System.out.println(sphere.Volume());




    }
    
}
