class Student{
	String name;
	int age;
	void displayData(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
	public class Main{
		public static void main(String args[]){
			Student si = new Student();
			si.name = "Akash";
			si.age = 21;
			si.displayData();
		}
	}