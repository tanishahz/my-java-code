
public class Acronym17 {

    public static void main(String[] args) {
        String sentence = "Central Bureau of Investigation";

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
