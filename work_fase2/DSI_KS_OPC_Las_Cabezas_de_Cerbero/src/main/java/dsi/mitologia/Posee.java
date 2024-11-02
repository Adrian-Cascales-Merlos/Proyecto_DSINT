package dsi.mitologia;

// Posee es un clase que indica la relación de pertenencia de un Objeto.
// Cada instancia (objeto Java) de la clase indicará una relación de posesión.
public class Posee {
	private final Ser poseedor;	// Ser que tiene en posesión el objeto
	private final Objeto objeto;	// Objeto que tiene el ser "poseedor"
	// Pongo los atributos "final" porque nunca van a cambiar. Si el objeto cambia de poseedor se crea una instancia nueva.
	// Se incluirá esa nueva instancia en la base de hechos y se eliminará la actual.
	
	public Posee(Ser poseedor, Objeto objeto) {
		this.poseedor = poseedor;
		this.objeto = objeto;
	}

	public Ser getPoseedor() {
		return poseedor;
	}

	public Objeto getObjeto() {
		return objeto;
	}
	
	
}
