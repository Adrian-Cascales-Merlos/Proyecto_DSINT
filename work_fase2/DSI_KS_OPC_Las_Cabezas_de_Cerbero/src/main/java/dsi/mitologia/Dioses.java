package dsi.mitologia;

import java.util.HashSet;
import java.util.Set;

public class Dioses extends Seres {
	
	private Set<Seres> da_favor_a = new HashSet<>();
	private Set<Seres> esta_enojado_con = new HashSet<>();
	
	public Dioses(String tiene_nombre) {
		super(tiene_nombre);
		this.addCapacidad(Capacidades.INMORTALIDAD);
	}
	

	public Set<Seres> getDa_favor_a() {
		return da_favor_a;
	}

	public void setDa_favor_a(Set<Seres> da_favor_a) {
		this.da_favor_a = da_favor_a;
	}
	
	public void addFavorA(Seres ser) {		// TODO REVISAR
		this.da_favor_a.add(ser);
	}
	
	public void removeFavorA(Seres ser) {	// TODO REVISAR
		if ( this.da_favor_a.remove(ser) ) { 	// El "remove" ya comprueba si está o no el objeto.
			// Quitado Ser
		}
		else {
			// No tenia ese Ser 
		}
	}
	
	

	public Set<Seres> getEsta_enojado_con() {
		return esta_enojado_con;
	}

	public void setEsta_enojado_con(Set<Seres> esta_enojado_con) {
		this.esta_enojado_con = esta_enojado_con;
	}
	
	public void addEnojoCon(Seres ser) {		// TODO REVISAR
		this.esta_enojado_con.add(ser);
	}
	
	public void removeEnojoCon(Seres ser) {	// TODO REVISAR
		if ( this.esta_enojado_con.remove(ser) ) { 	// El "remove" ya comprueba si está o no el objeto.
			// Quitado Ser
		}
		else {
			// No tenia ese Ser
		}
	}
	
	
}
