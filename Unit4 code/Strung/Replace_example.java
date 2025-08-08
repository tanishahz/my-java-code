
public class Replace_example {
    public static void main(String[] args) {
        String s1 = "Modification Example";
        String s = s1.replaceAll("[aeiouAEIOU]", "*");
        System.out.print(s);
    }
}
