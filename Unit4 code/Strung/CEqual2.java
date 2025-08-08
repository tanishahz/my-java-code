
import java.util.Scanner;

public class CEqual2 {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String name1 = "Java";
        String name2 = "java";
         System.out.println("Enter the Name 1 : " + name1.equals(name2));
        //name1 = st.nextLine();
         System.out.println("Enter the Name2 : " + name1.equalsIgnoreCase(name2));
        // name2 = st.nextLine();
        // if (name1.equals(name2)) {
        //     System.out.println("Both Names are Same");
        // } else if (name1.equalsIgnoreCase(name2)) {

        //     System.out.println("Both Names are Same Egnor case : ");
        // } else {
        //     System.out.println("Both Names are Not Same ");
        // }
    }

}
