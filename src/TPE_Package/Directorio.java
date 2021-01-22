package TPE_Package;

import java.util.ArrayList;
import java.time.LocalDate;

public class Directorio extends ElementoCompuesto{

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre,fecha);
	}
	public double getTamanio() {
		double aux=0;
		for(SistemaDeArchivo a: carpeta)
			aux+= a.getTamanio();
		return aux;
	}
	public ArrayList<SistemaDeArchivo> buscar (Filtro f) {
		ArrayList<SistemaDeArchivo> aux=new ArrayList<SistemaDeArchivo>();
		for(SistemaDeArchivo c: carpeta)
			aux.addAll(c.buscar(f));
		return aux;
	}
	protected ArrayList<String> listarRec (String s) {
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(s + this.getNombre());
		for (SistemaDeArchivo sis : carpeta)
			aux.addAll(sis.listarRec(s + this.getNombre() + "\\"));
		return aux;
	}
}