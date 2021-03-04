package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBancar extends Cont {
	// mostenesc 4 metode abstracte

	protected double balanta;
	protected String iban;

	public ContBancar(double balanta, String iban) {

		this.balanta = balanta;
		this.iban = iban;
	}

//	supradefinirea metodei => nu modificam nimic in headerul metodei
//	recomandat este @Override
//	click dreapta => source => override/implement methods

	@Override
	public double getBalanta() {
		return this.balanta;
	}
}
