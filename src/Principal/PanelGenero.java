package Principal;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class PanelGenero extends JPanel{
	private JTextField txtGenero;
	
	public PanelGenero(List<Generos> listaGeneros){
		setLayout(null);
		
		JLabel lblAgregarGeneros = new JLabel("Agregar Generos");
		lblAgregarGeneros.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarGeneros.setBounds(21, 11, 94, 14);
		add(lblAgregarGeneros);
		
		JLabel lblGnerosYaExistentes = new JLabel("Gneros ya existentes");
		lblGnerosYaExistentes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnerosYaExistentes.setBounds(272, 11, 127, 14);
		add(lblGnerosYaExistentes);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(10, 133, 89, 23);
		add(btnAgregar);
		
		JLabel lblLista = new JLabel("");
		lblLista.setBackground(Color.WHITE);
		lblLista.setBounds(221, 41, 219, 231);
		add(lblLista);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 69, 46, 14);
		add(lblId);
		
		JLabel lblProximoID = new JLabel("");
		lblProximoID.setBounds(80, 69, 46, 14);
		add(lblProximoID);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(10, 105, 46, 14);
		add(lblTipo);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(66, 102, 86, 20);
		add(txtGenero);
		txtGenero.setColumns(10);
		
	}
}
