package TPE_Package;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class ElementoCompuesto extends SistemaDeArchivo {
	
	protected ArrayList<SistemaDeArchivo> carpeta= new ArrayList<SistemaDeArchivo>();
	
	public ElementoCompuesto(String nombre, LocalDate fecha) {
		super(nombre,fecha);
	}
	public boolean add(SistemaDeArchivo s) {
		if (!carpeta.contains(s))
		{
			carpeta.add(s);
			return true;
		}
		return false;
	}
	public int cantElem(){
		int aux=0;
		for(SistemaDeArchivo a: carpeta)
			aux+= a.cantElem();
		return aux;
	}
	public abstract double getTamanio();
}