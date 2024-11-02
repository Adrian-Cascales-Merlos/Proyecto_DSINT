package dsi.mitologia;

import java.util.LinkedList;
import java.util.List;

// Clase que indica las entidades vivas de la ontologia.
// Es una clase abstracta, no se permite crear instancias directamente de esta clase.
public abstract class Ser {
	private final String nombre;				// REQUERIDO
	private List<Capacidades> capacidades = new LinkedList<>();			// Es el único que debe ser una lista (pq puede tener varios objetos con mismas capacidades)
	//private Set<Estado> tiene_condicion = new HashSet<>();	// TODO BORRAR
	//private Set<Dios> tiene_enojo_de = new HashSet<>();		// TODO BORRAR
	//private Set<Dios> tiene_favor_de = new HashSet<>();		// TODO BORRAR
	//private Set<Ser> tiene_localizado_a = new HashSet<>();	// TODO BORRAR
	//private Set<Objeto> tiene_objeto = new HashSet<>();		// TODO BORRAR (Solo dejamos la clase Objeto)
	private Lugar ubicado_en;
	
	
	
	public Ser(String nombre) {
		this.nombre = nombre;
		//	this.tiene_condicion = tiene_condicion;		//TODO BORRAR
	}
	
	// NOMBRE
	
	public String getNombre() {
		return nombre;
	}
	
	// CAPACIDADES	TODO VER QUE HACER
	
	public List<Capacidades> getCapacidades() {
		return capacidades;
	}
	
	public void setCapacidades(List<Capacidades> tiene_capacidad) {
		this.capacidades = tiene_capacidad;
	}
	
	public void addCapacidad(Capacidades capacidad) {		// TODO REVISAR
		this.capacidades.add(capacidad);				// Aquí permitimos añadir capacidades repetidas (pq es una List)
	}
	
	public void removeCapacidad(Capacidades capacidad) {	// TODO REVISAR
		if ( this.capacidades.remove(capacidad) ) { 	// El "remove" ya comprueba si está o no el objeto.
			// Capacidad quitada
		}
		else {
			// No tenía esa capacidad
		}
	}
	
	
	// CONDICIONES (estados)	// TODO BORRAR
	
//	public Set<Estado> getTiene_condicion() {
//		return tiene_condicion;
//	}
//	
//	public void setTiene_condicion(Set<Estado> tiene_condicion) {
//		this.tiene_condicion = tiene_condicion;
//	}
//	
//	public void addCondicion(Estado estado) {
//		this.tiene_condicion.add(estado);
//	}
//	
//	public void removeCondicion(Estado estado) {
//		if ( this.tiene_condicion.remove(estado) ) {
//			// Estado quitado
//		}
//		else {
//			// No tenía ese estado
//		}
//	}
	
	
	// ENOJOS (enfados)	// TODO BORRAR
	
//	public Set<Dios> getTiene_enojo_de() {
//		return tiene_enojo_de;
//	}
//	
//	public void setTiene_enojo_de(Set<Dios> tiene_enojo_de) {
//		this.tiene_enojo_de = tiene_enojo_de;
//	}
//	
//	public void addEnojo(Dios dios) {		// TODO REVISAR
//		this.tiene_enojo_de.add(dios);
//	}
//	
//	public void removeEnojo(Dios dios) {	// TODO REVISAR
//		if ( this.tiene_enojo_de.remove(dios) ) { 	// El "remove" ya comprueba si está o no el objeto.
//			// Dios enojado quitado
//		}
//		else {
//			// No tenia ese Dios enojado
//		}
//	}
	
	
	// FAVORES (ayudas)	TODO BORRAR
	
//	public Set<Dios> getTiene_favor_de() {
//		return tiene_favor_de;
//	}
//	
//	public void setTiene_favor_de(Set<Dios> tiene_favor_de) {
//		this.tiene_favor_de = tiene_favor_de;
//	}
//	
//	public void addFavor(Dios dios) {		// TODO REVISAR
//		this.tiene_favor_de.add(dios);
//	}
//	
//	public void removeFavor(Dios dios) {	// TODO REVISAR
//		if ( this.tiene_favor_de.remove(dios) ) { 	// El "remove" ya comprueba si está o no el objeto.
//			// Dios que ayuda quitado
//		}
//		else {
//			// No tenia esa ayuda
//		}
//	}
	
	
	// LOCALIZADO TODO BORRAR
	
//	public Set<Ser> getTiene_localizado_a() {
//		return tiene_localizado_a;
//	}
//	
//	public void setTiene_localizado_a(Set<Ser> tiene_localizado_a) {
//		this.tiene_localizado_a = tiene_localizado_a;
//	}
//	
//	public void addLocalizado(Ser ser) {		// TODO REVISAR
//		this.tiene_localizado_a.add(ser);
//	}
//	
//	public void removeLocalizado(Ser ser) {	// TODO REVISAR
//		if ( this.tiene_localizado_a.remove(ser) ) { 	// El "remove" ya comprueba si está o no el objeto.
//			// Ser localizado quitado
//		}
//		else {
//			// No tenía a ese ser localizado
//		}
//	}
	
	
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
//			// No tenía ese objeto
//		}
//	}
//	
//	public void removeAllObjeto() {
//		this.tiene_objeto.clear();
//	}
	
	
	
	
	// UBICACIÓN
	
	public Lugar getUbicado_en() {
		return ubicado_en;
	}
	
	public void setUbicado_en(Lugar ubicado_en) {
		this.ubicado_en = ubicado_en;
	}
	
	
}

