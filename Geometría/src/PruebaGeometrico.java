/* Diego Hernández Delgado (176262)
 * Fecha: 14/09/2018
 * "Ejecutable de la clase Circulo"
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PruebaGeometrico{
	public static void main(String[]args){
		Scanner lectura;
		Circulo miCirculo, circulo1;
		DecimalFormat df;
		
		df=new DecimalFormat("#.00");
		lectura=new Scanner(System.in);
		/*miCirculo=new Circulo(5);
		
		
		System.out.print(miCirculo.toString());
		System.out.println("Área: "+miCirculo.calculaArea());
		System.out.println("Circunferencia: "+miCirculo.calculaCircunferencia());
		
		System.out.println("\nDame el nuevo radio: ");
		miCirculo.setRadio(lectura.nextDouble());
		
		System.out.println("\nEl nuevo radio es: "+miCirculo.getRadio());
		System.out.println("La nueva area es: "+miCirculo.calculaArea());
		System.out.println("El nueva Circunferencia es: "+miCirculo.calculaCircunferencia());*/
		
		circulo1=new Circulo(5);
		//System.out.print("Dame radio: ");
		//circulo1.setRadio(lectura.nextDouble());
		//System.out.println("\nÁrea: "+df.format(circulo1.calculaArea()));
		System.out.println("Circunferencia: "+df.format(circulo1.calculaCircunferencia()));
		
		
	}
}