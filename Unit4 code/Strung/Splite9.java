
public class Splite9 {

    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
