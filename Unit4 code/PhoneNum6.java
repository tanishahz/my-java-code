
public class PhoneNum6 {

    public static void main(String[] args) {
        String phone = "9876543210";
        String masked = "******" + phone.substring(phone.length() - 4);
        System.out.println("Masked Phone: " + masked);
    }
}
