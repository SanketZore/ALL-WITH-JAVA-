import java.util.*;

public class tempCodeRunnerFile {

    public void passwordValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LoginId: ");
        String LoginId = sc.nextLine();
        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        if (password.matches("[0-9]") && password.matches("[@#$]") && password.length() >= 8) {
            System.out.println("Login Sudessfull !");
        } else {
            System.out.println("Please Enter Valid Password of Length 8 containing one Digit and Special Symbol.");
        }
    }

    public static void main(String[] args) {
        tempCodeRunnerFile password = new tempCodeRunnerFile();
        password.passwordValidation();
    }

}