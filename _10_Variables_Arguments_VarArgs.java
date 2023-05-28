public class _10_Variables_Arguments_VarArgs {

// ----- NORMAL WAY OR METHOD OVERLOADING ------//
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b, int c,int d){
    //     return a+b+c+d;
    // }


// ----- VarArgs ------//

// static int sum(int ...array){
//     int result=0;
//     for(int a:array){
//         result+=a;
//     } 
//     return result ;
// }



// static int sum(int x,int ...array){   // this method makes int X as compulsor .
//     int result=0;
//     for(int a:array){
//         result+=a;
//     } 

//     return result*x;
// }



//  static int multiply(int ...m){
//         int result=1;   
//     for(int multi:m){
//         result*=multi;
//     }
//         return result;
//  }



    static void sum(int ...num){
        int result=0;
        for(int a:num){
            result+=a;
        }
        
        int len=num.length;
        for(int i=0;i<len;i++){
            System.out.printf("%d",num[i]);
            if(i<len-1){System.out.print("+");}
        }
        
        System.out.print("="+result);
    }



    public static void main(String[] args){
        sum(1,2,3,4,5,6);


/*
VARIABLE ARGUMENT(Varargs)
A Function with varargs can be created in java using the following syntax: 

public static void foo(int ...arr){
    // arr is available here as int[]arr
}

foo can be called with zero or more arguments like this:
foo(7)    foo(4,5,7,8)    foo(1,2,5,7,9,6) 

We can also create a function bar like this

    public static void bar(int a, int arr){    // AtLeast one integer is required now
        // code   
    }

    bar can be called as bar(1), bar(1,2), bar(1,9,4,7)  etc.
 */



        //   System.out.println("The Sum is "+sum(2,2,3));
        // System.out.println("Sum is "+sum(5,4));
        // System.out.println("Sum is "+sum(5,4,6));
        // System.out.println("Sum is "+sum(5,4,6,9));
        // System.out.println("Sum is "+sum(5,4,6,9,2,4,9,2));

        // System.out.println("The Multiplication is "+multiply(5,5));
        // System.out.print("The Multiplication is "+multiply());   // if noting is passed as a argument  then it will return the default result value.







    }
}
