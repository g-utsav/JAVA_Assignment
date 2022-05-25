package Unit4.Day4.Question3;

public class Student {

	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCollageName() {
		return collageName;
	}
	
	public Student() {
		
	}
	public Student(int roll, String name, String address, String collageName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}

	
}
