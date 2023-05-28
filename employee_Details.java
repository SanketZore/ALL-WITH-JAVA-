class Employee {
    int year, salary;
    String address, empName;

    public void EmployeeInfo(int year, String empName, int salary, String address) {
        System.out.println(empName + "\t\t" + year + "\t\t" + address);
    }

}

public class employee_Details {
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println("Name\t   Year of Joining\t  Address");
        employee.EmployeeInfo(2022, "sanket", 150000, "400030-worli");
        employee.EmployeeInfo(2020, "Rohit", 200000, "400045-worli");
        employee.EmployeeInfo(2021, "Mohit", 125000, "307830-worli");
    }
}
