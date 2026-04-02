package OVChipkaart;

import java.time.LocalDate;

public class OVChipkaart {

	LocalDate tijd = LocalDate.now();

	private boolean geldigheid = true;
	private double saldo;
	private boolean ingecheckt = false;
	private Locatie oorsprong;
	private int kaartNummer = 1213821;

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
	
	public Locatie getLocatie() {
		return this.oorsprong;
	}

	public int getKaartNummer() {
		return this.kaartNummer;
	}

	public boolean getGeldigheid() {
		return this.geldigheid;
	}

	public void checkIn(Locatie l) {
		this.ingecheckt = true;
		this.oorsprong = l;
	}
	
	public void checkOut(Locatie l) {
		this.ingecheckt = false;
		this.oorsprong = l;
	}
	
	public void saldoAftrekken(double kosten) {
		this.saldo = this.saldo - kosten;
	}
}
