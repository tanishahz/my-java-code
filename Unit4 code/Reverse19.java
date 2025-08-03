
public class Reverse19 {

    public static void main(String[] args) {
        String input = "ABCDEFGHI";

        int start = 2;
        int end = 6;

        String before = input.substring(0, start);
        String toReverse = input.substring(start, end + 1);
        String after = input.substring(end + 1);
        String reversedPart = new StringBuilder(toReverse).reverse().toString();

        String result = before + reversedPart + after;

        System.out.println("Modified string: " + result);
    }
}
