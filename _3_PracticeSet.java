import java.util.Scanner;

public class _3_PracticeSet {
    
public static void main(String[] args) {
  
/*
1)Question
What will be the result of the following expression.
float a=7/4 * 9/2
 */


// float a=7/4.0f * 9/2.0f;
// System.out.println(a);




/*
2)Question
Write a java program to encrupt a grade by adding 8 to it. Decrupt it to show the correct grade.
*/    

// char grade='B';
// Encripting the grade
// grade=(char)(grade + 8);    // First grade is casted to char
// System.out.println("grade is "+grade);
// //Decripting the grade

// char grade='J';
// grade=(char)(grade-8);
// System.out.print(grade);


///////////////////// TYPE CASTING /////////////////////


// float marks=87.33f;
// short grade=(short)marks;
// System.out.println(grade);




/*
3)Question
Use comparision operator to find out whether a given number is greater than the users entered number or not.
*/ 

// Scanner sc=new Scanner(System.in);
// System.out.print("Enter First number: ");
// short a=sc.nextShort();
// System.out.print("Enter Second number: ");
// short b=sc.nextShort();
// System.out.println(a>b);
// System.out.print(a<b);

/*         or           */

// if(a==b){
//     System.out.print("Entered Numbers are Same");
// }else{    System.out.print("Entered Numbers are Not Same");
// }





/*
4)Question
Write the following expression in a java program.
        v^2 - u^2
       -----------
        2 * a * s

*/ 

Scanner sc=new Scanner(System.in);
System.out.print("v: ");
float v=sc.nextFloat();
System.out.print("u: ");
float u=sc.nextFloat();
System.out.print("a: ");
float a=sc.nextFloat();
System.out.print("s: ");
float s=sc.nextFloat();
float calculate=((v*v)-(u*u))/(2*a*s);
System.out.print(calculate);





/*
5)Question
Find the value of the following operations:
int x=7;
int a=7.49/7+35/7              Find value of a ?

*/ 

// int x=7;
// int a=(7*49/7)+(35/7);
// System.out .print(a);

}
}


