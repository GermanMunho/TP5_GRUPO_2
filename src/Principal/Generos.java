package Principal;

public class Generos {
	private final Integer id;
	private String nombre;
	private static Integer cont = 0;
	
	public Generos(String nombre) {
		cont++;
		id=cont;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	
	static String ProxID() {
		cont++;
		Integer retorno= cont;
		cont--;
		return retorno.toString();
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}
