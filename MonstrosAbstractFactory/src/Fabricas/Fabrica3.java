package Fabricas;

import java.util.ArrayList;
import java.util.Random;

import Criature.Criatura;
import Relictos.*;

public class Fabrica3 extends FabricaMae {

	public Criatura getCriatura(Osenums tipo) {
		switch(tipo) {
			case Silvano:
				return new Silvano("Silvano / Human�ide com Chifres", 5, 7, 3, "Fazendas");
			case Kernun:
				return new Kernun("Kermun / Human�ide com Chifres", 5, 7, 3, "Fazendas");
			case Dopllers:
				return new Dopllers("Dopllers / Human�ide com Chifres", 5, 7, 3, "Fazendas");
		}
		return null;
	}


	@Override
	public  Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Silvano);
		osenums.add(Osenums.Kernun);
		osenums.add(Osenums.Dopllers);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}

}
