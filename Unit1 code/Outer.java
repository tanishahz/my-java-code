public class Outer{
	int value = 10;
public class Inner{
		void displayData(){
			System.out.println("Data Value :" + value);
		}
}
public static void main(String args[]){
	Outer object = new Outer();
	Outer.Inner in = object.new Inner();
	in.displayData();
}
	}