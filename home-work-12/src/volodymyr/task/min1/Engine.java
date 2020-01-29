package volodymyr.task.min1;

public class Engine {

	private int numberOfCilinders;

	public Engine(int numberOfCilinders) {
		super();
		this.numberOfCilinders = numberOfCilinders;
	}

	public int getNumberOfCilinders() {
		return numberOfCilinders;
	}

	public void setNumberOfCilinders(int numberOfCilinders) {
		this.numberOfCilinders = numberOfCilinders;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCilinders=" + numberOfCilinders + "]";
	}
	
}