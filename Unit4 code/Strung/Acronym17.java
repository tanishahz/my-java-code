
import java.util.*;

public class Acronym17 {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        String sentence;
        System.out.println("Enter the Statement : ");
        sentence = st.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(word.charAt(0));
            }
        }

        System.out.println("Acronym: " + acronym.toString().toUpperCase());
    }
}
