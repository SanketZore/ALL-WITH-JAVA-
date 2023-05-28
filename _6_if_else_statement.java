import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class _6_if_else_statement {
    public static void main(String[] args) {

// 1) Question

        // int a=10;
        // if(a==11){
        //     System.out.println("I am 11");
        // }else {
        //     System.out.println("I am 10");
        // }


// 2) Question

        //     byte physics,chemistery,maths;
        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("Enter Marks Out of 100.");
        // System.out.println("Enter marks of Physics: ");
        // physics=sc.nextByte();
        // System.out.println("Enter marks of Physics: ");
        // chemistery=sc.nextByte();
        // System.out.println("Enter marks of Physics: ");
        // maths=sc.nextByte();
        // float avg=(physics + chemistery+maths)*100.00f/300;
        // if(avg>=40 || (physics>=33) && (chemistery>=33) && (maths>=33)){
        //     System.out.println(avg);
        //     System.out.println("You are Pass!");
        // }else{System.out.println("You are Fail!");}
        

// 3) Question

        // System.out.print("Enter Your Annual Income: ");
        // Scanner sc=new Scanner(System.in);
        // int income = sc.nextInt();
        // if( income>=250000 && income<500000){
        //     int tax=5;
        //     int tax_rs=(income*tax)/100;
        //     System.out.println("Tax Incurred on You is "+ tax);
        //     System.out.println("Tax of Rs "+ tax_rs +" is applied.");
        // }else{
        //     if( income>=500000 && income<1000000){
        //         int tax=20+5;
        //         int tax_rs=(income*tax)/100;
        //         System.out.println("Tax Incurred on You is "+ tax);
        //         System.out.println("Tax of Rs "+ tax_rs +" is applied.");
        //     }else{
        //         if(income>=1000000){
        //             int tax=30+25;
        //             int tax_rs=(income*tax)/100;
        //             System.out.println("Tax Incurred on You is "+ tax);
        //             System.out.println("Tax of Rs "+ tax_rs +" is applied.");
        //         }else{
        //             System.out.println("\n\t\tCongrajulations! You are Tax Free.\n");
        //         }   
        //     }
        // }


// 4) Question

            // System.out.println("Enter Number from 1 to 7");
            // Scanner sc=new Scanner(System.in);
            // System.out.print("Enter a Number: ");
            // Byte num=sc.nextByte();
            // switch(num){
            //     case 1:System.out.println("Monday");break;
            //     case 2:System.out.println("Tuesday");break;
            //     case 3:System.out.println("Wednesday");break;
            //     case 4:System.out.println("Thursday");break;
            //     case 5:System.out.println("Friday");break;
            //     case 6:System.out.println("Saturday");break;
            //     case 7:System.out.println("Sunday");break;
            //     default:System.out.println("Enter a Valid Number");
            // }


                            // Enhanced Switch

            // System.out.println("Enter Number from 1 to 7");
            // Scanner sc=new Scanner(System.in);
            // System.out.print("Enter a Number: ");
            // Byte num=sc.nextByte();
            // switch(num){
            //     case 1 -> System.out.println("Monday");
            //     case 2 -> System.out.println("Tuesday");
            //     case 3 -> System.out.println("Wednesday");
            //     case 4 -> System.out.println("Thursday");
            //     case 5 -> System.out.println("Friday");
            //     case 6 -> System.out.println("Saturday");
            //     case 7 -> System.out.println("Sunday");
            // }



// 5) Question

        // System.out.print("Enter a Year: ");
        // Scanner sc=new Scanner(System.in);
        // int leapYear=sc.nextInt();
        // if((leapYear%4==0 && leapYear%100!=0) || leapYear%400==0){
        //     System.out.println("Year is a Leap Year.");
        // }else{
        //     System.out.println("Year is Not a Leap Year.");
        // }



// 6) Question

        // System.out.println("Enter Your Website URL link: ");
        // Scanner sc=new Scanner(System.in);
        // String urlLink=sc.next();
        // if(urlLink.endsWith(".com")){
        //     System.out.println("This is an Commercail Website.");
        // }
        // if(urlLink.endsWith(".org")){
        //     System.out.println("This is an Organizational Website.");
        // }
        // if(urlLink.endsWith(".in")){
        //     System.out.println("This is an Indian Website.");
        // }


// 7) Question          ROCK--PAPER--SCISSOR

    // Random number=new Random();
    // int randomNumber=number.nextInt(4);    // generates number less than 4.
    // System.out.println("1 --> Scissor ; 2 --> Rock ; 3 --> Paper");
    // Scanner sc=new Scanner(System.in);
    // byte user=sc.nextByte();

    // if((user==1 && randomNumber==1) || ((user==2 && randomNumber==2)) ||((user==3 && randomNumber==3))){
    //     if(randomNumber==1 && user==1){
    //         System.out.println("You Selected: Scissor");
    //         System.out.println("computer Selected: Scissor");}
    //         else if(randomNumber==2 && user==2){
    //         System.out.println("computer Selected: Rock");
    //         System.out.println("You Selected: Rock");}
    //         else{
    //         System.out.println("computer Selected: Paper");
    //         System.out.println("You Selected: Paper");}

    //         System.out.println("Game is TYE! ");

    // }else
    // if(user==1 && randomNumber==2){
    //     System.out.println("You Selected: Scissor");
    //     System.out.println("computer Selected: Rock");
    //     System.out.println("Computer Win!");}
    // else if(user==1 && randomNumber==3){
    //     System.out.println("You Selected: Scissor");
    //     System.out.println("computer Selected: Paper");
    //     System.out.println("You win!");}
    // else if(user==2 && randomNumber==3){
    //     System.out.println("You Selected: Rock");
    //     System.out.println("computer Selected: Paper");
    //     System.out.println("Computer Win!");}
    // else if(user==2 && randomNumber==1){
    //     System.out.println("You Selected: Rock");
    //     System.out.println("computer Selected: Scissor");
    //     System.out.println("You win!");}
    // else if(user==3 && randomNumber==1){
    //     System.out.println("You Selected: Paper");
    //     System.out.println("computer Selected: Scissor");
    //     System.out.println("Computer Win!");}
    // else if(user==3 && randomNumber==2){
    //     System.out.println("You Selected: Paper");
    //     System.out.println("computer Selected: Rock");
    //     System.out.println("You win!");}
    // if(user>3 || user<1){System.out.println("Invalid Input! Please Enter Valid Input.");}
    


    }
    
}
