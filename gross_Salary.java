import java.util.Scanner;

class salary {

    void salary_calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("EmpName: ");
        String name = sc.next();
        System.out.print("Basic: ");
        int basic = sc.nextInt();
        System.out.print("EmpNo: ");
        int empNo = sc.nextInt();
        sc.close();
        float grossSalary, netSalary;
        float da = (70 * basic) / 100, hra = (30 * basic) / 100, pf = (10 * basic) / 100;
        int basic_CCA = 240, pt = 100;
        System.out.format("\nEmployee No:" + empNo + "\t" + "Name:" + name + "\t" + "Basic:" + basic + "\n");
        grossSalary = basic + da + hra;
        netSalary = grossSalary - (basic_CCA - pt - pf);
        System.out.println("Gross Salary:" + grossSalary + "\tNet Salary:" + netSalary);
    }
}

public class gross_Salary {
    public static void main(String[] args) {
        salary sal = new salary();
        sal.salary_calculator();
    }
}