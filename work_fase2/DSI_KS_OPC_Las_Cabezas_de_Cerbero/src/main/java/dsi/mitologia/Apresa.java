package dsi.mitologia;

// Clase que indica la relación de "tener apresado" entre dos Seres
public class Apresa {
	private final Ser capturador;	// Ser que "captura" (apresa) al Ser "apresado"
	private final Ser apresado;		// Ser que es apresado por "capturador"
	
	public Apresa(Ser capturador, Ser apresado) {
		this.capturador = capturador;
		this.apresado = apresado;
	}

	public Ser getCapturador() {
		return capturador;
	}

	public Ser getApresado() {
		return apresado;
	}
	
}
