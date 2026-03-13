package ovChipkaart;

import java.time.LocalDate;

public class OVChipkaart {

	LocalDate tijd = LocalDate.now();

	private LocalDate geldigheid;
	private double saldo;
	private boolean ingecheckt = false;
	private int kaartNummer;
	
	public OVChipkaart(double saldo) {
		this.saldo = saldo;
	}
	
	

	public double getSaldo() {
		return this.saldo;
	}

	public boolean getCheck() {
		return this.ingecheckt;
	}

	public int getKaartNummer() {
		return this.kaartNummer = 12498221;
	}
	
	public void checkIn(double instap) {
		this.ingecheckt = true;
		this.saldo = this.saldo - instap;
	}
}
