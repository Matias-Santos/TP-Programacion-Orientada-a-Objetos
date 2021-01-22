package TPE_Package;

public abstract class FiltroCompuesto implements Filtro {

	protected Filtro f1,f2;
	
	public FiltroCompuesto(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
}