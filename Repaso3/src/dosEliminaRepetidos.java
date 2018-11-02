import java.util.Scanner;

public class dosEliminaRepetidos {
	
	public static void eliminaRepetidos(int a[], int n){
		int i, g, j, ocupados;
		ocupados=n;

		for(i=0;i<ocupados;i++){
			g=i+1;
			while(g<ocupados){
				if(a[i]==a[g]){
					for(j=g;j<ocupados-1;j++){
						a[j]=a[j+1];}
					a[ocupados-1]=0;
					ocupados--;
				}
				g++;
			}
		}
	}
	
	
	 public static void eliminaArreglo(int a[]){
		 int i;
		 int n=a.length;
		 a[n-1]=0;
		 for(i=0;i<n-1;i++){
			 a[n-2-i]=a[n-1-i];
		 }
		 
	 }
	
	 public static void leeArreglo(int a[], int n){
		  int i;
		  Scanner lectura;
		  
		  lectura=new Scanner(System.in);
		  for(i=0;i<n;i++){
		   System.out.print("Dame el elemento "+(i+1)+": ");
		   a[i]=lectura.nextInt();
		  } 
		 }
		 
		 public static void imprimeArreglo(int a[], int n){
		  int i;
		  for(i=0; i<n;i++)
		   System.out.print(a[i]+" ");
		  System.out.println();
		 }
		 
	public static void main(String[] args) {
		  Scanner lectura;
		  int n, i;
		  int a[];

		  
		  lectura=new Scanner(System.in);
		  System.out.println("Dame el numero de elementos del arreglo: ");
		  n=lectura.nextInt();

		  a=new int[n];
		  
		  leeArreglo(a,n);
		  
		  imprimeArreglo(a,n);
		  
		  eliminaRepetidos(a,n);
		  
		  imprimeArreglo(a,n);
		  
		  eliminaArreglo(a);
		  
		  imprimeArreglo(a,n);
		  
	}
}