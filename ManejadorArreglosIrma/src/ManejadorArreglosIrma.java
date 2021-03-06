import java.util.ArrayList;
import java.util.Scanner;
public class ManejadorArreglosIrma {
	
	public static void leeArrgeglo(double[] arr, int numMaximo){
		Scanner lectura=new Scanner(System.in);
		
		for(int i=0; i<numMaximo; i++){
			System.out.println("Dame el valor para la posición "+i+":");
			arr[i]=lectura.nextDouble();
		}
		System.out.println("¡Listo");
	}
		
	public static void imprimeArreglo(double a[]){
		int n= a.length;
		int i;
		 for(i=0; i<n;i++)
			 System.out.print(a[i]+" ");
		 System.out.println("");
		 }
	
	public static void imprimeArregloInt(int a[]){
		int n= a.length;
		int i;
		 for(i=0; i<n;i++)
			 System.out.print(a[i]+" ");
		 System.out.println("");
		 }
	
	public static double sumaArreglo(double[] arr, int n ){
		double suma=0;
		for(int i=0; i<n; i++)
			suma=suma+arr[i];
		return suma;
	}
	
	public static double promedioArreglo(double a[], int n){
		 double suma, promedio;
		 suma=sumaArreglo(a, n);
		 promedio=suma/n;
		 return promedio; 
		 }
	
	public static int posMaximo(double a[], int n, int inicio ){
		 int mayor;
		 mayor=inicio;
		 for(int i=0;i<n;i++){
			 if(a[mayor]<a[i])
				 mayor=i;
		 }
		   return mayor;
		 }
	
	/*Pos maximo no generalizado:
 	public static int mayorArreglo(double a[], int n){
			int i, mayor;
			mayor=0;
			
			for(i=1;i<n;i++)
				if(a[mayor]<a[i])
				mayor=i;
			return mayor;
		}
 */
	
	public static int posMinimo(double a[], int n, int inicio){  
	   	  int min;
		  min=inicio;
		  for(int i=inicio+1;i<n;i++)
			  if(a[min]>a[i])
				  min=i;
		   return min;
		  }
	
	/*
	 public static int posMinimo(double a[], int n, int inicio){
  		int min;
  		min=inicio;
  		
  		for(int i=inicio+1;i<n;i++)
   			if(a[min]>a[i])
    			min=i;
    			
   		return min;
  	 }
  */
	
	public static int cuantosMayor(double[] arr, int n, double x){
		int cant=0;
		
		for(int i=0; i<n; i++)
			if(arr[i]>x)
				cant++;
		return cant;
	}
	
	public static void correDerechaDejandoCeros(double[] arr, int n, int k){
		
		for(int i=0; i<=k; i++){
			for(int j=n-1; j>0; j--)
				arr[j]=arr[j-1];
			arr[0]=0;
		}
	}
	
	/*No generalizado:
	 * correDerechaDejandoCeros sólo para recorrerlo una vez:
	 public static void recorrerArregloDer(double a[], int n){
	 	int i;
	 	for(i=0;i<(n-1);i++)
			a[n-1-i]=a[n-2-i];
	 
	 	a[0]=0;
 	}
	 */

	public static void correDerecha(double[] arr, int n, int k){
		for(int i=1; i<=k; i++){
			double aux= arr[n-1];
			for(int j=n-1; j>0; j--)
				arr[j]=arr[j-1];
			arr[0]=aux;
		}
	}
	
	public static void correIzquierdaDejandoCeros(double[] arr, int n, int k){
		
		for(int i=1; i<=k; i++){
			for(int j=0; j<n-1; j++)
				arr[j]=arr[j+1];
			
			arr[n-1]=0;
		}
	}
	
	public static void correIzquierda(double[] arr, int n, int k){
		
		for(int i=1; i<=k; i++){
			double aux=arr[0];
			for(int j=0; j<n-1; j++)
				arr[j]=arr[j+1];
			
			arr[n-1]=aux;
		}
	}
	
	//Invertir arreglos:
	public static void invertirArreglo (double a[], int n){
		 int i;
		 double b = 0;
		 for (i=0;i<(n/2);i++){
			 b= a[i];
			 a[i]=a[n-1-i];
			 a[n-1-i]=b; 	
		 }
	 }
	 
	//Intercambio de elementos
	public static void swap(double[] arr, int posX, int posY){
		double aux;
		aux= arr[posX];
		arr[posX]= arr[posY];
		arr[posY]=aux;
	}
	
	
	
	//Ordenamiento por selección directa
	public static void seleccionDirecta(double[]arr, int seldasOcupadas){
		int min;
		for(int i=0; i<seldasOcupadas-1; i++){
			min= ManejadorArreglosIrma.posMinimo(arr, seldasOcupadas,i);
			ManejadorArreglosIrma.swap(arr, min, i);
		}
	}
	
	//Busqueda secuencial ordenada
	public static int buscaSecuencialOrdenada(double[] arr, int n, double x){
		int i=0;
		int pos=0;
		
		while(i<n && arr[i]<x)
			i++;
		
		pos=i;
		
		if(i>=n || arr[i]!=x)
			pos=-(i-1);
		
		return pos;
	}
	
	//Busqueda secuencial desordenada
	public static int buscaSecuencialDesordenada(double[]arr, int n, double x){
		int i=0;
		int pos;
		
		while(i<n && arr[i]!=x)
			i++;
		
		pos=i;
		
		if(i==n)
			pos=-1;
		
		return pos;
	}
	
	//Busqueda binaria:
	public static int buscaBinaria(double[]arr, int n, double x){
		int pos;
		int inicio=0;
		int fin=n-1;
		
		int mitad=(inicio+fin)/2;
		
		while(inicio<=fin && arr[mitad]!=x){
			if(x<arr[mitad])
				fin=mitad-1;
			else
				inicio=mitad+1;
			mitad=(inicio+fin)/2;
		}
		
		if(inicio > fin)
			pos= -(inicio-1);
		else
			pos = mitad;
		
		return pos;
	}
	
	//Elimina repetidos:
	public static int eliminaRepetidosOrd(int[]arr, int ocupados){
		
		
		for(int i=0; i<ocupados; i++){
			
			int j=i+1;
			
			while(j<ocupados){
				
				if(arr[i]==arr[j]){
					
					for(int e=j; e<ocupados-1;e++)
						arr[e]=arr[e+1];
					
					arr[ocupados-1]=0;	
					ocupados--;
				}
				j++;
			 }
		 }
		return ocupados;
	}

	public static int eliminaRepetidosSinOrd(int[]arr, int ocupados){
		int i=0;
		
		while(i<ocupados){
			int j=i+1;
			while( j<ocupados){
				if(arr[i]==arr[j]){
					for(int k=j; k<ocupados-1;k++)
						arr[k]=arr[k+1];
					arr[ocupados-1]=0;
					ocupados--;
					j--;	
				}
				j++;
			}
			i++;
		}
		return ocupados;
	}
	
	//Elimina dato dado en arreglo ordenado:
	public static int eliminaDatoArrOrdDouble(double[] arr, int ocup, double dato){
		
		
		for(int i=0; i<ocup; i++){
			if(arr[i]==dato)
				arr[i]=0;
		}
		for(int e=0; e<ocup; e++){
			if(arr[e]==0){
				for(int a=e; a<ocup-1; a++)
					arr[a]=arr[a+1];
				arr[ocup-1]=0;
				ocup--;
			}
		}
		
		return ocup;	
	}
	
	//Elimina arreglo a):
	public static void eliminaArreglo(int a[]){
		 int i;
		 int n=a.length;
		 a[n-1]=0;
		 for(i=0;i<n-1;i++){
			 a[n-2-i]=a[n-1-i];
		 }
		 
	 }
	
	//Elimina arreglo b):
	public static void eliminaArreglo1(int a[], int n){
		 int i;
		 a[n-1]=0;
		 for(i=0;i<n-1;i++){
			 a[n-2-i]=a[n-1-i];
		 }
		 
	 }
	
	public static ArrayList<Double> cualesSonMayores(double[] arr, int n, double x ){
		ArrayList <Double> resp= new ArrayList<Double>();
		
		for(int i=0; i<n; i++)
			if(arr[i] > x)
				resp.add(arr[i]);
		
		return resp;
	}
	
}
