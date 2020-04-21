package Fabricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Criature.Criatura;
import Necrofalos.*;

public class Fabrica1 extends FabricaMae {

	public Criatura getCriatura(Osenums tipo){
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Necrosos:
			return new Necrosos("Necrosos / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Nevolosos:
			return new Nevolosos("Nevolosos / Necr�fago", 5, 7, 3, "Cemit�rio");
		default:
			break;
		}
		
		return null;
	}


	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Ghouls);
		osenums.add(Osenums.Necrosos);
		osenums.add(Osenums.Nevolosos);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}
	
}
