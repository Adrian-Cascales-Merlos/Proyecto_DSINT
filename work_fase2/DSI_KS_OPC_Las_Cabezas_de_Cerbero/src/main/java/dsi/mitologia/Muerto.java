package dsi.mitologia;

// Clase que indica que Ser esta en estado "Muerto". Cada instancia de la clase indica a un Ser.
public class Muerto extends Estado {

	public Muerto(Ser tiene_ser) {
		super("Muerto", tiene_ser);
	}
	
}
