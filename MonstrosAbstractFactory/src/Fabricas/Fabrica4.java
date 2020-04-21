package Fabricas;

import java.util.ArrayList;
import java.util.Random;

import Criature.Criatura;
import Insectoides.*;

public class Fabrica4 extends FabricaMae{
	
	public Criatura getCriatura(Osenums tipo) {
		switch(tipo) {
			case Kikimora:
				return new Kikimora ("Kikimora / Insectoide", 7, 8, 3, "P�ntano");
			case Harrise:
				return new Harrise ("Harrise / Insectoide", 7, 8, 3, "P�ntano");
			case Aracnos:
				return new Aracnos ("Aracnos / Insectoide", 7, 8, 3, "P�ntano");
		}
		return null;
	}
	
	

	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Kikimora);
		osenums.add(Osenums.Harrise);
		osenums.add(Osenums.Aracnos);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
