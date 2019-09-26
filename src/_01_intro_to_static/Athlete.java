package _01_intro_to_static;

public class Athlete {
	static int maxHeight = 60;
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

	int height;
	
	public Athlete(int height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		Athlete jane = new Athlete(40);
		
		if (jane.height < Athlete.maxHeight)
			jane.run();
	
		Athlete tony = new Athlete(3);
		
		if (tony.height < Athlete.maxHeight)
			tony.run();
	}
	void run() {
	
	}
}
