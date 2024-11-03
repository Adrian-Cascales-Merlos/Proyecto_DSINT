package dsi.mitologia;

// Clase que indica la relación de "robar a alguien" entre dos Seres
// TODO: PREGUNTAR A EQUIPO (ver drive)
public class Roba {
	private final Ser ladron;		// Ser que roba al Ser "victima"
	private final Ser victima;		// Ser que es robado por "ladron"
//	private final Objeto robado;	// Objeto de "victima" robado por "ladron"
	
	public Roba(Ser ladron, Ser victima) {
		this.ladron = ladron;
		this.victima = victima;
	}
	
	public Ser getLadron() {
		return ladron;
	}

	public Ser getVictima() {
		return victima;
	}

//	public Objeto getRobado() {
//		return robado;
//	}
		
}
