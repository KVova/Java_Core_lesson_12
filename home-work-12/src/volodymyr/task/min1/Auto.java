package volodymyr.task.min1;

public class Auto {

	private int numberOfHorsepower;
	private int graduationYear;
	private Engine engine;
	private Helm helm;
	
	public Auto(int numberOfHorsepower, int graduationYear, Helm helm, Engine engine) {
		super();
		this.numberOfHorsepower = numberOfHorsepower;
		this.graduationYear = graduationYear;
		this.engine = engine;
		this.helm = helm;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public void setNumberOfHorsepower(short numberOfHorsepower) {
		this.numberOfHorsepower = numberOfHorsepower;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(short graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Auto [numberOfHorsepower=" + numberOfHorsepower + ", graduationYear=" + graduationYear + ", engine="
				+ engine + ", helm=" + helm + "]";
	}
	
}