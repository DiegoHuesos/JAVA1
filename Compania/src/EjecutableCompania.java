import java.util.*;
public class EjecutableCompania {
	/*
	 * Diego Hernandez Delgado 176262
	 * 30/10/2017
	 * Clase para ejecutar la clase Compania
	 */

	public static void main(String[] args) {
		Compania compania1;
		Scanner lectura;
		int i, mes;
		double monto;
		boolean resp;
		String nmes;
		
		compania1= new Compania("Empaques SA de CV","Av Constitucion 34","Queretaro","Sr. P�rez");
		lectura= new Scanner(System.in);
		for(i=1;i<=12;i++){
			System.out.print("Dame las ventas del mes "+i+": ");
			monto=lectura.nextDouble();
			resp=compania1.altaVenta(monto, i);
			if (resp)//ya no necesito aclarar si es true or false, el primero es true,else es false
				System.out.println("Alta exitosa");
			else
				System.out.println("Alta NO exitosa");				
		}//for
		System.out.println(compania1.toString());
		monto=compania1.promedio();
		System.out.println("El promedio de las ventas es "+monto);
		mes=compania1.mesMayor();
		System.out.println("En el mes "+mes+" se presentaron la mayores ventas");
		nmes=compania1.mesMayor2();
		System.out.println("En el mes "+nmes+" se presentaron la mayores ventas");
		mes=compania1.mesMenor();
		System.out.println("En el mes "+mes+" se presentaron las menores ventas");
		i=compania1.arribaPromedio();
		nmes=compania1.mesMenor2();
		System.out.println("En el mes "+nmes+" se presentaron las menores ventas");
		i=compania1.arribaPromedio();
		System.out.println("Hay "+i+" meses arriba del promedio");
		monto=compania1.totalVentas();
		System.out.println("El total de las ventas es "+monto);

	}//main

}