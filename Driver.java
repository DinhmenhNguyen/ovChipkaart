package ovChipkaart;

public class Driver {

	public static void main(String[] args) {
		Paal paal1 = new Paal(20.0);
		Paal paal2 = new Paal(5.0);
		
		OVChipkaart ovChipkaart1 = new OVChipkaart(20.0);
		OVChipkaart ovChipkaart2 = new OVChipkaart(5.0);

		System.out.println(ovChipkaart1.getSaldo());
		paal1.scan(ovChipkaart1);
		System.out.println(ovChipkaart1.getKaartNummer());
		System.out.println(ovChipkaart1.getSaldo());

	}
}