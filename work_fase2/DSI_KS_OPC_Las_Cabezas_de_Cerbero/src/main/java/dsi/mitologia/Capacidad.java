package dsi.mitologia;

// Clase abstracta cuyas hijas indicarán la relación de que un Ser tiene una capacidad concreta. (Otorgada por un objeto)
public abstract class Capacidad {
	private String nombre; // TODO CREO QUE NO ES NECESARIO
	private final Ser ser;	// Ser que tiene la capacidad
	
	public Capacidad(String nombre, Ser ser) {
		this.nombre = nombre;
		this.ser = ser;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ser getSer() {
		return ser;
	}
	
}
