package dsi.mitologia;

// Clase que indica la relación de "matar a alguien" entre dos Seres
public class Mata {
	private final Ser matador;		// Ser que mata al Ser "muerto"
	private final Ser muerto;		// Ser que es matado por "matador"
	
	public Mata(Ser matador, Ser muerto) {
		this.matador = matador;
		this.muerto = muerto;
	}

	public Ser getMatador() {
		return matador;
	}

	public Ser getMuerto() {
		return muerto;
	}
	
}
