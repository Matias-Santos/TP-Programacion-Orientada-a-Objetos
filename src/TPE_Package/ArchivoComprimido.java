package TPE_Package;

import java.util.*;
import java.time.LocalDate;

public class ArchivoComprimido extends ElementoCompuesto{
	
	private double factorCompresion;
	
	public ArchivoComprimido(String nombre, LocalDate fecha,double factorCompresion) {
		super(nombre,fecha);
		this.factorCompresion=factorCompresion;
	}
	public double getFactorCompresion() {
		return factorCompresion;
	}
	public void setFactorCompresion(double factorCompresion) {
		this.factorCompresion = factorCompresion;
	}
	public double getTamanio() {
		double aux=0;
		for(SistemaDeArchivo a: carpeta)
			aux+= a.getTamanio();
		return aux*this.getFactorCompresion();
	}
	public ArrayList<SistemaDeArchivo> buscar(Filtro f) {
		ArrayList<SistemaDeArchivo> aux = new ArrayList<SistemaDeArchivo>();
		Iterator<SistemaDeArchivo> itr = carpeta.iterator();
		boolean encontrado = false;
		while (itr.hasNext() && (!encontrado))
		{
			SistemaDeArchivo s = itr.next();
			encontrado = f.cumple(s);
		}
		if (encontrado)
			aux.add(this);
		return aux;
	}
	protected ArrayList<String> listarRec (String s) {
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(s + this.getNombre());
		return aux;
	}
}