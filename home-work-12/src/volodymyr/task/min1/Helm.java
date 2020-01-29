package volodymyr.task.min1;

public class Helm {

	private double helmDiametr;
	private String helmMaterial;
	
	public Helm(double helmDiametr, String helmMaterial) {
		super();
		this.helmDiametr = helmDiametr;
		this.helmMaterial = helmMaterial;
	}

	public double getHelmDiametr() {
		return helmDiametr;
	}

	public void setHelmDiametr(double helmDiametr) {
		this.helmDiametr = helmDiametr;
	}

	public String getHelmMaterial() {
		return helmMaterial;
	}

	public void setHelmMaterial(String helmMaterial) {
		this.helmMaterial = helmMaterial;
	}

	@Override
	public String toString() {
		return "Helm [helmDiametr=" + helmDiametr + ", helmMaterial=" + helmMaterial + "]";
	}
	
}