package Unit4.Day7.Question2;

public class DayScholar extends Student{

	double transportFee;
	
	@Override
	double payFee(double amt) {
		return (this.examFee+this.transportFee - amt);
	}
	
	public DayScholar() {
		super();
	}
	
	public DayScholar(double transportFee, int studId, String name, double examFee) {
		super( studId, name, examFee);
		this.transportFee = transportFee;
	}
	
}
