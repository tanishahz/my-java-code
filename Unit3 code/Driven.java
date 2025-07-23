
import java.util.Scanner;

public class Driven {

    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);
        int choice;

        System.out.println(" --MENU-- ");
        System.out.println(" 1. Check Odd or Even : ");
        System.out.println(" 2. Multiply Two Values: ");
        System.out.println(" 3. Add Two numbers : ");
        System.out.println(" 4. Exit : ");
        System.out.print(" 4. Enter Your Choice(1-4) : ");
        choice = i.nextInt();

        switch (choice) {
            case 1:
                int num;
                System.out.print("Enter a Number : ");
                num = i.nextInt();
                if (num % 2 == 0) {
                    System.out.println("THis is a Even Number : ");
                } else {
                    System.out.println("THis is a Odd Number");
                }
                break;
            case 2:
                int var1;
                int var2;
                int mul;
                System.out.print("Enter the first Number :");
                var1 = i.nextInt();
                System.out.print("Enter the Second Number :");
                var2 = i.nextInt();
                mul = var1 + var2;
                System.out.println("Mul :" + mul);

                break;
            case 3:
                int var3;
                int var4;
                int sum;
                System.out.print("Enter the first Number :");
                var3 = i.nextInt();
                System.out.print("Enter the Second Number :");
                var4 = i.nextInt();
                sum = var3 + var4;
                System.out.println("sum :" + sum);
                break;
            case 4:

                System.exit(0);
                break;
            default:
                System.out.println(" ");
        }

        i.close();
    }
}
