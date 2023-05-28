import java.util.*;


class university{
    int age;
    String name, program;
    public void university(int a,String n,String p){
        system.out.print("Enter Name: ");
        name=n;
        age=a;
        program=p;
    }
    public void Display_student_info(){
        system.out.print("Enter Name: "+name);
        system.out.print("Enter Program: "+program);
        system.out.print("Enter Age: "+age);
    }
}


class graduate_student extends university{
    int per_marks;
    String stream;
    public void graduate_student(String s,int m){
        per_marks=m;
        stream=s;
    }
    public void Display_student_info(){
        system.out.print("Enter Percentage: "+per_marks);
        system.out.print("Enter Stream: "+stream);
    }
}


class research_student extends graduate_student{
    String specialization;
    int year_of_exp;
    public void research_student(int y, String spec){
        specialization=spec;
        year_of_exp=y;
    }

    public void Display_student_info(){
        system.out.print("Enter Specialization: "+specialization);
        system.out.print("Enter Experience(Years): "+year_of_exp);
    }
}


class info{
     public static void main(String[] args){
	
	university uni=new university();
	uni.university(20,"Sanket","Mechanical");
	uni.Display_student_info();
	
	graduate_student gra=new graduate_student();
	gra.graduate_student(88.33,"Science");
	gra.Display_student_info();
	}
    
}