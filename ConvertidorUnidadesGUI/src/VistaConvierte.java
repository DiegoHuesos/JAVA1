//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 28/11/2018

//GUI: VistaConvierte

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.*;

public class VistaConvierte extends JFrame{
	protected JLabel lblPulgadas, lblCms, vacio;
	protected JTextField txtPulgadas, txtCms;
	protected JPanel miPanel;
	protected Border miBorde;
	protected Button btConvierte;
	
	public VistaConvierte(){
		super("Convierte medidas");
		miPanel = new JPanel();
		miPanel.setLayout(new GridLayout(3,2));
		miBorde= BorderFactory.createEmptyBorder(50, 50, 50, 50);
		
		vacio=new JLabel("");
		
		
		lblPulgadas= new JLabel("Pulgadas");
		miPanel.add(lblPulgadas);
		
		txtPulgadas= new JTextField();
		miPanel.add(txtPulgadas);
		

		lblCms= new JLabel("Centimetros");
		miPanel.add(lblCms);	
		
		txtCms= new JTextField();
		miPanel.add(txtCms);
	
		btConvierte = new Button("Convierte");
		miPanel.add(btConvierte);
		
		super.setContentPane(miPanel);
	}
}
