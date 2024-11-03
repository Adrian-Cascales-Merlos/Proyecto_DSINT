package dsi.mitologia;

// Clase que indica la relación de "liberar a alguien" entre dos Seres
public class Libera {
	private final Ser rescatador;	// Ser que libera al Ser "liberado"
	private final Ser liberado;		// Ser que es liberado por "rescatador"
	
	public Libera(Ser rescatador, Ser liberado) {
		this.rescatador = rescatador;
		this.liberado = liberado;
	}

	public Ser getRescatador() {
		return rescatador;
	}

	public Ser getLiberado() {
		return liberado;
	}
		
}
