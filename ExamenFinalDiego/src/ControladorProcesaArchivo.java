/*Diego Hernandez Delgado
 * Clave unica: 176262
 * Fecha: 13/12/2018
 * EXAMEN FINAL
 */

//CLASES IMPORTADAS
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;


//CLASE CONTROLADOR
public class ControladorProcesaArchivo extends vistaProcesaArchivo{
	private static final long serialVersionUID = 1L;

	//METODO CONSTRUCTOR
	public ControladorProcesaArchivo(String title) {
		super(title);
		btnA.addActionListener(new Escucha());
	}
	
	//METODO ESCUCHA
	public class Escucha implements ActionListener{
		String nameFile;
		String stringLetra;
		char letra;
		File archivo;
		
		public void actionPerformed(ActionEvent ae) {
			String res="";
			String aux="";
			nameFile=txtNom.getText();
			stringLetra=txtLetra.getText();
			letra=stringLetra.charAt(0);
			archivo=new File(nameFile+".txt");
			try(Scanner lectura=new Scanner(archivo)){
				while(lectura.hasNext()) {
					aux=lectura.next();
					if(aux.charAt(0)==letra || aux.charAt(aux.length()-1)==letra)
						res+=aux+"  ";
				}
				lectura.close();
			}catch(Exception e) {
				System.out.println("Error"+e.getMessage());
			}
			txtRes.setText(res);
		}
	}
	
	
	//CLASE MAIN PARA PRUEBA
	public static void main (String[] args) {
		new ControladorProcesaArchivo("Procesa Archivo");
	}
}
