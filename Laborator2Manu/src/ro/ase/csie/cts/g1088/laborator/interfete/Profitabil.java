package ro.ase.csie.cts.g1088.laborator.interfete;

public interface Profitabil {
	
	public static final int MAX_PROCENT_DOBANDA = 5;
	//final pt clasa => nu mai poate fi derivata
	//final pt atribut => trebuie initializat la inceput sau in constructor
	//final pt metoda => nu poate fi suprascrisa
	
	public abstract void adaugaDobanda(double procentDobanda);
	
	//RECAPITULARE
	//interfata = cls abstracta care contine doar met. abstracte si eventual atribute statice constante
	//o clasa abstracta contine minim o metoda abstracta si in rest poate contine ce contine si o clasa normala
}
