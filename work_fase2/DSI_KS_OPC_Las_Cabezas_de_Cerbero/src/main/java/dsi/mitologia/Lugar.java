package dsi.mitologia;

import java.util.HashSet;
import java.util.Set;

// Localizacion en la que habita un Ser o una localizacion relevante donde sucede un mito.
public class Lugar {
	private final String nombre;	// REQUERIDO
	private Set<Capacidades> capacidad_necesaria = new HashSet<>();	// Capacidad necesaria para llegar a este lugar
	
	// private Set<Ser> tiene_a = new HashSet<>();	// Ser/seres que están en este lugar // TODO BORRAR
	// Como la clase Ser tiene el atributo inverso "ubicado_en" que no es múltiple, es mejor usar ese solo
	
	
	
	public Lugar(String tiene_nombre) {
		this.nombre = tiene_nombre;
	}

	
	// TIENE A TODO BORRAR
	
//	public Set<Ser> getTiene_a() {
//		return tiene_a;
//	}
//
//	public void setTiene_a(Set<Ser> tiene_a) {
//		this.tiene_a = tiene_a;
//	}
	
	
	// CAPACIDAD

	public Set<Capacidades> getCapacidad_necesaria() {
		return capacidad_necesaria;
	}

	public void setCapacidad_necesaria(Set<Capacidades> capacidad_necesaria) {
		this.capacidad_necesaria = capacidad_necesaria;
	}
	
	
	// NOMBRE

	public String getNombre() {
		return nombre;
	}
	
	
}
