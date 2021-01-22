package TPE_Package;

public class FiltroAnd extends FiltroCompuesto{

	public FiltroAnd(Filtro f1, Filtro f2) {
		super(f1,f2);
	}
	public boolean cumple(SistemaDeArchivo s) {
		return ((f1.cumple(s)) && (f2.cumple(s)));
	}
}