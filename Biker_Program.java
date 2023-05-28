
import java.util.*;

class Biker {
    int sum;

    public void Biker() {
        Scanner sc = new Scanner(System.in);

        int[] speed = new int[5];
        System.out.println("Enter the speed of Bikers:");
        for (int i = 0; i <= 4; i++) {
            speed[i] = sc.nextInt();
            sum += speed[i];
        }
        sc.close();

        float avg = sum / 5f;
        System.out.format("\nAverage Speed Of Biker is %f", avg);

        System.out.println("\nQualifing Bikers Are:");
        for (int j = 0; j <= 4; j++) {
            if (speed[j] > avg) {
                System.out.println(speed[j]);
            }
        }

    }
}

public class Biker_Program {
    public static void main(String[] args) {
        Biker race = new Biker();
        race.Biker();
    }
}
