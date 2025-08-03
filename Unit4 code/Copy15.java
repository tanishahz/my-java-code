
public class Copy15 {

    public static void main(String[] args) {
        String input = "ComputerScience";

        char[] charArray = new char[6];

        input.getChars(0, 6, charArray, 0);

        System.out.print("First 6 characters: ");
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
