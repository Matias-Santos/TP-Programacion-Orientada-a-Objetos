package TPE_Package;

public class FiltroTamanio implements Filtro{
	
	private double tamanio;
	
	public FiltroTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public boolean cumple(SistemaDeArchivo s) {
		return (this.getTamanio() == (s.getTamanio()));
	}
}