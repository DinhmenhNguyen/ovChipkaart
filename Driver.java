package OVChipkaart;

public class Driver {

	public static void main(String[] args) {

		OVChipkaart ovChipkaart1 = new OVChipkaart();
		
		NSAutomaat nsAutomaat = new NSAutomaat();
		
		Locatie nijmegen = new Locatie(2.1, 6.3, "Nijmegen");
		Locatie arnhem = new Locatie(12.5, 8.6, "Arnhem");

		Paal paalInchecken = new Paal(nijmegen);
		Paal paalUitchecken = new Paal(arnhem);
		
		nsAutomaat.opwaarderenMet(ovChipkaart1, 200);
//		nsAutomaat.aanvullenTot(ovChipkaart1, 200);

		paalInchecken.tariefBerekenaar(nijmegen, arnhem);
		paalInchecken.checkInScan(ovChipkaart1);

		paalUitchecken.checkUitScan(ovChipkaart1);
	}
}
