import java.util.Scanner;

public class Strinin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[5]; 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Name: " + (i + 1) + " : ");
            arr[i] = sc.nextLine();
        }
        System.out.println("\n--- Printed Name ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("No." + (i + 1) + " = " + arr[i]);
        }
    }
}
