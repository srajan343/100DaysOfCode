
class student{
	int rollno;
	String name;
	
	public void print(int rollno) {
		System.out.println(rollno);
	}
	
	public void print(String name) {
		System.out.println(name);
	}
	
	public void print(String name , int rollno) {
		System.out.println( name + " " +  rollno);
	}
	
	
	
}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.name = "srajan";
		s1.rollno = 1;
		
		s1.print(s1.name);

	}

}
