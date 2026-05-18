
public class Student {
	static String clgName;
	String emailid,roll,name;
	
	Student(String name,String emailid,String roll)
	{
		this.name = name;
		this.emailid = emailid;
		this.roll = roll;
	}
	
	void display()
	{
		System.out.println("Name : " + this.name);
		System.out.println("Emailid : "+this.emailid);
		System.out.println("Roll : "+this.roll);
	}
	
	public String toString()
	{
		return this.name;
	}
	public static void main(String[] args) {
		Student.clgName = "NMIMS";
		
		Student s1 = new Student("Alpha","a@nmims.com","A123");
		
		Student s100 = new Student("Beta", "b@nmims.com","A111");
		s100.display();
		System.out.println(s1.name);
		System.out.println(s1.toString());
	}
}
