package namakkal;

public class School {
	String name;
	int rollNo;

	public School(String name, int rollNo) // constructor
	{
		System.out.println("how are you");
		this.name=name;
		this.rollNo=rollNo;
		
	}
	        //constructor overloading

	public School(String fname, String lname, int rollNo) {
		// TODO Auto-generated constructor stub
		this.name = fname+lname;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		
		School student1 = new School("bharani",100);
		School student2 = new School("santhiya",101);
		School student3 = new School("kalai","arasan",101);
//		System.out.println(student1.name);
//		System.out.println(student2.name);
//		System.out.println(student1.rollNo);
//		System.out.println(student2.rollNo);
		
		student1.participate();
		student2.write_exam();
		student3.participate();
	}

	private void participate() {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}

	private void write_exam() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
