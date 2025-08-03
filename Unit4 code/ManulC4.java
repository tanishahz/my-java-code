
import java.util.Scanner;

public class ManulC4 {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String str1;
        String str2;
        System.out.print("Enter the string One : ");
        str1 = st.nextLine();
        System.out.print("Enter thr strings Two :  ");
        str2 = st.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Strings are Equal ");
            return;
        }
        boolean equal = true;
        for (int i = 0; i <= str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i));
            equal = false;
            break;
        }

        System.out.println(equal ? "Strings are equal" : "Strings are not equal");
    }

}
