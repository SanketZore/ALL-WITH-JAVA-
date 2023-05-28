

import java.util.*;  class employee{      int salary=100000; }  public class Executive extends employee {     Scanner sc=new Scanner(System.in);      float bonus=(0.5f*salary);     float Total_salary=(0.5f*salary)+salary;      public static void main(String[] args){          Executive exe=new Executive();         System.out.println("Salary: "+exe.salary);         System.out.println("Bonus: "+exe.bonus);         System.out.println("Total Salary: "+exe.Total_salary);     } }
