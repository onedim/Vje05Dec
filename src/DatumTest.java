public class DatumTest {

	public static void main(String[] args) {
		Datum prviDatum = new Datum(10, 12, 2014);
		Datum drugiDatum = new Datum(prviDatum);
		System.out.println("Prvi datum" + prviDatum.toString());
		System.out.println("Drugi" + drugiDatum.toString());
		System.out.println(prviDatum.getDan());
		// int a=prviDatum.getDan();
		// a=a+50;
		// System.out.println(a);

		prviDatum.setDan(10);
		prviDatum.setMjesec(12);
		prviDatum.setGodina(2014);

		System.out.println(prviDatum.getDan());
		System.out.println(prviDatum.getMjesec());
		System.out.println(prviDatum.getGodina());
		System.out.println("Prvi datum" + prviDatum.toString());
		System.out.println("Drugi" + drugiDatum.toString());
		if (prviDatum.poredenje(drugiDatum) == 1) {
			System.out.println("Prvi datum " + prviDatum + " je veci.");
		} else if (prviDatum.poredenje(drugiDatum) == -1) {
			System.out.println("Drugi datum " + drugiDatum + " je veci.");
		} else {
			System.out.println("I prvi datum " + prviDatum + " i drugi datum "
					+ drugiDatum + " su isti");
		}

		if (prviDatum.equals(drugiDatum) == true) {
			System.out.println("Jednaki");
		} else {
			System.out.println("Nisu jednaki");
		}

	}

}
