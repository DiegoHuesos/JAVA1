/** 
 *@author Diego Hernández Delgado
 *@version 1.0
 *Clave única: 176262
 *Fecha: 01/12/2018
 *GUI: Clase Vista
 */

/**Se importan las clases necesarias para poder crear el GUI*/
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;


public class ConvertidorVista extends JFrame{
	private static final long serialVersionUID=1l;
	protected JPanel panel;
	protected Border borde;
	protected GridLayout gridL;
	private JLabel lblKms, lblMillas;
	protected JTextField txtKms, txtMillas;
	
	
	/** 
	 * @author Administrador
	 * Constructor de la clase ConvertidorVista
	 * @param titulo
	 */
	public ConvertidorVista(String titulo){
		
		//Se extiende el constructor de la clase JFrame
		super(titulo);
		
		//Se instancian el panel, objeto donde se añaden todos los elementos:
		panel=new JPanel();
		
		//Se instancian atributos del panel y se colocan(set) cómo tal:
		borde= BorderFactory.createEmptyBorder(5, 30, 30, 30);
		gridL= new GridLayout(4,1);
		panel.setBorder(borde);
		panel.setLayout(gridL);
		
		//Se instancian los objetos que se añadiran al Layout y se añaden(add):
		lblKms=new JLabel("Kilometros");
		lblMillas= new JLabel("Millas");
		txtKms=new JTextField(10);
		txtMillas=new JTextField(10);
		
		panel.add(lblKms);
		panel.add(txtKms);
		panel.add(lblMillas);
		panel.add(txtMillas);
		
		//Se añade(add) el panel a la clase ConvertidorVista(al Frame):
		this.add(panel);
		
		//Se establece la posicion y el tamaño de la ventana:
		this.setBounds(500,200,300,300);   //(sitio x, sitio y, dimensión x, dimensión y)
		
		//Se define la acción a realizar al oprimir el botón de cerrar:
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Se define la visibilidad de la pantalla al ejecutarse la clase:
		this.setVisible(true);
	}
	
	/** CLASE EJECUTABLE PARA PRUEBA DE LA CLASE CONVERTIDOR VISTA*/
	public static void main (String [] args){
		ConvertidorVista pruebaConvertidorVista = new ConvertidorVista("pruebaConvertidorVista");
	}
		
}
