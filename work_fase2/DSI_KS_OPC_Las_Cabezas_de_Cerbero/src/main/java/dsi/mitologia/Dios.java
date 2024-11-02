package dsi.mitologia;

// Deidades y dioses menores relevantes en la mitologia griega.
public class Dios extends Ser {
	
	//private Set<Ser> da_favor_a = new HashSet<>();		// TODO BORRAR
	//private Set<Ser> esta_enojado_con = new HashSet<>();	// TODO BORRAR
	
	public Dios(String nombre) {
		super(nombre);
		this.addCapacidad(Capacidades.INMORTALIDAD);
	}
	
	// TODO BORRAR
//	public Set<Ser> getDa_favor_a() {
//		return da_favor_a;
//	}
//
//	public void setDa_favor_a(Set<Ser> da_favor_a) {
//		this.da_favor_a = da_favor_a;
//	}
//	
//	public void addFavorA(Ser ser) {		// TODO REVISAR
//		this.da_favor_a.add(ser);
//	}
//	
//	public void removeFavorA(Ser ser) {	// TODO REVISAR
//		if ( this.da_favor_a.remove(ser) ) { 	// El "remove" ya comprueba si está o no el objeto.
//			// Quitado Ser
//		}
//		else {
//			// No tenia ese Ser 
//		}
//	}
	
	
	// TODO BORRAR
//	public Set<Ser> getEsta_enojado_con() {
//		return esta_enojado_con;
//	}
//
//	public void setEsta_enojado_con(Set<Ser> esta_enojado_con) {
//		this.esta_enojado_con = esta_enojado_con;
//	}
//	
//	public void addEnojoCon(Ser ser) {		// TODO REVISAR
//		this.esta_enojado_con.add(ser);
//	}
//	
//	public void removeEnojoCon(Ser ser) {	// TODO REVISAR
//		if ( this.esta_enojado_con.remove(ser) ) { 	// El "remove" ya comprueba si está o no el objeto.
//			// Quitado Ser
//		}
//		else {
//			// No tenia ese Ser
//		}
//	}
	
	
}
