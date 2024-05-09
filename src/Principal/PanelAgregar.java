package Principal;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel{
	private JTextField txtNombre;
		
	
 public PanelAgregar(){
	 
	 Pelicula.actualizarContador();
	 
 	GridBagLayout gridBagLayout = new GridBagLayout();
 	gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
 	gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
 	gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
 	gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
 	setLayout(gridBagLayout);
 	
 	JLabel lblId = new JLabel("ID");
 	GridBagConstraints gbc_lblId = new GridBagConstraints();
 	gbc_lblId.insets = new Insets(0, 0, 5, 5);
 	gbc_lblId.gridx = 2;
 	gbc_lblId.gridy = 2;
 	add(lblId, gbc_lblId);
 	
 	JLabel lblID = new JLabel(Pelicula.ProxID());
 	GridBagConstraints gbc_lblID = new GridBagConstraints();
 	gbc_lblID.anchor = GridBagConstraints.WEST;
 	gbc_lblID.insets = new Insets(0, 0, 5, 5);
 	gbc_lblID.gridx = 4;
 	gbc_lblID.gridy = 2;
 	add(lblID, gbc_lblID);
 	
 	JLabel lblNewLabel = new JLabel("Nombre");
 	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
 	gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
 	gbc_lblNewLabel.gridx = 2;
 	gbc_lblNewLabel.gridy = 4;
 	add(lblNewLabel, gbc_lblNewLabel);
 	
 	txtNombre = new JTextField();
 	GridBagConstraints gbc_txtNombre = new GridBagConstraints();
 	gbc_txtNombre.anchor = GridBagConstraints.WEST;
 	gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
 	gbc_txtNombre.gridx = 4;
 	gbc_txtNombre.gridy = 4;
 	add(txtNombre, gbc_txtNombre);
 	txtNombre.setColumns(10);
 	
 	JLabel lblGnero = new JLabel("G\u00E9nero");
 	GridBagConstraints gbc_lblGnero = new GridBagConstraints();
 	gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
 	gbc_lblGnero.gridx = 2;
 	gbc_lblGnero.gridy = 6;
 	add(lblGnero, gbc_lblGnero);
 	
 	JComboBox cbGenero = new JComboBox();
 	GridBagConstraints gbc_cbGenero = new GridBagConstraints();
 	gbc_cbGenero.anchor = GridBagConstraints.WEST;
 	gbc_cbGenero.insets = new Insets(0, 0, 5, 5);
 	gbc_cbGenero.gridx = 4;
 	gbc_cbGenero.gridy = 6;
 	add(cbGenero, gbc_cbGenero);
 	cbGenero.addItem("Seleccione un género");
 	cbGenero.addItem("Terror");
 	cbGenero.addItem("Acción");
 	cbGenero.addItem("Suspenso");
 	cbGenero.addItem("Romántica");
 
 	
 	JButton btnAceptar = new JButton("Aceptar");
 	btnAceptar.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent arg0) {
 			if(txtNombre.getText().isEmpty() || cbGenero.getSelectedIndex() == 0) {
 				JOptionPane.showMessageDialog(null, "No se ha podido agregar la película");
 			}
 			else {
 				Generos gen = new Generos(cbGenero.getSelectedItem().toString());
 	 			Pelicula peli = new Pelicula(txtNombre.getText(), gen);
 	 			peli.guardarPelicula(peli);
 	 			lblID.setText(Pelicula.ProxID());
 	 			txtNombre.setText("");
 	 			cbGenero.setSelectedIndex(0);
 			} 			
 		}
 	});
 	GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
 	gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
 	gbc_btnAceptar.gridx = 3;
 	gbc_btnAceptar.gridy = 8;
 	add(btnAceptar, gbc_btnAceptar);
	 
 }
}
