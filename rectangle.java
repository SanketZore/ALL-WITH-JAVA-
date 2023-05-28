import java.util.*;

class Area {
    Scanner sc = new Scanner(System.in);

    public void setDim() {
        int area, breadth, length;
        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.print("Area of Rectangle: " + area);
    }
}

class rectangle {

    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim();
    }
}
