package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class DecoratorErouAbstract extends SuperErou{
	
	public DecoratorErouAbstract(SuperErou erou) {
		super(erou.nume, erou.puncteViata);
		this.erou=erou;
	}

	SuperErou erou = null;

	@Override
	public void alearga() {
		this.erou.alearga();
	}

	@Override
	public void esteLovit(int puncte) {
		this.erou.esteLovit(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		this.erou.seVindeca(puncte);
		
	}
}
