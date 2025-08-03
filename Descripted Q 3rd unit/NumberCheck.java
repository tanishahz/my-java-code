
import java.util.Scanner;

public class NumberCheck {

    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        int num;
        System.out.print("Enter Your Number : ");
        num = tc.nextInt();
        if (num > 0) {
            System.out.println(num + "  The Number is Positive ");
        }
        if (num < 0) {
            System.out.println(num + "  The Number is Negative ");
        }
        if (num == 0) {
            System.out.println(num + "  The Number is 0 ");
        } else {
            System.out.println(num + "  Number is zero ");
        }
        tc.close();
    }

}
