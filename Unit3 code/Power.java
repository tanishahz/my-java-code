
public class Power {

    public static void main(String[] args) {
        int result = 1;

        System.out.println("Powers of 2 from 2^0 to 2^5:");

        for (int n = 0; n <= 5; n++) {
            System.out.println("2^" + n + " = " + result);
            result = result * 2;
        }
    }
}
