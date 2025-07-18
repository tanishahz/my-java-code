
import java.util.Scanner;

public class Div {

    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        int var1;
        System.out.print("Enter the Number var1 : ");
        var1 = tc.nextInt();

        if (var1 % 3 == 0 && var1 % 5 == 0) {
            System.out.println(var1 + "  The  Number is divisible by Both 3 and 5   ");
        } else if (var1 % 3 == 0) {
            System.out.println(var1 + "  The  Number is Only divisible By 3 ");
        } else if (var1 % 5 == 0) {
            System.out.println(var1 + "  The  Number is Only divisible By 5 ");
        } else {
            System.out.println(var1 + "  The Number is not devisible  ");
        }
        tc.close();
    }

}
