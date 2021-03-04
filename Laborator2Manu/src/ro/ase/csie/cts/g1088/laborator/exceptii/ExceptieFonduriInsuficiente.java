package ro.ase.csie.cts.g1088.laborator.exceptii;

public class ExceptieFonduriInsuficiente extends Exception{
	
	public ExceptieFonduriInsuficiente(String mesaj) { //constructor
		super(mesaj); //apelez constructorul din clasa de baza; obligatoriu prima linie
	}
	
	public ExceptieFonduriInsuficiente() {
		
	}
}
