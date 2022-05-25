package Unit4.Day5.Question1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void calculateNetSalary(int pfpercentage) {
		this.netSalary = this.salary - (this.salary * ((double)pfpercentage/100));
	}
	
}
