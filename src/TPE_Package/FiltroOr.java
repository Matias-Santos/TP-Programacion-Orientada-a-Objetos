package TPE_Package;

public class FiltroOr extends FiltroCompuesto {

	public FiltroOr(Filtro f1, Filtro f2) {
		super(f1,f2);
	}
	public boolean cumple(SistemaDeArchivo s) {
		return ((f1.cumple(s)) || (f2.cumple(s)));
	}
}