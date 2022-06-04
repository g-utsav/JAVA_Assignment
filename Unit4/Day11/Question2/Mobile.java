package Unit4.Day11.Question2;

import java.util.regex.Pattern;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String... model) {
		for(int i=0; i<model.length; i++) {
			for(int j=0; j<this.outdatedModels.length; j++) {
				if(Pattern.matches(this.outdatedModels[j], model[i])) {
					System.out.println(model[i]+"_OUTDATED");
				}
			}				
		}
	}
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.searchOutdatedModel("a","note4","c");
	}
	
}
