package OVChipkaart;

public class Locatie {
	private double x;
	private double y;
	private String locatie;
	
	public Locatie(double x, double y, String naam) {
		this.x = x;
		this.y = y;
		this.locatie = naam;
	}

	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}

	public String getLocatie(){
        return this.locatie;
    }
}