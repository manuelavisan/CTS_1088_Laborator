package ro.ase.csie.cts.g1088.dp.state;

public class StrategieZiuaCopilului implements InterfataStrategieMarketing{

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {

		if(jucator.getClasaJucator() > 5) {
			jucator.clasaJucator *= 2;
			System.out.println("Aplica strategie speciala");
		}
		
	}

}
