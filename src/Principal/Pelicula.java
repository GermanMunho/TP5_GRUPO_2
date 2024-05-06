package Principal;

public class Pelicula {
	
	private final int id;
	private String Nombre;
	private String Genero;
	private static Integer cont = 0;
	
	public Pelicula(String nombre, String genero) {
		cont++;
		id = cont;
		this.Nombre = nombre;
		this.Genero = genero;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	static String ProxID() {
		cont++;
		Integer retorno= cont;
		cont--;
		return retorno.toString();
	}
	@Override
	public String toString() {
		return id + "- " + Nombre + " - Genero: " + Genero;
	}
	
}
