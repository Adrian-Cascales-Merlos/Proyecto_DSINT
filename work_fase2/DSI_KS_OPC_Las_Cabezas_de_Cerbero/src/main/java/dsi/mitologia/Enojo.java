package dsi.mitologia;

// Enojo es un clase que indica la relación de enojo de un Dios y otro Ser.
// Cada instancia (objeto Java) de la clase indicará una relación de enojo.
public class Enojo {
	private final Dios enojado;		// Dios que está enfadado con el Ser "castigado"
	private final Ser castigado;	// Ser que tiene el enojo del dios "enojado"
	
	public Enojo(Dios enojado, Ser castigado) {
		this.enojado = enojado;
		this.castigado = castigado;
	}

	public Dios getEnojado() {
		return enojado;
	}

	public Ser getCastigado() {
		return castigado;
	}
	
	
}
