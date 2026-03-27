package OVChipkaart;

public class Paal {

	private double instap;
	private Locatie locatie;

	public Paal(double instap, Locatie locatie) {
		this.instap = instap;
		this.locatie = locatie;
	}

	public void scan(OVChipkaart ovChip) {
		if (ovChip.getSaldo() >= instap) {
			if (ovChip.getGeldigheid() == true) {
				System.out.println("Transactie gaat door, poort gaat open");
				ovChip.checkIn(this.instap, locatie);
				System.out.println(ovChip.getLocatie());
				System.out.println("Ingecheckt = " + ovChip.getCheck());
			} else {
				System.out.println("Transactie is gefaald, poort blijft dicht");
				System.out.println("Ingecheckt = " + ovChip.getCheck());
			}
		}
	}
	
	public double tariefBerekenaar(Locatie l) {
		int a = l.getX() - locatie.getX();
		int b = l.getY() - locatie.getY();
		int c = a*a + b*b;
		double wortel = Math.sqrt(c);
		return wortel;
	}
}
