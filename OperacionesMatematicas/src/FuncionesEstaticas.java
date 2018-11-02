/* Diego Hernández Delgado
 * (176262)
 * FuncioneEstaticas
 */
public class FuncionesEstaticas {
	
	public static boolean esteOrdenCreciente(int num1, int num2){
		boolean resp;
		if(num1<num2)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public static String ordenaCreciente(int num1, int num2){
		StringBuilder sb;
		sb=new StringBuilder();
		if(num1<num2)
			sb.append(num1+"-"+num2);
			else
				sb.append(num2+"-"+num1);
		return sb.toString();
	}
	
	public static boolean esImpar(int num1){
		boolean resp;
		if( (num1 % 2) !=0)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public static double sumaNumeros(double num1, double num2){
		double suma;
		suma=num1+num2;
		return suma;
	}
	
	//Ejercicio18
	//Genera la serie ascendente de los primeros n enteros numeros y regresa un String:
	public static String generaSerieAscendente(int n){
		StringBuilder sb;
		sb=new StringBuilder();
		
		for(int i=1; i<=n;i++)
			sb.append(i+" " );
			
		return sb.toString();	
		}
	
	//Ejercicio19
		//Genera la serie descendente de los primeros n enteros numeros y regresa un String:
		public static String generaSerieDescendente(int n){
			StringBuilder sb;
			sb=new StringBuilder();
			
			for(int i=n; i>=1; i--)
				sb.append(i+" " );
				
			return sb.toString();	
			}


}
