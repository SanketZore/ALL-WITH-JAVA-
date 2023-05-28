import java.util.Scanner;

public class _12_Practice_Set_Methods {

     Void table(int x){
    for(int i=1;i<=10;i++){
         System.out.format("%d X %d = %d \n",x,i,x*i); 
    }
   return null;
 }



 static void star(int n){
    for (int j=1;j<=n;j++){
    for(int i=1;i<=j;i++){
        System.out.print("* ");
    }System.out.print("\n");};
 }



/*
 sum(n)=n+ sum(n-1);
 sum(3)=3+ sum(2);
 sum(3)=3+ 2+ sum(1);
 sum(3)=3+ 2+ 1;

 */
static int sum_till_n_Recursive(int n){
    // Base Condition
    if(n==1){
        return 1;
    }else{
        return n+sum_till_n_Recursive(n-1);
    }
}




static void stars_Reverse(int n){
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("* ");
        }System.out.print("\n");
    }
}



// fibonacci Seeries ---->  0,1,1,2,3,5,8,13,21,...

static int fibonacci_recursion(int n){
    // if(n==1){
    //     return 0;
    // }else if(n==2){
    //     return 1;

    if(n==1 || n==0){
        return n-1;
    }else{
        return fibonacci_recursion(n-1) +fibonacci_recursion(n-2);
    }
}



static int average(int ...arr){
    int avg=0;
    
    for(int a:arr){
        avg+=a;
    }return avg/arr.length;
}



static void stars_Recursion(int n){
    if(n>0){
       stars_Recursion(n-1);
       for(int i=1;i<=n;i++){
        System.out.print("* ");
       } System.out.print("\n");
    }
}



static float celcius_to_fahrenheit(float n){
    float far = (n * 9.0f/5) + 32.0f;
    return far;
}


static int sum_till_n_Iterative(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }return sum;
}



    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);




/*
Question 1 --> Write a java method to print multiplication  table of a number n.
*/

    // _12_Practice_Set_Methods obj=new _12_Practice_Set_Methods();
    // System.out.print("Enter Number to Table: ");
    // int n=sc.nextInt();
    // System.out.println(obj.table(n));

    // table(3); // This will run when static will get added at the start of method
    



/*
Question 2 --> Write a program using function to print the following pattern:
*
* *
* * *
* * * *
*/
// star(6);



/*
Question 3 --> Write a recursive function to calculate sum of first n natural numbers.
*/
// System.out.print("Enter Number: ");
// int n=sc.nextInt();
// System.out.println(sum_till_n_Recursive(n));





/*
Question 4 --> Write a program using function to print the following pattern:
* * * *
* * *
* *
*

*/
// stars_Reverse(5);





/*
Question 5 --> Write a function nth term of fibonacci series usin grecursion.
*/
// System.out.println(fibonacci_recursion(3));





/*
Question 6 --> Write a function to find average of a set of numbers passed as arguments.
*/
// System.out.println(average(3,5,3,9));





/*
Question 7 --> Repeat 2 using Recursion.
*/
// stars_Recursion(6);





/*
Question 8 --> Repeat 4 using Recursion.
*/






/*
Question 9 --> Write a function to convert celcius temperature into fahrenheit. 
*/
// System.out.print("Enter Value in Celcius: ");
// int n=sc.nextInt();
// System.out.println(n+" °C = "+celcius_to_fahrenheit(n) +" °F");






/*
Question 10 --> Repeat 3 using iterative approach.
*/
System.out.print("Enter Number: ");
int n=sc.nextInt();
System.out.println(fibonacci_recursion(n));



    }
}
