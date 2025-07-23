
import java.util.Scanner;

public class DWL {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choices;
        do {

            System.out.println("1. Add ");
            System.out.println("2. Sub ");
            System.out.println("3. Mul ");
            System.out.println("4. Exit ");

            System.out.print("Enter the Number Between 1 to 3 :");
            choices = sc.nextInt();

            switch (choices) {
                case 1:

                    int var1,
                     var2;
                    System.out.print("Enter the  First number : ");
                    var1 = sc.nextInt();
                    System.out.print("Enter the  Second number : ");
                    var2 = sc.nextInt();
                    System.out.println(var1 + "And " + var2 + "Sum  is  = " + (var1 + var2));
                    break;
                case 2:
                    int var3,
                     var4;
                    System.out.print("Enter the  First number : ");
                    var3 = sc.nextInt();
                    System.out.print("Enter the  Second number : ");
                    var4 = sc.nextInt();
                    System.out.println("sub  = " + (var3 - var4));
                    break;
                case 3:
                    int var5,
                     var6;
                    System.out.print("Enter the  First number : ");
                    var5 = sc.nextInt();
                    System.out.print("Enter the  Second number : ");
                    var6 = sc.nextInt();
                    System.out.println("Mul = " + (var5 * var6));
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("You Choose Wrong Number ....");
                    System.out.println("Please Choose The Correct Number ...");
            }

        } while (true);
    }
}
