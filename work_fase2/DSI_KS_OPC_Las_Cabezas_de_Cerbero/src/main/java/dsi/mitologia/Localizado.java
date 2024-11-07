package dsi.mitologia;

// Localizado es un clase que indica la relación de localización de un Ser con otro Ser.
// Cada instancia (objeto Java) de la clase indicará una relación de localización.
public class Localizado {
	public final Ser sabe;			// Ser que sabe donde está el Ser "localizado"
	public final Ser localizado;	// Ser que está localizado por el Ser "sabe"
	
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
