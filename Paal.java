package ovChipkaart;

public class Paal {

	private double instap;

	public Paal(double instap) {
		this.instap = instap;
	}

	public void scan(OVChipkaart ovChip) {
		if (ovChip.getSaldo() >= instap) {
			if (ovChip.getGeldigheid() == true) {
				System.out.println("Transactie gaat door, poort gaat open");
				ovChip.checkIn(this.instap);
				System.out.println("Ingecheckt = " + ovChip.getCheck());
			} else {
				System.out.println("Transactie is gefaald, poort blijft dicht");
				System.out.println("Ingecheckt = " + ovChip.getCheck());
			}
		}
	}
}
