import java.util.Scanner;

public class _9_Methods {


  
/*
Sometimes our program groes in size and we want to separate the logic of main method to other methods.
fro instance - If we are calculating average of a number pair 5 times,we can use methods to avoid repeating the logic.

DRY - Don't Repeat Yourself 

Syntax of a Method
A method is a function written inside a class. Since java is an Object Oriented Language, We need to write the method inside same class.

dataType MethodNmae(){
    // Method Body
}


Note: Method's are Defined Above "public static void main(String[] args){...}"

*/

    //  int logic(int x, int y){
    // return x+y;
    // }

    //  static int factorial(int factorial_Of){
    //     int fact=1;         
    //     for(int i=1;i<=factorial_Of;i++){
    //          fact=fact*i;
    //     }return fact;
    // }

// public static void main(String[] args) {


    //   System.out.println(logic(4,6));

    //   System.out.println(factorial(4));


/*
-----------------------------------------------------

CALLING A METHOD 
A method can be called by creating an object of the class in which the method exists followed by the method call.

STATIC makes Method Available for All Objects in a Class in which method is defined.
*/

/* 
CALLING WITHOUT STATIC 


        fileName obj= new fileName();    ---> Object Creation
        obj.mysum(a,b);      ---> Method call upon on Object.

    The values from the method call (a and b) are copied to the a and b of the function mysum. Thus
    even if we modify the values a and b inside the method ,the values in the main method will not change.
 */


// }


// int Sum(int x,int y){
//     return x+y;
// }


// int multi(int x,int y){
//     return x*y;
// }



// int factorial(int factorial_Of){           
//     int fact=1;         
//     for(int i=1;i<=factorial_Of;i++){
//          fact=fact*i;
//     }return fact;
// }

// public static void main(String[] args) {
    
//     Scanner sc=new Scanner(System.in);


// int a=5,b=8,c;
// _9_Methods obj=new _9_Methods();
// c=obj.Sum(a,b);
// System.out.println(c);

// int a=5,b=2,c;
// _9_Methods obj=new _9_Methods();
// c=obj.multi(a, b);
// System.out.println(c);


// System.out.print("Enter Number: ");
// int n=sc.nextInt();

// Method Invocation using Object creation

// _9_Methods obj=new _9_Methods();
// int fact=obj.factorial(n);
// System.out.print(fact);


// }



/*
Void return type
When we dont want our method to return anything, We use Void as the return type.
 */

    //  static void greet(){
    //     System.out.println("Hello Sir,\n\t Good Morning.");
    //  }

    //  public static void main(String[] args) {
    //     greet();
    //  }


/*
Static Keyword
static keyword is used to associate a method of a given class with the class rather than the object. Static method in a class is Shared by all the objects.
 */




/*
-----------------------------------------------------
 */


//  static void change(int a){
//     a=98;
//  }

//  static void change2(int[] arr){
//     arr[0]=98;
//  }
// public static void main(String[] args) {
    
    
/* Case 1 ---CHANGING THE INTEGER--- */ 
    
    //     int x=45;
    //     change(x);    // This will not change the value of x mentioned above  instead of that this is coping the value of x in method but method is never called.
    // System.out.println("The value of X after running change is "+ x);}

    
/* Case 2 ---CHANGING THE ARRAY--- */ 


    // int[] marks={62,45,78,96,54,32,89};
    // change2(marks);
    // System.out.println("The value of X after running change is "+ marks[0]);}

/* Note: In case of Array, the reference is passed. Same is the case for Object Passig to methods.  */


/*
----------------------------------------------------
*/

/* METHOD OVERLOADING 
Two or More methods can have same name but different parameters. Such methods are called Overloading Methods.
*/


static void greet(){
    System.out.println("Welcome to this World!, How can i help you. ");
}
static void greet(String a){
    System.out.println("Welcome to this World "+a+", How can i help you. ");
}
static void greet(String a,String b){
    System.out.println("Welcome to this World "+a+" & "+b+", How can i help you. ");
}
//// static int greet(String a,String b){  // changing method type with same name is not allowed, this will give an error.
////     System.out.println("Welcome to this World "+a+" & "+b+", How can i help you. ");
//// }
/* Method Overloading  Cannot be Created in java.*/

public static void main(String[] args) {
   
   greet();
   greet("Sanket");               // Overloading function greet
   greet("Sanket","Rohit"); 

}





   
}
