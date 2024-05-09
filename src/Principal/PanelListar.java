package Principal;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PanelListar extends JPanel{
	
	public PanelListar(List<Pelicula> listaPeliculas) {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Pel\u00EDculas");
		lblPeliculas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeliculas.setBounds(21, 135, 65, 22);
		add(lblPeliculas);
		
		List<Pelicula> listaPeliculas1 = Pelicula.cargarPeliculas();
		
		ArrayList<Pelicula> conjuntoPeliculas = new ArrayList<>(listaPeliculas1);
		Collections.sort(conjuntoPeliculas);
		
		DefaultListModel<String> peliculaListModel = new DefaultListModel<>();
		
		for (Pelicula pelicula : conjuntoPeliculas) {
            peliculaListModel.addElement(pelicula.toString());
        }
		
		JList<String> list = new JList<>(peliculaListModel);
        list.setBounds(110, 11, 308, 248);
        add(list);
        
	}
}
