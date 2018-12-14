/*Diego Hernandez Delgado
 * Clave unica: 176262
 * Fecha: 13/12/2018
 * EXAMEN FINAL
 */


//CLASES IMPORTADAS
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;


//CLASE VISTA
public class vistaProcesaArchivo extends JFrame{

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;
	protected JPanel panel;
	protected Border borde;
	protected GridLayout gl;
	private JLabel lblNom, lblLetra;
	protected JTextField txtNom, txtLetra, txtRes;
	protected JButton btnA;
	
	
	//METODO CONSTRUCTOR
	public vistaProcesaArchivo(String title) {
		super(title);
		
		panel=new JPanel();
		borde=BorderFactory.createEmptyBorder(30, 30, 30, 30);
		gl=new GridLayout(3,1);
		panel.setBorder(borde);
		panel.setLayout(gl);
		
		lblNom=new JLabel("Nombre del archivo:");
		txtNom=new JTextField("");
		lblLetra=new JLabel("Letra:");
		txtLetra=new JTextField("");
		btnA=new JButton("Aceptar");
		txtRes=new JTextField("");
		
		panel.add(lblNom);
		panel.add(txtNom);
		panel.add(lblLetra);
		panel.add(txtLetra);
		panel.add(btnA);
		panel.add(txtRes);
		
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(300, 300, 400, 300);
	}
	
	
	//CLASE MAIN PARA PROBAR SOLUCION
	public static void main(String[]args) {
		new vistaProcesaArchivo("PruebaVista");
	}
}
