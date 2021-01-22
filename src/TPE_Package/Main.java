package TPE_Package;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		SistemaDeArchivo a= new Archivo("a.exe",LocalDate.now(), 2.13);
		SistemaDeArchivo b= new Archivo("b.exe",LocalDate.now(), 2.13);
		SistemaDeArchivo hh= new Archivo("hh.exe",LocalDate.now(), 2.13);
		SistemaDeArchivo mm= new ArchivoComprimido("mm.zip",LocalDate.now(), 2.13);
		SistemaDeArchivo jj= new Archivo("jj.doc",LocalDate.now(), 2.13);

		ElementoCompuesto dir1 = new Directorio("dir1",LocalDate.now());
		ElementoCompuesto dir2= new Directorio("dir2",LocalDate.now());
		ElementoCompuesto carpetaAux= new Directorio("carpetaAux",LocalDate.now());
		
		dir2.add(mm);
		dir1.add(hh);
		dir1.add(dir2);
		dir1.add(jj);
		carpetaAux.add(a);
		carpetaAux.add(b);
		carpetaAux.add(dir1);
		for (String s : carpetaAux.listar())
			System.out.println(s + "\n");
	}
}