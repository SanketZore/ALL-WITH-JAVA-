import java.util.Scanner;

public class password_validity {
    public static void main(String[] args) {
        Validation();
    }

    private static void Validation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String s1 = scanner.nextLine();
        if (s1.matches("[0-9]") && s1.matches("[@#$]") && s1.length() >= 6 && s1.length() <= 20) {
            System.out.println("It is a valid password");
        } else {
            System.out.println("It is not a valid password");
        }
    }

}
