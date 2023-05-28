import java.util.Scanner;

public class _0_HelloWorld {
    
    
// public static void main(String[] args) {
// int num1;
// num1=5;
// int num2;
// num2=3;
// System.out.println("Sum: "+(num1+num2));    <--- In println, ln is used for new line. 
// }

// public static void main(String[] args) {
// int sum=Add(100,200);
// System.out.println("The sum is "+sum);
// }
    

// public static int Add(int num1,int num2){         // Method is defined
//     int sum=num1*num2;
//     return sum;
// }

// public static void main(String[] args) {           // Method is called
//     int multiply=Add(5,3);
//     System.out.println(multiply);
// }


/*
 For classes we use PascalConvection.
 For Function we use camelCaseConvection

MyNameIsSanket.    <---- PascelConvection
myNameIsSanket.    <---- camelConvection
*/


/***************** SUM TO ADD 3 NUMBERS *****************/

// public static void main(String[] args) {
//     int num1=1,num2=3,num3=5;
//     int sum=num1+num2+num3;
//     System.out.print(sum);
// }


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float Area;
    int rad;
    System.out.print("Enter Radius: ");
    rad=sc.nextInt();
    Area=3.14f*rad*rad;
    System.out.println("Area of circle: "+Area);
}





}
