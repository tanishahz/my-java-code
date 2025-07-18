class Student{
	String name ;
	int rollNo;
	String Address;
	String Subject[] = new String[5];
	public void SetName(String S){
		name = S;
	}
	public void SetrollNo(int N){
        
	 rollNo = N;
	}
	public void SetAddress(String Y){
        Address = Y;
	}
	public void SetSubjects(String S1,String S2,String S3,String S4,String S5){
        Subject[0]= S1;
		Subject[1]= S2;
		Subject[2]= S3;
		Subject[3]= S4;
		Subject[4]= S5;
	}

     public void displayData(){
	 System.out.println("Student name " + name);
     System.out.println("Student rollNo " + rollNo);
     System.out.println("Student Address " + Address);
     System.out.println("Student Subject " + Subject[0]+ ", " +Subject[1]+ ", " +Subject[2]+ ", " +Subject[3]+ ", " +Subject[4]);	 
	}
}