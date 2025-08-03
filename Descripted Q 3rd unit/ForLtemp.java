
public class ForLtemp {

    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 30 divisible by 3:");

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
