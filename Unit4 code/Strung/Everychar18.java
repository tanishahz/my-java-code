
public class Everychar18 {

    public static void main(String[] args) {
        String input = "abcdefg";

        System.out.print("Every second character: ");
        for (int i = 1; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
