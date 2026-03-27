package OVChipkaart;

public class Driver {

	public static void main(String[] args) {
		
		Locatie nijmegen = new Locatie(2, 4);
		Locatie arnhem = new Locatie(3, 3);
		Paal paal1 = new Paal(20.0, nijmegen);
		Paal paal2 = new Paal(20.0, arnhem);

		OVChipkaart ovChipkaart1 = new OVChipkaart(20.0);
		ovChipkaart1.setKaartNummer(1213821);

		System.out
				.println("Saldo: " + ovChipkaart1.getSaldo() + "\n" + "Kaartnummer: " + ovChipkaart1.getKaartNummer());
		paal1.scan(ovChipkaart1);
		System.out.println("Saldo: " + ovChipkaart1.getSaldo());

	}
}