package OVChipkaart;

public class Driver {

	public static void main(String[] args) {

		Locatie nijmegen = new Locatie(2, 6);
		Locatie arnhem = new Locatie(12, 8);

		Paal paal1 = new Paal(20.0, nijmegen);
		
		OVChipkaart ovChipkaart1 = new OVChipkaart(20.0);
		ovChipkaart1.setKaartNummer(1213821);

		System.out
				.println("Saldo: " + ovChipkaart1.getSaldo() + "\n" + "Kaartnummer: " + ovChipkaart1.getKaartNummer());
		System.out.println(paal1.tariefBerekenaar(nijmegen, arnhem));
		paal1.scan(ovChipkaart1);
		System.out.println("Saldo: " + ovChipkaart1.getSaldo());

	}
}