package OVChipkaart;

public class GeldAutomaat {
	public void stortGeld(OVChipkaart ovChip) {
		ovChip.setSaldo(0.0);
		System.out.println("Saldo = €" + ovChip.getSaldo() + "\n");
	}
}
