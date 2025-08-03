
import java.util.Scanner;

public class SubStr14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence or word: ");
        String input = scanner.nextLine();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        if (start >= 0 && end <= input.length() && start < end) {
            String result = input.substring(start, end);
            System.out.println("Extracted substring: \"" + result + "\"");
        } else {
            System.out.println("Invalid indices.");
        }

        scanner.close();
    }
}
