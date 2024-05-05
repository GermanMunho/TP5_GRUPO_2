package Principal;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaInicio extends JFrame{
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmListar;
	private PanelAgregar Panelagregar;
	private PanelListar panellistar;
	
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 230);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panelagregar.setVisible(true);
				panellistar.setVisible(false);
				
			}
		});
		mnMenu.add(mntmAgregar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panelagregar.setVisible(false);
				panellistar.setVisible(true);
				
			}
		});
		mnMenu.add(mntmListar);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		Panelagregar = new PanelAgregar();
		Panelagregar.setBounds(0,0,393,170);
		getContentPane().add(Panelagregar);
		
		panellistar = new PanelListar();
		panellistar.setBounds(0,0,393,170);
		getContentPane().add(panellistar);
		
		Panelagregar.setVisible(true);
		panellistar.setVisible(false);
	}
	

}
