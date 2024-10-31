package dsi.mitologia;

public abstract class Estados {
	private final String nombre_estado;	// TODO Creo que se puede quitar, el propio nombre de la clase ya lo indica. Quiz�s sea �til solo para imprimir por pantalla
	private final Seres tiene_ser;			// Ser que est� en dicho estado
	
	
	public Estados(String nombre_estado, Seres tiene_ser) {
		super();
		this.nombre_estado = nombre_estado;		// TODO Creo que no es necesario (quiz�s para imprimir)
		this.tiene_ser = tiene_ser;
	}
	
	// NOTA:
	// No ponemos Setters porque el objeto JAVA no puede ser modificado. Cada objeto indica una relaci�n

	public String getNombre_estado() {
		return nombre_estado;
	}


	public Seres getTiene_ser() {
		return tiene_ser;
	}
	
	
}
