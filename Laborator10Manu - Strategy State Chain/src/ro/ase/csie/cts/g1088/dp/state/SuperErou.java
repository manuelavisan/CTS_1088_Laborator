package ro.ase.csie.cts.g1088.dp.state;

public class SuperErou {

	public static final int PUNCTE_NIVEL_CRITIC = 50;
	public static final int PUNCTE_NIVEL_NORMAL = 500;
	
	int puncteViata; // asta ne da starea
	String efectMagic;
	String nume;
	
	InterfataModDeplasare stareDeplasare = null;
	
	public SuperErou(String nume) {
		super();
		this.puncteViata = PUNCTE_NIVEL_NORMAL;
		this.nume = nume;
		this.stareDeplasare = new StareDeplasareNormala(); //obligatoriu plec cu o stare => nu am setter
	}
	
	public void esteAtacat(int puncteLovitura) {
		System.out.println(this.nume + " este lovit cu " + puncteLovitura);
		this.puncteViata -= puncteLovitura;
		
		if(this.puncteViata < PUNCTE_NIVEL_CRITIC) {
			this.stareDeplasare = new StareDeplasareRanitCritic();
		}
		else if(this.puncteViata < PUNCTE_NIVEL_NORMAL){
			this.stareDeplasare = new StareDeplasareRanit();
		}
	}
	
	public void seVindeca(int puncte) {
		System.out.println(this.nume + " se vindeca.");
		this.puncteViata += puncte;
		
		if(this.puncteViata > PUNCTE_NIVEL_NORMAL) {
			this.stareDeplasare = new StareDeplasareNormala();
		}
		else if(this.puncteViata > PUNCTE_NIVEL_CRITIC){
			this.stareDeplasare = new StareDeplasareRanit();
		}
	}
	
	public void seDeplaseaza() {
		this.stareDeplasare.seMisca(this);
	}
}
