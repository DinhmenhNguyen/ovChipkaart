package OVChipkaart;

import java.util.Scanner;

public class Paal {

	Scanner sc = new Scanner(System.in);

	private double instap;
	private Locatie locatie;

	public Paal(Locatie string) {
		this.locatie = string;
	}

	public void checkInScan(OVChipkaart ovChip) {
		if (ovChip.getGeldigheid() == true) {
			if (ovChip.getSaldo() >= 20.0 + this.instap) {
				ovChip.checkInLocatie(this.locatie);
				System.out.println("Kosten = €" + this.instap);
				System.out.println("Transactie gaat door, poort gaat open");
				ovChip.saldoAftrekken(this.instap);
				System.out.println("Saldo = €" + ovChip.getSaldo());
				System.out.println(ovChip.getLocatie().getLocatie() + "\n");
			} else {
				System.out.println("Transactie is gefaald, poort blijft dicht");
			}
		} else {
			System.out.println("Kaart is niet geldig");
		}
	}

	public void checkUitScan(OVChipkaart ovChip) {
		if (ovChip.getLocatie() != this.locatie) {
			if (ovChip.getSaldo() > 20.0) {
				if (ovChip.getGeldigheid() == true) {
					System.out.println("Je bent uitgecheckt");
					ovChip.checkInLocatie(this.locatie);
					System.out.println(ovChip.getLocatie().getLocatie());
				}
			}
		}
	}

	public Locatie getLocatie(Locatie locatie) {
		return this.locatie = locatie;
	}

	public double getTarief() {
		return this.instap;
	}

	public double tariefBerekenaar(Locatie x, Locatie y) {
		double a = x.getX() - locatie.getX();
		double b = y.getY() - locatie.getY();
		double c = a * a + b * b;
		double wortel = Math.sqrt(c);
		double som = wortel * 2;
		return this.instap = som;
	}
}
