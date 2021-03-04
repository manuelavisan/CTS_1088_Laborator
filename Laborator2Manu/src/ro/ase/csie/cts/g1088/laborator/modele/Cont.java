package ro.ase.csie.cts.g1088.laborator.modele;

import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteaza(Double valoare); //nu stiu ce tip de valoare pun exact, pun generic Object
													//sau Double ca acopera toate valorile numerice
	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer (Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	
	//conversie tip referential la..
	//primitiv => referential se face implicit
	//boxing si unboxing
	
	//clasa abastracta => cuv abstract obligatoriu la metoda
}
