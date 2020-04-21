package Fabricas;

import Construtos.*;
import Criature.Criatura;
import java.util.ArrayList;
import java.util.Random;

public class Fabrica2 extends FabricaMae {

	public Criatura getCriatura(Osenums tipo) {
		switch (tipo) {
			case Djinn:
				return new Djinn("Djinn / Gênio", 8, 9, 10, "Não possui um terreno.");
			case Gargulas:
				return new Gargulas("Gargula / Gênio", 8, 9, 10, "Não possui um terreno.");
			case Gofens:
				return new Gofens("Gofens / Gênio", 8, 9, 10, "Não possui um terreno.");
				
		}
		return null;
	}


	@Override
	public Criatura getRandomCriature() {
		Random random = new Random();
		ArrayList<Osenums> osenums = new ArrayList<Osenums>();
		osenums.add(Osenums.Djinn);
		osenums.add(Osenums.Gargulas);
		osenums.add(Osenums.Gofens);
		Osenums classealeatoria = osenums.get(random.nextInt(osenums.size()));
		return getCriatura(classealeatoria);
	}
}
