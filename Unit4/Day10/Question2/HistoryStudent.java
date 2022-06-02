package Unit4.Day10.Question2;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	@Override
	double getPercentage() {
		return ((double)(this.historyMarks + this.civicsMarks) / 200)*100;
	}
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name , address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	
	public HistoryStudent() {
		super();
	}
}
