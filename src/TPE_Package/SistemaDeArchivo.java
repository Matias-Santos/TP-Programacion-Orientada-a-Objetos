package TPE_Package;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class SistemaDeArchivo {
	
	protected String nombre;
	protected LocalDate fecha;
	
	SistemaDeArchivo(String nombre, LocalDate fecha) {
		this.nombre=nombre;
		this.fecha=fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public abstract double getTamanio();
	public abstract ArrayList<SistemaDeArchivo> buscar (Filtro f);
	protected abstract ArrayList<String> listarRec (String s);
	public ArrayList<String> listar () {
		ArrayList<String> aux = listarRec("");
		return aux;
	}
	public abstract int cantElem();
}