import javax.sound.sampled.SourceDataLine;

public class _11_Recursion {


    static int factorial_Recursion(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            int fact=n*factorial_Recursion(n-1);
            return fact;
        }
    }


    static int factorial_Iterative(int n){
        int fact=1;
        if(n==0 || n==1){
            return 1;
        }else{
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }return fact;}

    }

    static int Fibonacci(int n){
       
        int t1=0;
        int t2=1;
        int nextterm;
    
        for(int i=1;i<=n;i++){
            System.out.println(t1);
            nextterm=t1+t2;
            t1=t2;
            t2=nextterm;
        }
        return t1;
    }



public static void main (String[] args){

/*
RECURSION 
A function in java can call itself. such calling of function by itself is called recursion.


Example: Factorial of a number
    factorial(n) = n*factorial(n-1);


Quick Quiz : Write a program to calculate (recursion must be used) factorial of a number in java ?
*/


    // System.out.println(factorial_Recursion(0));
    // System.out.println(factorial_Iterative(4));
    System.out.println(Fibonacci(10));



// Question: print Fibonacci Number  --- 0,1,1,2,3,5,8,13,21,34,...


}

}
