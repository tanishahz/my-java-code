
import java.util.Scanner;

public class FunctAll3 {

    public static void main(String[] args) {
        Scanner tu = new Scanner(System.in);
        String str;
        System.out.print("Enter the Statement : ");
        str = tu.nextLine();

        str = str.toLowerCase();
        str = str.trim();
        int consonants = 0, vowels = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
