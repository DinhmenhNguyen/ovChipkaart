package OVChipkaart;

public class NSAutomaat {

	private OVChipkaart ovChip = null;

	public void scan(OVChipkaart ovChip) {
		this.ovChip = ovChip;
	}

	public void stop() {
		this.ovChip = null;
	}

	public void opwaarderenMet(double geldMet) {
		if (this.ovChip != null) {

			System.out.println("Saldo verhoogt met: €" + geldMet);
			double a = geldMet;
			this.scan(ovChip);
			ovChip.setSaldo(a);
			System.out.println("New Saldo = €" + ovChip.getSaldo() + "\n");
			this.stop();
		}
	}

	public void aanvullenTot(double geldTot) {
		if (this.ovChip != null) {

			double a = geldTot - ovChip.getSaldo();
			this.opwaarderenMet(a);
		}
	}
}
