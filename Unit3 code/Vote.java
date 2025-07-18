
import java.util.Scanner;

public class Vote {

    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter the name : ");
        name = tc.nextLine();
        System.out.print("Enter the age : ");
        age = tc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for Voting");
        } else {
            System.out.println("You are  not eligible for Voting");
        }
        tc.close();
    }

}
