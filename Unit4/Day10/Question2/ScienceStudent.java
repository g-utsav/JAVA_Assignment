package Unit4.Day10.Question2;

public class ScienceStudent extends Student{

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	double getPercentage(){
		return ((double)(this.chemistryMarks + this.phisicsMarks + this.mathsMarks ) / 300)*100;
	}
	
	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name , address);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	
	public ScienceStudent() {
		super();
	}

}
