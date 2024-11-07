package dsi.mitologia;

// TODO VER. Quizás finalmente no sea necesario
// Localizacion en la que habita un Ser o una localizacion relevante donde sucede un mito.
public class Lugar {
	private final String nombre;	// REQUERIDO
	private final Capacidades capacidad_necesaria;	// Capacidad necesaria para llegar a este lugar
		
	
	public Lugar(String nombre, Capacidades capacidad_necesaria) {
		this.nombre = nombre;
		this.capacidad_necesaria = capacidad_necesaria;
	}

	
	// CAPACIDAD
	public Capacidades getCapacidad_necesaria() {
		return capacidad_necesaria;
	}

	
	// NOMBRE
	public String getNombre() {
		return nombre;
	}
	
	
}
