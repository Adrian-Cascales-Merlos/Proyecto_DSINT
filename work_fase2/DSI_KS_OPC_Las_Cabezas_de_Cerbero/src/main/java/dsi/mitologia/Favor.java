package dsi.mitologia;

// Favor es un clase que indica la relaci�n de favor entre un Dios y otro Ser.
// Cada instancia (objeto Java) de la clase indicar� una relaci�n de favor.
public class Favor {
	private final Dios diosFavorece;	// Dios que da un favor (ayuda) al Ser "favorecido"	TODO REVISAR nombre
	private final Ser favorecido;		// Ser que tiene la ayuda del dios "diosFavorece"
	
	public Favor(Dios diosFavorece, Ser favorecido) {
		this.diosFavorece = diosFavorece;
		this.favorecido = favorecido;
	}

	public Dios getDiosFavorece() {
		return diosFavorece;
	}

	public Ser getFavorecido() {
		return favorecido;
	}
	
	
}
