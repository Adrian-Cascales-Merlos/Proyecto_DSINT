package dsi.mitologia;


import java.util.HashSet;
import java.util.Set;

public class Objetos {
	private final String tiene_nombre;	// REQUERIDO
	private EstadoObj tiene_estado;	// REQUERIDO
	private Seres en_manos_de;
	private Set<Capacidades> tiene_capacidad = new HashSet<>();	// REQUERIDO	// TODO VER QUE HACER CON ESTO
	
	
	
	public Objetos(String tiene_nombre, EstadoObj tiene_estado, Set<Capacidades> tiene_capacidad) {
		this.tiene_nombre = tiene_nombre;
		this.tiene_estado = tiene_estado;
		this.tiene_capacidad = tiene_capacidad;
	}


	// ESTADO

	public EstadoObj getTiene_estado() {
		return tiene_estado;
	}

	public void setTiene_estado(EstadoObj tiene_estado) {
		this.tiene_estado = tiene_estado;
	}


	
	// EN MANOS DE

	public Seres getEn_manos_de() {
		return en_manos_de;
	}

	public void setEn_manos_de(Seres en_manos_de) {
		this.en_manos_de = en_manos_de;
	}
	
	public void removeEn_manos_de() {	// TODO REVISAR
		this.en_manos_de = null;	// Lo he puesto por si algún objeto se destruye, no está en manos de nadie (desaparece)
	}

	

	// CAPACIDADES

	public Set<Capacidades> getTiene_capacidad() {
		return tiene_capacidad;
	}

	public void setTiene_capacidad(Set<Capacidades> tiene_capacidad) {
		this.tiene_capacidad = tiene_capacidad;
	}
	
	public void removeAllCapacidad() {	// TODO REVISAR
		this.tiene_capacidad.clear();	// Lo he puesto por si algún objeto se destruye, no tiene ninguna capacidad.
	}

	
	// NOMBRE

	public String getTiene_nombre() {
		return tiene_nombre;
	}
	
	
	
	
}
