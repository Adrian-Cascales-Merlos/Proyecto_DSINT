package dsi.mitologia;

// Clase que indica que Ser esta en estado "Vivo". Cada instancia de la clase indica a un Ser.
public class Vivo extends Estado {

	public Vivo(Ser ser) {
		super("Vivo", ser);
	}
	
}
