package Principal;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Pelicula implements Comparable<Pelicula>{
	
	private final int id;
	private String Nombre;
	private Generos Genero;
	private static Integer cont = 0;
	
	public Pelicula(String nombre, Generos genero) {		
		id = cont+1;
		this.Nombre = nombre;
		this.Genero = genero;
	}
	public Pelicula(int id, String nombre, Generos genero) {
		this.id = id;
		this.Nombre = nombre;
		this.Genero = genero;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getGenero() {
		return Genero.getNombre();
	}
	
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	static String ProxID() {
		return Integer.toString(cont + 1);
	}
	@Override
	public String toString() {
		return id + "- " + Nombre + " - Genero: " + Genero.getNombre();
	}
	
	public void guardarPelicula(Pelicula pelicula) {
	    String archivo = "Peliculas.txt";
	    File file = new File(archivo);
	    if (!file.exists()) {
	        try {
	            file.createNewFile(); 
	        } catch (IOException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Error al crear el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
	            return; 
	        }
	    }
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
	        bw.write(pelicula.getId() + "-" + pelicula.getNombre() + "-" + pelicula.getGenero() + "\n");
	        bw.flush();
	        cont++;
	    } catch (IOException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al guardar la película en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
	
	public static List<Pelicula> cargarPeliculas() {
	    List<Pelicula> peliculas = new ArrayList<>();
	    String archivo = "Peliculas.txt";
	    File file = new File(archivo);
	    if (!file.exists()) {
	        return peliculas;
	    }
	    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	        String linea;
	        while ((linea = br.readLine()) != null) {
	            String[] datos = linea.split("-");
	            if (datos.length >= 3) {
	                int id = Integer.parseInt(datos[0]);
	                Generos genero = new Generos(datos[2]);  
	                Pelicula pelicula = new Pelicula(id, datos[1], genero);  
	                peliculas.add(pelicula);
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return peliculas;
	}
	
	public static int obtenerMaxId(List<Pelicula> peliculas) {
	    int maxId = 0;
	    for (Pelicula pelicula : peliculas) {
	        if (pelicula.getId() > maxId) {
	            maxId = pelicula.getId();
	        }
	    }
	    return maxId;
	}
	
	public static void actualizarContador() {
	    List<Pelicula> peliculas = cargarPeliculas();
	    if (!peliculas.isEmpty()) {
	        cont = obtenerMaxId(peliculas);
	    }
	}
	@Override
	public int compareTo(Pelicula o) {
		// TODO Auto-generated method stub
		return this.Nombre.compareTo(o.getNombre());
	}

}
