package TPE_Package;

import java.time.LocalDate;
public class FiltroFecha {

	private LocalDate fecha;
	
	public FiltroFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean cumple(SistemaDeArchivo s) {
		return (this.getFecha() == (s.getFecha()));
	}
}