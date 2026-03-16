package ovChipkaart;

import java.time.LocalDate;

public class OVChipkaart {

	LocalDate tijd = LocalDate.now();

	private boolean geldigheid = true;
	private double saldo;
	private boolean ingecheckt = false;
	private int kaartNummer = 12498221;

	public OVChipkaart(double saldo) {
		this.geldigheid = true;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean getCheck() {
		return this.ingecheckt;
	}

	public int getKaartNummer() {
		return this.kaartNummer;
	}
	
	public boolean getGeldigheid() {
		return this.geldigheid;
	}

	public void checkIn(double instap) {
		this.ingecheckt = true;
		this.saldo = this.saldo - instap;
	}
}
