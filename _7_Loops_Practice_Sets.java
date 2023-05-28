import java.util.Scanner;
import java.util.*;

public class _7_Loops_Practice_Sets {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("-----------");
        int ai=sc.nextInt();
        int bi=sc.nextInt();
        int ni=sc.nextInt();
        
        int sum=0;
        for(int i=0;i<n;i++){
          sum=(int)(a+Math.pow(2, i)*b)+sum;
          System.out.print(sum+" ");
        }

        // System.out.println("-----------\n");

        int sum1=0;
        for(int j=0;j<ni;j++){

          if(j==0){
            sum1=(int) (ai+(Math.pow(2, j)*bi)+sum1);
          }
          if(j>0){
            sum1=(int) ((Math.pow(2, j)*bi)+sum1);
          }
          System.out.print(sum1+" ");
        }






      //  1)--> Question
        /*
        Write a program to print the following pattern
        * * * * *
        * * * * 
        * * *
        * *
        * 

      */   

            // int n = 5; 
            // for(int i=n;i>0;i--){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("* ");
            //     }System.out.print("\n");
            // }

            // int k=5;
            // for(int i=1;i<=k;i++){
            // for(int j=1;j<=i;j++){
            //     System.out.print("* ");
            // }System.out.print("\n");
            // }


 //  2)--> Question
        /*
        Write a Multiplication Table using For Loop.
      */             

        // System.out.print("Enter Number: ");
        //     int n=sc.nextInt();
        //     for(int i=1;i<=10;i++){
        //         System.out.print(n+" * "+ i+" = "+i*n+"\n");
        //     }



//  3)--> Question
        /*
        Write a program to Sum till n Even numbers using for loop.
    //   */   

    //   System.out.print("Enter Number: ");
    //   int num=sc.nextInt();
    //   int ans=0;
    
    //   for(int i=0;i<=num;i++){
    //         if(i%2==0){
    //             ans+=i;
    //         }
    //     }
    //     System.out.print(ans);

    

//  4)--> Question
        /*
        Write a program to Sum first n Even numbers using for loop.
      */         

        // System.out.print("Enter Number");
        // int n=sc.nextInt();
        // int i=0;
        // int sum=0;
        // while(i<n){
        //     sum=sum+(i*2);
        //     i++;
        // }
        // System.out.print("Sum of frist "+n+" Even Number's is "+sum);


 //  5)--> Question
        /*
        Write a Multiplication Table IN Reverse Order.
      */ 

    //   System.out.print("Enter Number: ");
    //         int n=sc.nextInt();
    //     for(int i=10;i>=1;i--){
    //         System.out.print(n+" * "+i+" = "+n*i+"\n");
    //     }


 //  6)--> Question
        /*
        Write a Program to find factorial of a given Number using For Loop.
      */ 


    //   System.out.print("Enter Number: ");
    //     int n=sc.nextInt();
    //     int sum=1;
    //     for(int i=1;i<=n;i++){
    //         sum=sum*i;
    //     }System.out.print("Factorial of "+n+" is "+sum);


 //  7)--> Question
        /*
        Write a Program to find factorial of a given Number using While Loop.
      */ 


      // System.out.print("Enter Number: ");
      //   int n=sc.nextInt();
      //   int i=1,fact=1;
      //   while(i<=n){
      //       fact=fact*i;
      //       i++;
      //   }System.out.print("Fcatorial is "+fact);


 //  8)--> Question
        /*
        What can be done using the one type of loop can also be done using the other two types of loop  -  True or False. 

        Ans--->  True
      */ 


 //  9)--> Question
        /*
        Write a Program to calculate the sum of the numbers accuring in the multiplication table of 8.
      */ 

      //   System.out.print("Enter Number: ");
      //   int n=sc.nextInt();
      // int sum=0;
      //   for(int i=1;i<=10;i++){
      //     sum=sum+(n*i);
      //   }
      //   System.out.print("The sum is "+sum);


   















    }
}
