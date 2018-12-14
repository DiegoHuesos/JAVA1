/*
 * Irma
 * clase para probar una ventana
 * 
 */
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.*;

public class VistaCine extends JFrame {
	protected JLabel lblAdulto, lblNinio, lblClas, 
			lblTotal, lblVacia;
	protected JTextField txtAdulto, txtNinio, txtClas;
	protected JButton bt1;
	protected JPanel miPanel;
	protected Border miBorde;
	
	public VistaCine() {
		super("Cine ITAM");
		miPanel = new JPanel();
		miPanel.setLayout(new GridLayout(5,2));
		
		miBorde = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		miPanel.setBorder(miBorde);
		
		lblAdulto = new JLabel("Boletos Adulto");
		miPanel.add(lblAdulto);
		txtAdulto = new JTextField(10);
		txtAdulto.setText("0");
		miPanel.add(txtAdulto);
		
		lblNinio = new JLabel("Boletos de Ni�o");
		miPanel.add(lblNinio);
		txtNinio = new JTextField(10);
		txtNinio.setText("0");
		miPanel.add(txtNinio);
		
		lblClas = new JLabel("Clasificaci�n");
		miPanel.add(lblClas);
		txtClas = new JTextField(10);
		miPanel.add(txtClas);
		
		bt1 = new JButton("Calcular");
		miPanel.add(bt1);
		lblVacia = new JLabel("");
		miPanel.add(lblVacia);
		
		lblTotal = new JLabel("Total a pagar ");
		miPanel.add(lblTotal);
		
		
		
		super.setContentPane(miPanel);
		
	}

}
