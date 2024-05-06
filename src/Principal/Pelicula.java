package Principal;

public class Pelicula {
	
	private String id;
	private String nombre;
	private Generos genero;
	private static int cont = 0;
	
	public Pelicula() {
		cont++;
		id = Integer.toString(cont);
		genero.setNombre("Sin genero");
	}
	public Pelicula(String nombre, String genero) {
		cont++;
		id = Integer.toString(cont);
		this.nombre = nombre;
		this.genero = new Generos(genero);
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return id + "- " + nombre + " - Genero: " + genero.toString();
	}
	
}
