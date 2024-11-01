package dsi.mitologia;

import java.util.HashSet;
import java.util.Set;

public class Lugares {
	private final String tiene_nombre;	// REQUERIDO
	private Set<Seres> tiene_a = new HashSet<>();	// Ser/seres que est�n en este lugar
	private Set<Capacidades> capacidad_necesaria = new HashSet<>();	// Capacidad necesaria para llegar a este lugar
	
	
	
	public Lugares(String tiene_nombre) {
		this.tiene_nombre = tiene_nombre;
	}

	
	// TIENE A
	
	public Set<Seres> getTiene_a() {
		return tiene_a;
	}

	public void setTiene_a(Set<Seres> tiene_a) {
		this.tiene_a = tiene_a;
	}
	
	
	// CAPACIDAD

	public Set<Capacidades> getCapacidad_necesaria() {
		return capacidad_necesaria;
	}

	public void setCapacidad_necesaria(Set<Capacidades> capacidad_necesaria) {
		this.capacidad_necesaria = capacidad_necesaria;
	}
	
	
	// NOMBRE

	public String getTiene_nombre() {
		return tiene_nombre;
	}
	
	
}
