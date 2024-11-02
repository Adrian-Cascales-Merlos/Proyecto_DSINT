package dsi.mitologia;

// Clase que indica que Ser esta en estado "Libre". Cada instancia de la clase indica a un Ser.
public class Libre extends Estado {
	
	public Libre(Ser ser) {
		super("Libre", ser);
	}
	
}
