package TPE_Package;

import java.util.ArrayList;
import java.time.LocalDate;

public class Link extends SistemaDeArchivo {

	private SistemaDeArchivo vinculo;
	private final double tamanio = 1;
	
	Link(String nombre, LocalDate fecha, SistemaDeArchivo vinculo) {
		super(nombre,fecha);
		this.vinculo=vinculo;
	}
	public SistemaDeArchivo getVinculo() {
		return vinculo;
	}
	public void setVinculo(SistemaDeArchivo vinculo) {
		this.vinculo = vinculo;
	}
	public ArrayList<SistemaDeArchivo> buscar (Filtro f) {
		return this.getVinculo().buscar(f);
	}
	public double getTamanio() {
		return tamanio;
	}
	public int cantElem() {
		return 1;
	}
	protected ArrayList<String> listarRec (String s) {
		return this.getVinculo().listarRec(s);
	}
}