package ovChipkaart;

public class Driver {

	public static void main(String[] args) {
		Paal paal1 = new Paal(20.0);
		
		OVChipkaart ovChipkaart1 = new OVChipkaart(20.0);

		System.out.println("Saldo: " + ovChipkaart1.getSaldo());
		System.out.println("Kaartnummer: " + ovChipkaart1.getKaartNummer());
		paal1.scan(ovChipkaart1);
		System.out.println("Saldo: " + ovChipkaart1.getSaldo());

	}
}