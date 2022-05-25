package Unit4.Day4.Question1;

public class Student {


	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student(){
		
	}
	public Student(int roll, String name, int age, int marks) {
		this.roll = roll; 
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void setRoll(int val) {
		this.roll = val;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age >18 && age < 60) {
			this.age = age;
		}else {
			System.out.println("Enter Valid Age in the Range of 18 to 60.");
		}
	}
	public int getAge() {
		return age;
	}
	public void setMarks(int marks) {
		if(marks > 0 && marks < 500) {
			this. marks = marks;			
		}else {
			System.out.println("Enter valid marks int the range 0 to 500");
		}
	}
	public int getMarks() {
		return marks;
	}

	
}
