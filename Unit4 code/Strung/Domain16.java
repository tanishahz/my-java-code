
import java.util.Scanner;

public class Domain16 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String email;
        System.out.print("Enter Your @gmail i'd : ");
        email = i.nextLine();
        int atIndex = email.indexOf('@');
        String domain = email.substring(atIndex + 1);

        System.out.println("Domain: " + domain);
    }
}
