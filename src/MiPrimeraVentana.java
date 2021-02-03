import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MiPrimeraVentana {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame ventana=new JFrame("Validacion de Usuario");
		JPanel contenedor=new JPanel();
		JButton boton=new JButton("Validar");
		JLabel etiqueta=new JLabel("Usuario");
		JTextField texto=new JTextField(20);
		JMenuBar menu=new JMenuBar();
		JMenu usuario=new JMenu("Usuarios");
		JMenu configuracion=new JMenu("Configuracion");
		JMenu salir=new JMenu("Salir");
		
		boton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String nombre=texto.getText();
				System.out.println(nombre);
				
				if(nombre.equals("Pedro")) {
					menu.setVisible(true);
				}else {
					menu.setVisible(false);
					System.out.println("Usuario Incorrecto");
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		menu.setVisible(false);
		

		
		
		ventana.setTitle("Un titulo");
		ventana.setSize(500,500);
		ventana.setLocation(710, 290);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	
		
		contenedor.add(etiqueta);
		contenedor.add(texto);
		contenedor.add(boton);
		
		menu.add(usuario);
		menu.add(configuracion);
		menu.add(salir);
		
		ventana.setContentPane(contenedor);
		ventana.setJMenuBar(menu);
		
		ventana.setVisible(true);
	}

}
