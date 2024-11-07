package dsi.mitologia;


// Clase que indica las entidades vivas de la ontologia.
// Es una clase abstracta, no se permite crear instancias directamente de esta clase.
public abstract class Ser {
	private final String nombre;	// REQUERIDO
	private Lugar ubicado_en;
	
	
	public Ser(String nombre) {
		this.nombre = nombre;
	}
	
	// NOMBRE
	public String getNombre() {
		return nombre;
	}
	

	// UBICACIÓN
	public Lugar getUbicado_en() {
		return ubicado_en;
	}
	
	public void setUbicado_en(Lugar ubicado_en) {
		this.ubicado_en = ubicado_en;
	}
	
}

