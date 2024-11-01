package dsi.mitologia;

import java.util.HashSet;		// TODO Creo que hay que reescribir el equals y el hashcode
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

// TODO PREGUNTA: �Habr�a que poner Set y List o �nicamente Collection?

public abstract class Seres {
	private final String tiene_nombre;				// REQUERIDO
	private List<Capacidades> tiene_capacidad = new LinkedList<>();			// Es el �nico que debe ser una lista (pq puede tener varios objetos con mismas capacidades)
	// private Set<Estados> tiene_condicion = new HashSet<>();	// TODO QUITAR
	private Set<Dioses> tiene_enojo_de = new HashSet<>();
	private Set<Dioses> tiene_favor_de = new HashSet<>();
	private Set<Seres> tiene_localizado_a = new HashSet<>();
	// private Set<Objetos> tiene_objeto = new HashSet<>();	// TODO QUITAR (Solo dejamos la clase Objeto)
	private Lugares ubicado_en;
	
	
	
	public Seres(String tiene_nombre) {
		this.tiene_nombre = tiene_nombre;
		//	this.tiene_condicion = tiene_condicion;		//TODO QUITAR
	}
	
	// NOMBRE
	
	public String getTiene_nombre() {
		return tiene_nombre;
	}
	
	// CAPACIDADES	TODO VER QUE HACER
	
	public List<Capacidades> getTiene_capacidad() {
		return tiene_capacidad;
	}
	
	public void setTiene_capacidad(List<Capacidades> tiene_capacidad) {
		this.tiene_capacidad = tiene_capacidad;
	}
	
	public void addCapacidad(Capacidades capacidad) {		// TODO REVISAR
		this.tiene_capacidad.add(capacidad);				// Aqu� permitimos a�adir capacidades repetidas (pq es una List)
	}
	
	public void removeCapacidad(Capacidades capacidad) {	// TODO REVISAR
		if ( this.tiene_capacidad.remove(capacidad) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Capacidad quitada
		}
		else {
			// No ten�a esa capacidad
		}
	}
	
	
	// CONDICIONES (estados)	// TODO QUITAR
	
//	public Set<Estados> getTiene_condicion() {
//		return tiene_condicion;
//	}
//	
//	public void setTiene_condicion(Set<Estados> tiene_condicion) {
//		this.tiene_condicion = tiene_condicion;
//	}
//	
//	public void addCondicion(Estados estado) {
//		this.tiene_condicion.add(estado);
//	}
//	
//	public void removeCondicion(Estados estado) {
//		if ( this.tiene_condicion.remove(estado) ) {
//			// Estado quitado
//		}
//		else {
//			// No ten�a ese estado
//		}
//	}
	
	
	// ENOJOS (enfados)
	
	public Set<Dioses> getTiene_enojo_de() {
		return tiene_enojo_de;
	}
	
	public void setTiene_enojo_de(Set<Dioses> tiene_enojo_de) {
		this.tiene_enojo_de = tiene_enojo_de;
	}
	
	public void addEnojo(Dioses dios) {		// TODO REVISAR
		this.tiene_enojo_de.add(dios);
	}
	
	public void removeEnojo(Dioses dios) {	// TODO REVISAR
		if ( this.tiene_enojo_de.remove(dios) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Dios enojado quitado
		}
		else {
			// No tenia ese Dios enojado
		}
	}
	
	
	// FAVORES (ayudas)
	
	public Set<Dioses> getTiene_favor_de() {
		return tiene_favor_de;
	}
	
	public void setTiene_favor_de(Set<Dioses> tiene_favor_de) {
		this.tiene_favor_de = tiene_favor_de;
	}
	
	public void addFavor(Dioses dios) {		// TODO REVISAR
		this.tiene_favor_de.add(dios);
	}
	
	public void removeFavor(Dioses dios) {	// TODO REVISAR
		if ( this.tiene_favor_de.remove(dios) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Dios que ayuda quitado
		}
		else {
			// No tenia esa ayuda
		}
	}
	
	
	// LOCALIZADO
	
	public Set<Seres> getTiene_localizado_a() {
		return tiene_localizado_a;
	}
	
	public void setTiene_localizado_a(Set<Seres> tiene_localizado_a) {
		this.tiene_localizado_a = tiene_localizado_a;
	}
	
	public void addLocalizado(Seres ser) {		// TODO REVISAR
		this.tiene_localizado_a.add(ser);
	}
	
	public void removeLocalizado(Seres ser) {	// TODO REVISAR
		if ( this.tiene_localizado_a.remove(ser) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Ser localizado quitado
		}
		else {
			// No ten�a a ese ser localizado
		}
	}
	
	
	// OBJETOS	TODO BORRAR
	
//	public Set<Objetos> getTiene_objeto() {
//		return tiene_objeto;
//	}
//	
//	public void setTiene_objeto(Set<Objetos> tiene_objeto) {
//		this.tiene_objeto = (Set<Objetos>) tiene_objeto;
//	}
//	
//	public void addObjeto(Objetos objeto) {
//		this.tiene_objeto.add(objeto);
//	}
//	
//	public void addAllObjeto(Set<Objetos> nuevosObjetos) {
//		this.tiene_objeto.addAll(nuevosObjetos);
//	}
//	
//	public void removeObjeto(Objetos objeto) {
//		if ( this.tiene_objeto.remove(objeto) ) {
//			// Objeto quitado
//		}
//		else {
//			// No ten�a ese objeto
//		}
//	}
//	
//	public void removeAllObjeto() {
//		this.tiene_objeto.clear();
//	}
	
	
	
	
	// UBICACI�N
	
	public Lugares getUbicado_en() {
		return ubicado_en;
	}
	
	public void setUbicado_en(Lugares ubicado_en) {
		this.ubicado_en = ubicado_en;
	}
	
	
}

