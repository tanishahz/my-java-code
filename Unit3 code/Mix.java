
import java.util.Scanner;

public class Mix {

    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        int var1;
        int var2;
        System.out.print("Enter the Number var1 : ");
        var1 = tc.nextInt();
        System.out.print("Enter the Number var2 : ");
        var2 = tc.nextInt();
        int sum = var1 + var2;
        int sub = var1 - var2;
        int mul = var1 * var2;

        System.out.println(" The Sum of Two number is :  " + sum);
        System.out.println(" The Sub of Two number is :  " + sub);
        System.out.println(" The Mul of Two number is :  " + mul);
        tc.close();
    }

}
