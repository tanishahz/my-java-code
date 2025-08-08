
import java.util.*;

public class Copy15 {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String input;
        System.out.print("Enter the Statement : ");
        input = st.nextLine();
        char[] charArray = new char[6];

        input.getChars(0, 6, charArray, 0);

        System.out.print("First 6 characters: ");
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
