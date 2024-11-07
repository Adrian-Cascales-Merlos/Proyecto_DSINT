package dsi.mitologia;

// Artilugios con ciertas propiedades y/o capacidades para realizar algo.
public class Objeto {
	private final String nombre;	// REQUERIDO
	private EstadoObj estado;		// REQUERIDO
	private Capacidades capacidad;	// REQUERIDO	// TODO VER: Cuando un objeto no tiene capacidad se pone "NINGUNA"
	

	public Objeto(String nombre, EstadoObj estado, Capacidades capacidad) {
		this.nombre = nombre;
		this.estado = estado;
		this.capacidad = capacidad;
	}


	// ESTADO
	public EstadoObj getEstado() {
		return estado;
	}

	public void setEstado(EstadoObj estado) {
		this.estado = estado;
	}
	

	// CAPACIDADES
	public Capacidades getCapacidad() {
		return capacidad;
	}
	// TODO REVISAR
	public void removeCapacidad() {
		this.capacidad = Capacidades.NINGUNA;	// Cuando un objeto se rompe (DANIADO o DESTRUIDO), indicamos que no tiene capacidad con "NINGUNA"
	}

	
	// NOMBRE
	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
