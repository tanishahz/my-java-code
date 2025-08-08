import java.util.Scanner;

public class ForeachL23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5]; 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the No. " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("No." + (i + 1) + " = " + arr[i]);
        }
    }
}
