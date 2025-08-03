
public class LastW13 {

    public static void main(String[] args) {
        String sentence = "Java is awesome";

        int lastSpaceIndex = sentence.lastIndexOf(' ');
        String lastWord = sentence.substring(lastSpaceIndex + 1);

        System.out.println("Last word: \"" + lastWord + "\"");
    }
}
