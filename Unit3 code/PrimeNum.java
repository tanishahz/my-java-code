
import java.util.Scanner;

public class PrimeNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;

        System.out.print("Enter a number to check if it is Prime: ");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number");
            } else {
                System.out.println(num + " is not a Prime number");
            }
        }
    }
}
