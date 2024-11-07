package dsi.mitologia;

// Localizado es un clase que indica la relaci�n de localizaci�n de un Ser con otro Ser.
// Cada instancia (objeto Java) de la clase indicar� una relaci�n de localizaci�n.
public class Localizado {
	public final Ser sabe;			// Ser que sabe donde est� el Ser "localizado"
	public final Ser localizado;	// Ser que est� localizado por el Ser "sabe"
	
	public Localizado(Ser sabe, Ser localizado) {
		this.sabe = sabe;
		this.localizado = localizado;
	}

	public Ser getSabe() {
		return sabe;
	}

	public Ser getLocalizado() {
		return localizado;
	}
	
	
}
