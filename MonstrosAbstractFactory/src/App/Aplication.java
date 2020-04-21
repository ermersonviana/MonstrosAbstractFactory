package App;

import Fabricas.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Criature.Criatura;

public class Aplication {
	public static void main (String[]args)  {
		
		Random random = new Random();
		
		List<Osenums2> Fabrica = new ArrayList<Osenums2>();
		Fabrica.add(Osenums2.Construtos);
		Fabrica.add(Osenums2.Insectoide);
		Fabrica.add(Osenums2.Necrofalos);
		Fabrica.add(Osenums2.Relictos);
		
			
		for(int i=1; i<=25; i++) {			
			
			Osenums2 tipofabrica = Fabrica.get(random.nextInt(Fabrica.size()));
			FabricaMae aleatoryfabrica = FabricaMae.getAleatoryfactory(tipofabrica);
			Criatura criatura = aleatoryfabrica.getRandomCriature();
			System.out.println(i + ". " +criatura.infoMonster());
		}
			
	}
	}

