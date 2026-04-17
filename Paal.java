package OVChipkaart;

import java.util.Scanner;

public class Paal {

	Scanner sc = new Scanner(System.in);

	private double instapTarief = 20.0;
	private Locatie locatie;

	public Paal(Locatie string) {
		this.locatie = string;
	}

	public void checkInScan(OVChipkaart ovChip) {
		if (ovChip.getGeldigheid() == true) {
			if (ovChip.getSaldo() >= this.instapTarief) {
				ovChip.checkInLocatie(this.locatie);
				System.out.println("Goede reis");
				ovChip.saldoAftrekken(instapTarief);
				System.out.println("Saldo = €" + ovChip.getSaldo());
				System.out.println(ovChip.getLocatie().getLocatie() + "\n");
			} else {
				System.err.println("Onvoldoende saldo");
			}
		} else {
			System.err.println("Kaart ongeldig");
		}
	}

	public void checkUitScan(OVChipkaart ovChip) {
		if (ovChip.getLocatie() != this.locatie) {
			if (ovChip.getCheck() == true) {
				if (ovChip.getGeldigheid() == true) {
					double a = tariefBerekenaar(ovChip.getLocatie());
					ovChip.saldoAftrekken(a - instapTarief);
					System.out.println("Kosten = €" + a);
					System.out.println("Je bent uitgecheckt");
					ovChip.checkInLocatie(this.locatie);
					System.out.println(ovChip.getSaldo());
					System.out.println(ovChip.getLocatie().getLocatie());
				} else {
					System.err.println("Kaart ongeldig");
				}
			} else {
				System.err.println("Niet ingecheckt");
			}
		} else {
			System.err.println("Inchecken geannuleerd");
		}
	}

	public Locatie getLocatie(Locatie locatie) {
		return this.locatie = locatie;
	}

	public double tariefBerekenaar(Locatie locatie) {
		double som = this.locatie.afstandBerekenaar(locatie) * 2;
		return som;
	}
}
