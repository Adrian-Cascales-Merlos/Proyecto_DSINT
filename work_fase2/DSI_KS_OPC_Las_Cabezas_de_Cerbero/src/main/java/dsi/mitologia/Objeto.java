package dsi.mitologia;


import java.util.HashSet;
import java.util.Set;

// Artilugios con ciertas propiedades y/o capacidades para realizar algo.
public class Objeto {
	private final String nombre;	// REQUERIDO
	private EstadoObj estado;	// REQUERIDO
	private Set<Capacidades> capacidades = new HashSet<>();	// REQUERIDO	// TODO VER QUE HACER CON ESTO
	
	//private Seres en_manos_de;	// TODO: REVISAR: Voy a crear la clase Posee que indica la relación entre Ser y Objeto
	
	
	
	
	public Objeto(String nombre, EstadoObj estado, Set<Capacidades> capacidades) {
		this.nombre = nombre;
		this.estado = estado;
		this.capacidades = capacidades;
	}


	// ESTADO

	public EstadoObj getEstado() {
		return estado;
	}

	public void setEstado(EstadoObj estado) {
		this.estado = estado;
	}


	
	// EN MANOS DE	// TODO REVISAR

//	public Seres getEn_manos_de() {
//		return en_manos_de;
//	}
//
//	public void setEn_manos_de(Seres en_manos_de) {
//		this.en_manos_de = en_manos_de;
//	}
//	
//	public void removeEn_manos_de() {	// TODO REVISAR
//		this.en_manos_de = null;	// Lo he puesto por si algún objeto se destruye, no está en manos de nadie (desaparece)
//	}

	

	// CAPACIDADES

	public Set<Capacidades> getCapacidades() {
		return capacidades;
	}

	public void setCapacidades(Set<Capacidades> capacidades) {
		this.capacidades = capacidades;
	}
	
	public void removeAllCapacidades() {	// TODO REVISAR
		this.capacidades.clear();	// Lo he puesto por si algún objeto se destruye, no tiene ninguna capacidad.
	}

	
	// NOMBRE

	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
