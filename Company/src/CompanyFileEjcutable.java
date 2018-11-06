import java.util.Scanner;
import java.io.File;

public class CompanyFileEjcutable {

	public static void main(String[] args) {
		Scanner lectura= new Scanner (System.in);
		double dato, monto;
		boolean resp;
		String cadena;
		
		System.out.println("Dame el nombre del archivo: ");
		cadena=lectura.nextLine();
		File archivo= new File (cadena);
		
		
		Company c1= new Company("Don Charlie", "Río Hondo", "55445544", "HEDD98061509H700");
		
		try(Scanner leeArchivo=new Scanner(archivo)){
			for(int i=0; i<3; i++){
				monto=leeArchivo.nextDouble();
				c1.altaVentas(monto, i+1);
			}
			leeArchivo.close();
			
		}
		catch(Exception err){
			System.out.println("Error debido a "+err.getMessage());
			
		}
		
		
		/*for (int i=1; i<3; i++){
			System.out.println("Dame las ventas del mes "+i+": ");
			monto=lectura.nextDouble();
			resp= c1.altaVentas(monto, i);
			if(!resp)
				System.out.println("Error en el monto de la venta");
			else
				System.out.println("Ok");
		}
		*/
		
		System.out.println(c1.toString());
		System.out.println("Tiene "+c1.antiguedad()+" anios.");

		
		
	}

}
