package dsi.mitologia;

// Clase auxiliar (es un enumerado) que usamos para indicar las capacidades que tiene un Objeto
public enum Capacidades {
	ANTI_CORROSIVO,
	ESPEJO,
	INMORTALIDAD,
	INVISIBILIDAD,
	PETRIFICAR,
	VOLAR,
	NINGUNA;		// TODO VER. Usamos Ninguna en lugar de null para indicar que un objeto no tiene capacidad (bien porque no tenga, o porque esté roto)
}
