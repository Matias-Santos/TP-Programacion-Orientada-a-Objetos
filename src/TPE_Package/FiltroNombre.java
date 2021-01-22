package TPE_Package;

public class FiltroNombre implements Filtro {

	private String nombre;
	
	FiltroNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean cumple(SistemaDeArchivo s) {
		return (this.getNombre().equals(s.getNombre()));
	}
}