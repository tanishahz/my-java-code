
import java.util.Scanner;

public class school {

    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);
        char grade;
        System.out.print("Enter a numbers : ");
        grade = i.next().charAt(0);

        switch (grade) {
            case 'A', 'a':
                System.out.println("Excellent");
                break;
            case 'B', 'b':
                System.out.println("Good");
                break;
            case 'C', 'c':
                System.out.println("Average");
                break;
            case 'D', 'd':
                System.out.println("Fail");
                break;
            default:
                System.out.println(" You Enter The  Wrong Grade");
        }

        i.close();
    }
}
