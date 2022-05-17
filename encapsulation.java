class student1{
	private int rollno;
	private String name ;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1 = new student1();
		s1.setName("srajan");
		s1.setRollno(20);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());

	}

}
