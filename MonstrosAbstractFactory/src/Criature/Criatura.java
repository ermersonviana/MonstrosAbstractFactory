package Criature;

public abstract class Criatura {
	private String classe;
	private int ataque;
	private int defesa;
	private int forca;
	private String terreno;

	public Criatura(String classe, int ataque, int defesa, int forca, String terreno) {
		this.classe = classe;
		this.ataque = ataque;
		this.defesa = defesa;
		this.forca = forca;
		this.terreno = terreno;
	}

	
	public String infoMonster() {
		String aux = "Classe: " + classe + ", " + 
				"Ataque: " + ataque + ", " + 
				"Defesa: " + defesa + ", " + 
				"For�a: " + forca + ", " + 
				"Terreno: " + terreno;
		return aux;
	

	}



	
}
