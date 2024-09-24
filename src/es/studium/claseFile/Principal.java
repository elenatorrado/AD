package es.studium.claseFile;
import java.io.File;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		/* Instanciamos el objeto File */
		File f = new File("proyecto");
		/* Creamos el directorio proyecto */
		f.mkdirs();
		/* Instanciamos otro objeto File para crear el fichero */
		File f2 = new File("proyecto/libros.xml");
		/* Creamos el fichero en el directorio proyecto */
		try {
			f2.createNewFile();
			System.out.println("Nombre del directorio creado: " + f.getName());
			System.out.println("Nombre del fichero creado: " + f2.getName());
			System.out.println("Directorio padre: " + f2.getParent());
			System.out.println("Ruta relativa: " + f2.getPath());
			System.out.println("Ruta absoluta: " + f2.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}