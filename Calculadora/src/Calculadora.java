import java.util.ArrayList;

/*Diego Hernandez Delgado
 * Clalculadora estatica:
 */

//Ejercicio 25:
public class Calculadora {
	
	private String marca;
	private int modelo;
	
	
	//Multiplica sumadno:
	public static double multiplica(double n1, int n2){
		double resp;
		resp=0;
		
		for (int i=1; i<=n2; i++)
			resp=resp+n1;
		return resp;
	}
	//Potencia multiplicando:
	public static double potencia(double n1, int n2){
		double resp;
		resp=1;
		for(int i=1; i<=n2; i++){
			resp*=n1;
		}
		return resp;
	}
	
	//Ejercicio 26.-Ullman:
	public static String serieUllman(int n){
		StringBuilder cadena=new StringBuilder();
		cadena.append(n);
		while(n!=1){
			if(n % 2 == 0)
				n=n/2;
			else
				n=n*3+1;
			cadena.append(n+" - ");
		}
		return cadena.toString();
	}
	
	//Ejercicio 26.-Ullman con ArrayList:
		public static ArrayList<Integer> calculaUllman(int n){
			ArrayList<Integer> lista;
			lista=new ArrayList<Integer>();
			lista.add(n);
			while(n!=1){
				if(n % 2 == 0)
					n=n/2;
				else
					n=n*3+1;
				lista.add(n);
			}
			return lista;
		}
	
	
	//Ejercicio 27.-CubosNicomaco:
	public static String generaCubosNicomaco(int n){
		StringBuilder stb= new StringBuilder();
		int cont=1, suma=0;
		
		for (int i=1; i<=n; i++){
			stb.append("El cubo "+i+" es: ");
			for(int k=0; k<i; k++){
				suma=suma+cont;
				stb.append(cont+" + ");
				cont += 2;
			}
			stb.append("="+suma+"\n");
			suma=0;
		}
		return stb.toString();
	}
	
	//Ejercicio 28.-Calcula factorial:
	
	public static int calculaFactorial(int num){
		int fact=1;
		if(num<0)
			fact=-1;
		else
			if(num==0)
				fact=1;
			else
				for(int i=1; i<=num; i++){
					fact*=i;	
				}
		return fact;	
	}
	
	//Ejercicio 29.-Máximo Común Divisor:
	
	public static int calculaMaximoComunDivisor(int m, int n){
		int mcd=0;
		if(m>=n)
			mcd=m%n;
		else
			if(n==0)
				mcd=m;
		return mcd;
	}
	
	//Ejercicio 30.-Genera Serie Fibonacci:
	
	public static int[] calculaFibonacci(int num){
		
		int a, b, c;
		int[] lf=new int[num+1];
		
			if(num==0)
				lf[0]=0;
			else
				if(num==1){
					lf[0]=0;
					lf[1]=1;
				}
				else{
					lf[0]=0;
					lf[1]=1;
					a=0;
					b=1;
					for(int i=1;i<num;i++){
						c=a+b;
						a=b;
						b=c;
						lf[i+1]=c;
					}	
			
				}
		return lf;
	}
	
	/*public static String calculaFibonacci(int num){
		
		int a, b, c;
		StringBuilder sb;
		sb=new StringBuilder();
		
		if(num<0)
			sb.append("No existe.");
		else
			if(num==0)
				sb.append("0");
			else
				if(num==1)
					sb.append("0, 1");
				else{
					sb.append("0, 1");
					a=0;
					b=1;
					for(int i=1;i<=num;i++){
						c=a+b;
						a=b;
						b=c;
						sb.append(", "+c);
					}	
			
				}
		return sb.toString();
	}	
	*/
	
	//Ejercicio 31.-Serie 1:
	public static int calculaSerie1(int n){
		int res=0;
		if(n>=0){
			for(int i=1; i<=n; i++)
				res=res+ (int) (Math.pow(i, i));
		}
		return res;
	}
	
	//Ejercicio 32.- Serie 2:
	public static int calculaSerie2(int n, int numero){
		int res=0;
		int den=3;
		
		if(n>=0){
			for(int i=1; i<=n; i++){
				if(den!=7){
					res=res+(numero/den);
					den=den+2;
				}
				else{
					res=res+(numero/den);
					den=3;	
				}
			}
			
		}
		return res;	
	}
	
	//Ejercicio 33.-Serie 3:
	public static int calculaSerie3(int n){
		int res=0;
		
		for(int i=0; i<=n; i++){
			res=res+ ( (Calculadora.calculaFactorial(n-i)) / (Calculadora.calculaFactorial(i)) );
		}
		return res;
	}
	
	//Ejercicio 34.- Divisible por 11:
	public static boolean esDivisiblePor11(int n){
		StringBuilder sb= new StringBuilder();
		String str= new String();
		
		int length, sumaNon=0, sumaPar=0, result, a, b;
		boolean resp;
		
		
		sb.append(n);
		str=sb.toString();
		
		length=str.length();
		
		for(int i=0; i<length; i++){
			if(  ((i+1) % 2)  !=  0 )
				sumaNon=sumaNon+Character.getNumericValue(str.charAt(i));
				else
					sumaPar=sumaPar+Character.getNumericValue(str.charAt(i));
		}
		result=sumaNon-sumaPar;
		if(result % 11 == 0)
			resp=true;
		else
			resp=false;
		
		return resp;
	}
	
	
	public static String toStringArr(int[]arr){
		StringBuilder sb;
		sb=new StringBuilder();
		
		for(int i=0; i< arr.length; i++){
			sb.append(arr[i]+" ");
		}
		return sb.toString();		
	}
	
	

}
