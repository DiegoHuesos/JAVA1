/*
 * Diego HD
 * 26/0ct/2018
 */
import java.util.Scanner;

public class executableCompany {

	public static void main(String[] args) {
		Scanner lectura= new Scanner (System.in);
		double dato, monto;
		boolean resp;
		
		Company c1= new Company("Don Charlie", "Río Hondo", "55445544", "HEDD98061509H700");
		
		for (int i=1; i<3; i++){
			System.out.println("Dame las ventas del mes "+i+": ");
			monto=lectura.nextDouble();
			resp= c1.altaVentas(monto, i);
			if(!resp)
				System.out.println("Error en el monto de la venta");
			else
				System.out.println("Ok");
		}
		System.out.println(c1.toString());
		System.out.println(c1.antiguedad());

		
		
	}

}
