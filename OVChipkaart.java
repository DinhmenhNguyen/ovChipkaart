package ovChipkaart;

import java.time.LocalDate;

public class OVChipkaart {

	LocalDate tijd = LocalDate.now();

	private LocalDate geldigheid = tijd;
	private double saldo;
	private int kaartnummer;
	private boolean ingecheckt;
}
