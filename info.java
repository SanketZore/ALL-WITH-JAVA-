import java.util.*;

class university {
    int age;
    String name, program;

    public void university(int a, String n, String p) {
        name = n;
        age = a;
        program = p;
    }

    public void Display_student_info() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        university uni = new university();
        uni.university(20, "Sanket", "Mechanical");
        uni.Display_student_info();

        graduate_student gra = new graduate_student();
        gra.graduate_student("Science",88.33f);
        gra.Display_student_info();

        research_student res = new research_student();
        res.research_student("Masters",3);
        res.Display_student_info();
    }
}

class graduate_student extends university {
    float per_marks;
    String stream;

    public void graduate_student(String s, float m) {
        per_marks = m;
        stream = s;
    }

    public void Display_student_info() {
        System.out.println("Percentage: " + per_marks);
        System.out.println("Stream: " + stream);
    }
}

class research_student extends graduate_student {
    String specialization;
    int year_of_exp;

    public void research_student(String spec,int y) {
        specialization = spec;
        year_of_exp = y;
    }

    public void Display_student_info() {
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience(Years): " + year_of_exp);
    }
}

