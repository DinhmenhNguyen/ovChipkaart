package OVChipkaart;

public class NSAutomaat {
	
	public void opwaarderenMet(OVChipkaart ovChip,double geldMet) {
		double a = geldMet;
		double b = ovChip.setSaldo(a);
		System.out.println("New Saldo = €" + ovChip.getSaldo() + "\n");
	}
	
	public void aanvullenTot(OVChipkaart ovChip,double geldTot) {
		double a = geldTot - ovChip.getSaldo();
		double b = ovChip.setSaldo(a);
		System.out.println("New Saldo = €" + ovChip.getSaldo() + "\n");
	}
}
