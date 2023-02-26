// ejemplo o simulacion de conexcion a una base de datos 

public class Conexion implements AutoCloseable{

	public Conexion() {
	    System.out.println("Abriendo conexion");
	}
	public void leerDatos() {
	    System.out.println("Recibiendo datos");
	    throw new IllegalStateException();
	}
	public void cerrar() {
	    System.out.println("Cerrando conexion");
	}
	
	public void close() throws Exception {
		cerrar();
	} 
}
