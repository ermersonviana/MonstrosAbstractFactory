package Fabricas;

import Criature.Criatura;
import Fabricas.Fabrica1;
import Fabricas.Fabrica2;
import Fabricas.Fabrica3;
import Fabricas.Fabrica4;
import Fabricas.FabricaMae;
import Fabricas.Osenums;
import Fabricas.Osenums2;

public abstract class FabricaMae {

	public static FabricaMae getAleatoryfactory(Osenums2 tipo) {
		switch(tipo) {
		case Construtos:
			return new Fabrica1();
		case Insectoide:
			return new Fabrica2();
		case Necrofalos:
			return new Fabrica3();
		case Relictos:
			return new Fabrica4();
		
		
		}
		return null;
		
	}

public abstract Criatura getCriatura(Osenums tipo);

public abstract Criatura getRandomCriature();
}	
