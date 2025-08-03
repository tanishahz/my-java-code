
import java.util.Scanner;

public class AllMS1 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        String str1;
        String str2;

        System.out.print("Enter the String one : ");
        str1 = i.nextLine();
        System.out.print("Enter the String Two : ");
        str2 = i.nextLine();
        System.out.println("Length of  string 1 =  " + str1.length());
        System.out.println("Length of string 2  = " + str2.length());
        System.out.println("First character is: " + str1.charAt(0));
        System.out.println("First character is: " + str2.charAt(0));
        System.out.println("Strating   space and End  white space is remove : " + str1.trim());
        System.out.println("Strating   space and End  white space is remove : " + str2.trim());
        String str3 = str1.substring(2, 3);
        String str5 = str2.substring(2, 3);
        System.out.println("Print the subString element of string First : " + str3);
        System.out.println("Print the subString element of string First : " + str5);
        String str4 = str1.concat(str2);
        System.out.println("Add my string str1 and str2 : " + str4);

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equals :  ");
        } else {
            System.out.println("Strings are not equals : ");
        }

    }
}
