package OVChipkaart;

public class Driver {

	public static void main(String[] args) {

		OVChipkaart ovChipkaart1 = new OVChipkaart(true);
		OVChipkaart ovChipkaart2 = new OVChipkaart(false);
		
		NSAutomaat nsAutomaat = new NSAutomaat();
		
		Locatie nijmegen = new Locatie(2.1, 6.3, "Nijmegen");
		Locatie arnhem = new Locatie(12.5, 8.6, "Arnhem");

		Paal paalInchecken = new Paal(nijmegen);
		Paal paalUitchecken = new Paal(arnhem);

		nsAutomaat.scan(ovChipkaart1);
		nsAutomaat.opwaarderenMet(20);
		nsAutomaat.stop();
//		nsAutomaat.aanvullenTot(200);

		paalInchecken.checkInScan(ovChipkaart1);

		paalUitchecken.checkUitScan(ovChipkaart1);
	}
}
