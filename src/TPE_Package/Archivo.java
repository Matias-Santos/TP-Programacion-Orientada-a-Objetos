package TPE_Package;

import java.util.ArrayList;
import java.time.LocalDate;

public class Archivo extends SistemaDeArchivo {

	private double tamanio;
	
	Archivo(String nombre, LocalDate fecha, double tamanio) {
		super(nombre,fecha);
		this.tamanio=tamanio;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public ArrayList<SistemaDeArchivo> buscar (Filtro f) {
		ArrayList<SistemaDeArchivo> aux = new ArrayList<SistemaDeArchivo>();
		if(f.cumple(this))
			aux.add(this);
		return aux;
	}
	public int cantElem() {
		return 1;
	}
	protected ArrayList<String> listarRec (String s) {
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(s + this.getNombre());
		return aux;
	}
}