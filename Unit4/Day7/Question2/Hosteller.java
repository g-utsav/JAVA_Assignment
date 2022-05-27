package Unit4.Day7.Question2;

public class Hosteller extends Student{

	double hostelFee;
	
	@Override 
	public double payFee(double amt) {
		return (this.hostelFee+this.examFee-amt);
	}
	
	public Hosteller() {
		super();
	}
	
	public Hosteller(double hostelFee, int studId, String name, double examFee) {
		super( studId, name, examFee);
		this.hostelFee = hostelFee;
	}
	
}
