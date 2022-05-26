package Unit4.Day5.Question1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void calculateNetSalary(int pfpercentage) {
		this.netSalary = this.salary - (this.salary * ((double)pfpercentage/100));
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public Employee(int employeeId, String employeeName, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Employee() {

	}
	
	
}
