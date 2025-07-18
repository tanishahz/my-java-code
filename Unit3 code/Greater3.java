
import java.util.Scanner;

public class Greater3 {

    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        int var1;
        int var2;
        int var3;
        System.out.print("Enter the Number var1 : ");
        var1 = tc.nextInt();
        System.out.print("Enter the Number var2 : ");
        var2 = tc.nextInt();
        System.out.print("Enter the Number var3 : ");
        var3 = tc.nextInt();

        if (var1 > var2) {
            System.out.println(var1 + " The number is Greatest  ");
        }
        if (var2 > var3) {
            System.out.println(var2 + " The number is Greatest  ");
        } else {
            System.out.println(var3 + " The number is Greatest  ");
        }
        tc.close();
    }

}
