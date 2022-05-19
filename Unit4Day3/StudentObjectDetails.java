package Unit4Day3;

public class StudentObjectDetails {
	
	int roll;
	int marks;
	String name;
	
	void displayStudentDetails() {
		System.out.printf("Roll is : %d \nName is : %s \nMarks is : %d",roll, name, marks);
	}
	
	public static void main(String[] args) {
		
		StudentObjectDetails sod = new StudentObjectDetails();
		
		sod.roll = 2;
		sod.marks = 500;
		sod.name = "Shyam";
		
		sod.displayStudentDetails();
	}
}
