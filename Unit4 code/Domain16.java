
public class Domain16 {

    public static void main(String[] args) {
        String email = "john.doe@gmail.com";

        int atIndex = email.indexOf('@');
        String domain = email.substring(atIndex + 1);

        System.out.println("Domain: " + domain);
    }
}
