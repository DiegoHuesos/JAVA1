import java.util.*;

public class Repaso {
	int a[], b[];
	
	 public static ArrayList<Integer> unionArreglos(int a[], int b[]){
			ArrayList<Integer> c; 
			int n, i;
			
			c=new ArrayList<Integer>();
			
			for(i=0;i<a.length;i++){
				c.add(a[i]);
			}
			for(i=0;i<b.length;i++){
				if(!c.contains(b[i]))
					c.add(b[i]);
			}
			return c;
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
		 }
		 
		 public static boolean esCapicua(int a[]){
			 int i;
			 boolean resp;
			 
			 for(i=0;i<a.length-1;i++)
				 if(a[i]==a[a.length-1-i]);
			 if(i==a.length-1)
				 resp=true;
			 else
				 resp=false;
			 return resp;
		 }


public static void main(String[] Args){

	 Scanner lectura;
	  int n, i, m;
	  int a[], b[];
 
	  lectura=new Scanner(System.in);
	  
	  System.out.println("Dame el numero de elementos del arreglo [a] >: ");
	  n=lectura.nextInt();
	  a=new int[n];
	  
	  leeArreglo(a,n);
	  imprimeArreglo(a,n);
	  
	  System.out.println();
	  
	  
	  System.out.println("Dame el numero de elementos del arreglo [b] >: ");
	  m=lectura.nextInt();
	  b=new int[m];
	  
	  leeArreglo(b,m);
	  imprimeArreglo(b,m);
	  
	  System.out.println();
	
	  ArrayList<Integer> c= unionArreglos(a,b);
	  
	  System.out.println();
	  System.out.print(c.toString());
	  System.out.println();
	  
	  System.out.print("\n \nEl numero de elementos de < c > es: "+c.size());
	  
	  boolean resp=esCapicua(a);
	  if(resp==true){
		  System.out.println("\nEl arreglo [a] es capicua:");
		  imprimeArreglo(a, a.length);
	  }
	  else {
		  System.out.println("\nEl arreglo [a] no es capicua:  ");
		  imprimeArreglo(a, a.length);
	  }

	}
}