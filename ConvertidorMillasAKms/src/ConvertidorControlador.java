/** 
 *@author Diego Hernández Delgado
 *@version 1.0
 *Clave única: 176262
 *Fecha: 01/12/2018
 *GUI: Clase Vista
 */

/**Se importan las librerias necesarias para poder detectar las escuchas y los eventos: */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ConvertidorControlador extends ConvertidorVista{
	private static final long serialVersionUID=1l;
	EscuchaKilometros ek= new EscuchaKilometros();
	
	/** 
	 * @author Administrador
	 * Constructor del controlador:
	 */
	public ConvertidorControlador(String titulo){
		
		//Se extiende el constructor de la vista para tener la ventena y todos sus lementos:
		super(titulo);
		
		//Se le agrega al elemento de la vista deseado un objeto de la clase definida para esa funcion;
		txtKms.addActionListener(ek);
		txtMillas.addActionListener(new EscuchaMillas());
		
	}
	
	//Clase que tendra la funcionalidad al escuchar una accion. Implementa la clase ActionListener:
	public class EscuchaKilometros implements ActionListener{
		
		//Método que realizará al escuchar un evento:
		public void actionPerformed(ActionEvent ae){
			final double FACTOR= 1.69344;
			String strKm;
			String strMi="";
			
			strKm= txtKms.getText();
			if(!strKm.equals("")){
				double valor= Double.parseDouble(strKm);
				valor/=FACTOR;
				strMi= strMi+ valor;
				txtMillas.setText(strMi);
			}	
		}
	}
	
	public class EscuchaMillas implements ActionListener{
		
		public void actionPerformed(ActionEvent ae){
			final double FACTOR=0.6217;
			String strMi;
			String strKm="";
			
			strMi=txtMillas.getText();
			if(!strMi.equals("")){
				double valor= Double.parseDouble(strMi);
				valor/=FACTOR;
				strKm=strKm+valor;
				txtKms.setText(strKm);
			}
		}
	}
	
	public static void main (String [] args){
		ConvertidorControlador cc= new ConvertidorControlador("pruebaConvertidorControlador");
	}
	
}
