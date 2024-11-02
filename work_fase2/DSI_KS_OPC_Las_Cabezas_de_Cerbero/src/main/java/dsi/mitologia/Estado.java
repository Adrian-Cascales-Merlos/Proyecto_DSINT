package dsi.mitologia;

// Estado o estados en el se encuentra un Ser en un momento dado. Puede estar Vivo, Muerto, Libre, Apresado.
// Es una clase abstracta, no se permite crear instancias directamente de esta clase.
// Cada instancia (objeto Java) de las clases hijas de Estado indicará una relación de estado en que se encuentra un ser.
public abstract class Estado {
	private final String nombre;	// TODO REVISAR: Creo que se puede quitar, el propio nombre de la clase ya lo indica. Quizás sea útil solo para imprimir por pantalla
	private final Ser ser;			// Ser que está en dicho estado
	
	
	public Estado(String estado, Ser ser) {
		this.nombre = estado;		// TODO REVISAR: Creo que no es necesario (quizás para imprimir). Quizás solo usar el toString()
		this.ser = ser;
	}
	

	public String getEstado() {
		return nombre;
	}


	public Ser getSer() {
		return ser;
	}
	
	
}
