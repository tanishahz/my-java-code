
public class Replace10 {

    public static void main(String[] args) {
        String date = "2025-07-26";
        String modified = date.replace("-", "/");
        String[] parts = modified.split("/");
        String joined = String.join(":", parts);
        System.out.println("Original: " + date);
        System.out.println("Modified: " + joined);
    }
}
