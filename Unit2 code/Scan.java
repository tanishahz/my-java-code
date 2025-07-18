import java.util.*;
public class Scan{
	public static void main(String[] args){
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the Name : "); 
	 String name;
	 int age;
	 name = sc.nextLine();
	System.out.print("Enter the Age : ");	
	age = sc.nextInt();
	System.out.println("Name: " + name);
	System.out.println("Age : " + age);
	 sc.close();
	}
}
	