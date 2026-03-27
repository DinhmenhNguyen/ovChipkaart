package OVChipkaart;

public class Locatie {
	private int x;
	private int y;
	private String naam;
	
	public Locatie(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}