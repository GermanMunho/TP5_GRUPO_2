package Principal;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetSerializer;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PantallaInicio extends JFrame{
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmListar;
	private JMenuItem mntmAgregarGeneros;
	private JPanel contentPane;
	
	private PanelAgregar PanelAgregar;
	private PanelListar PanelListar;
	private PanelGenero PanelGenero;
	
	private List<Pelicula> listaPeliculas;
	private List<Generos> listaGeneros;
	
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 230);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		mntmAgregar = new JMenuItem("Agregar Pelicula");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelAgregar= new PanelAgregar();
				contentPane.add(PanelAgregar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnMenu.add(mntmAgregar);
		
		mntmListar = new JMenuItem("Listar Peliculas");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelListar= new PanelListar(listaPeliculas);
				contentPane.add(PanelListar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnMenu.add(mntmListar);
		
		mntmAgregarGeneros = new JMenuItem("Agregar Generos");
		mntmAgregarGeneros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelGenero PanelGenero= new PanelGenero(listaGeneros);
				contentPane.add(PanelGenero);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnMenu.add(mntmAgregarGeneros);
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
	}
	

}
