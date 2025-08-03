
import java.util.*;

public class sumR {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, rem, sum = 0;

        System.out.print("Enter a 5-digit number: ");
        num = sc.nextInt();

        for (int i = 1; i <= 5; i++) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
