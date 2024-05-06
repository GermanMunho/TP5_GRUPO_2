package Principal;

import javax.swing.JPanel;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PanelListar extends JPanel{
	
	private JLabel lblLista;
	
	public PanelListar(List<Pelicula> listaPeliculas) {
		setLayout(null);
		
		lblLista = new JLabel("");
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblLista.setBounds(96, 11, 270, 249);
		add(lblLista);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeliculas.setBounds(21, 135, 51, 22);
		add(lblPeliculas);
		
	}
}
