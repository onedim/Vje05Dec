public class Student {
	private String imePrezime;
	private Datum datumRodjenja;
	private Datum datumUpisa;
	private double gpa;
	private int brIndexa;
	private static int brStudenata = 0;
	
	//public Student(String,Datum ,Datum){
	//}
	
	public Student(String imePrezime,Datum datumUpisa,Datum datumRodjenja){
		this.imePrezime=imePrezime;
		this.datumRodjenja=datumRodjenja;
		this.datumUpisa=datumUpisa;
		this.gpa=0;
		brStudenata++;
		this.brIndexa=brStudenata;
	}
		
	public Student(){
		this("Jon Doe", new Datum(), new Datum());
	}
		
	
	public Student(Student other){
		this.imePrezime=other.imePrezime;
		this.datumRodjenja=other.datumRodjenja;
		this.datumUpisa=other.datumUpisa;
		this.gpa=0;
		brStudenata++;
		this.brIndexa=other.brIndexa;
		
		
	}

	

	
	

}
