import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 28/11/2018

//GUI: ControladorConvierte
public class ControladorConvierte extends VistaConvierte{
	
	//Escucha:
	public class EscuchaPulgadas implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0){
			String leePulgadas, leeCentimetros;
			double pulgadas, centimetros;
			
			leePulgadas = txtPulgadas.getText();
			pulgadas = Double.parseDouble(leePulgadas);
			
			centimetros= pulgadas*2.54;
			leeCentimetros= ""+centimetros;
			//Otra forma: leeCentimetros = new Double(centimetros).toString;
			txtCms.setText(leeCentimetros);
		}	
		
		
	}
	 
	
		public void escuchaBoton(ActionEvent arg0){
			String leePulgadas, leeCentimetros;
			double pulgadas, centimetros;
			
			leePulgadas = txtPulgadas.getText();
			pulgadas = Double.parseDouble(leePulgadas);
			
			centimetros= pulgadas*2.54;
			leeCentimetros= ""+centimetros;
			//Otra forma: leeCentimetros = new Double(centimetros).toString;
			txtCms.setText(leeCentimetros);
		}
	
	
	
	//
	public ControladorConvierte(){
		txtPulgadas.addActionListener(new EscuchaPulgadas());
		txtPulgadas.addActionListener(new EscuchaBoton());
	}
	
	
}
