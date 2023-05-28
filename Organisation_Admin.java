import java.util.Scanner;


class Organization {


}


class Department extends Organization {
private int departmentNo, headOfDepartment; private String departmentName;

Department(int departmentNo, String departmentName) { this.departmentNo = departmentNo; this.departmentName = departmentName;
}


public void setHeadOfDepartment(int headOfDepartment){
 
this.headOfDepartment = headOfDepartment;

}


public void displayDepartment(){ System.out.println("Department Number:"+departmentName); System.out.println("Department Name:"+departmentNo); System.out.println("Head of Department:");
System.out.println(" Employee Number:"+headOfDepartment);
}

}


class Employee extends Organization { private int employeeNo;
private float salary, increment; private String name;

Employee(int employeeNo, float salary, String name, float increment) { this.employeeNo = employeeNo;
this.salary = salary; this.name = name; this.increment = increment;
}
public void displayEmployee(){ System.out.println("\nEmployee Number:"+employeeNo); System.out.println("Employee Name:"+name); System.out.println("Employee Salary:"+salary);
System.out.println("Employee Salary next year:"+(salary+increment));
}
}
 

class Organisation_Admin {
public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
System.out.println("Please set the Department Number:"); int departmentNo = scanner.nextInt();
scanner.nextLine();
System.out.println("Please set the Department Name:"); String departmentName = scanner.nextLine();
Department department = new Department(departmentNo, departmentName); System.out.println("Enter the number of employees you want to add: ");
int n = scanner.nextInt();
Employee[] employees = new Employee[n]; for(int i=0;i<n;i++) {
System.out.println("Please set the Employee Number:"); int employeeNo = scanner.nextInt();
scanner.nextLine();
System.out.println("Please set the Employee Name:"); String employeeName = scanner.nextLine(); System.out.println("Please set the Employee Salary:"); float salary = scanner.nextFloat(); System.out.println("Please set the Employee Increment:"); float increment = scanner.nextFloat();
Employee employee = new Employee(employeeNo, salary, employeeName, increment); employees[i]=employee;
}
System.out.println("Please select one of the employees to be the Head of Department: "); int headOfDepartment = scanner.nextInt(); department.setHeadOfDepartment(headOfDepartment);
 

department.displayDepartment();
System.out.println("Employees in department "+departmentName+":"); for(int i=0;i<n;i++){
employees[i].displayEmployee();
}




}

}
