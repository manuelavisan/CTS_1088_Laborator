package ro.ase.csie.cts.g1088.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		Jucator jucator = new Jucator(150, "Gigel", 7);
		System.out.println("Puncte jucator: "+jucator.getClasaJucator());

		jucator.setStrategieMk(new StrategieJucatorNou());
		
		jucator.acordaPuncteBonus();
		System.out.println("Puncte jucator: "+jucator.getClasaJucator());
		
		jucator.setStrategieMk(new StrategieZiuaCopilului());
		
		jucator.acordaPuncteBonus();
		System.out.println("Puncte jucator: "+jucator.getClasaJucator());
	}

}
