/**
 * Klasa za inicijalizaciju i operacije nad datumom
 * @author nedimomerovic
 *
 */


public class Datum {
	private int dan;
	private int mjesec;
	private int godina;

	/**
	 * postavljanje inicijalnog datuma
	 */
	public Datum() {
		dan = 1;
		mjesec = 1;
		godina = 1900;
	}

	/**
	 * postavlja nove vrijednosti dana,mjeseca,godine
	 * 
	 * @param postaviDan
	 * @param postaviMjesec
	 * @param postaviGodinu
	 */
	public Datum(int postaviDan, int postaviMjesec, int postaviGodinu) {
		dan = postaviDan;
		mjesec = postaviMjesec;
		godina = postaviGodinu;
	}

	/**
	 * geter - inicijalizacija funkcije koja vraca vrijednost dana iz drugog
	 * programa
	 * 
	 * @return
	 */
	public int getDan() {
		return dan;
	}

	/**
	 * geter - inicijalizacija funkcije koja vraca vrijednost mjeseca iz drugog
	 * programa
	 * 
	 * @return
	 */
	public int getMjesec() {
		return mjesec;
	}

	/**
	 * geter za vracanje godine godine
	 * 
	 * @return
	 */
	public int getGodina() {
		return godina;
	}

	/**
	 * usporeduje datume
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Datum other) {
		if (this.dan == other.dan && this.mjesec == other.mjesec
				&& this.godina == other.godina) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * usporedujedatum, prvo godinu,pa mjesec i dan,kaze koja je veca ili da li
	 * su isti
	 * 
	 * @param other
	 * @return
	 */
	public int poredenje(Datum other) {

		if (this.godina > other.godina) {
			return 1;
		} else if (this.godina < other.godina) {
			return -1;
		} else if (this.godina == other.godina) {
			if (this.mjesec > other.mjesec) {
				return 1;
			} else if (this.mjesec < other.mjesec) {
				return -1;
			} else if (this.mjesec == other.mjesec) {
				if (this.dan > other.dan) {
					return 1;
				} else if (this.dan < other.dan) {
					return -1;
				} else {
					return 0;
				}

			}
		}
		return 0;
	}

	public String toString() {
		String datumFormatiran = "";
		datumFormatiran = dan + ":" + mjesec + ":" + godina;
		return datumFormatiran;
	}

	/**
	 * seter za postavljanje novog dana sa provjerom <0 i >31
	 * 
	 * @param noviDan
	 * @return
	 */
	public boolean setDan(int noviDan) {
		if (noviDan <= 0 || noviDan > 31) {
			return false;
		} else {
			dan = noviDan;
			return true;
		}
	}

	/**
	 * seter za postavljanje novog mjeseca sa provjerom <=0 i >31
	 * 
	 * @param noviMjesec
	 * @return
	 */
	public boolean setMjesec(int noviMjesec) {
		if (noviMjesec <= 0 || noviMjesec > 12) {
			return false;
		} else {
			mjesec = noviMjesec;
			return true;
		}

	}

	/**
	 * seter za postavljanje nove godine sa provjerom <1900 i >2015
	 * 
	 * @param novaGodina
	 * @return
	 */
	public boolean setGodina(int novaGodina) {
		if (novaGodina < 1900 || novaGodina > 2015) {
			return false;
		} else {
			godina = novaGodina;
			return true;
		}

	}

	/**
	 * pokazuje na vrijednosti iz Datum bez da mijenja kada se izmjeni prvi
	 */
	public Datum(Datum other) {
		this.dan = other.dan;
		this.mjesec = other.mjesec;
		this.godina = other.godina;
	}
	public generatorDatuma(Datum){
		
	}

}
