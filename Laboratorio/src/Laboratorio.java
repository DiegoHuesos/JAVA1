import java.util.*;
public class Laboratorio {
	
	public static void imprimeArreglo(int a[]){
		int n= a.length;
		int i;
		 for(i=0; i<n;i++)
			 System.out.print(a[i]+" ");
		 System.out.println("");
		 }
	
	public static void imprimeLista(ArrayList<Integer> a){
		int n= a.size();
		int i;
		 for(i=0; i<n;i++)
			 System.out.print(a.get(i)+" ");
		 System.out.println("");
		 }
	
	public static ArrayList <Integer> unionArreglos(int[] arr1, int[] arr2){
		ArrayList <Integer> lista;
		
		lista= new ArrayList<Integer>();
		
		/*for(int i=0; i<arr1.length;i++){
			int j=0;
			while(j<arr2.length && arr2[j]!=arr1[i])
				j++;
			if(j==arr2.length)
				lista.add(arr1[i]);
		}
		
		for(int k=0; k<arr2.length;k++)
			lista.add(arr2[k]);*/
		int l = arr1.length;
		if (arr2.length<arr1.length)
			l= arr2.length;
		System.out.println(l);
		
		for (int i =0; i < l;i++){
			if(!lista.contains(arr1[i]))
				lista.add(arr1[i]);
			if (!lista.contains(arr2[i]))
				lista.add(arr2[i]);
		}
		
		if (l==arr1.length){
			l= arr2.length-l;
			for (int i = arr2.length-1; i >= l; i--)
				if(!lista.contains(arr2[i]))
					lista.add(arr2[i]);
		} else {
			l= arr1.length-l;
			for (int i = arr1.length-1; i >= l; i--)
				if(!lista.contains(arr1[i]))
					lista.add(arr1[i]);
		}

		return lista;
	}
	
	public static int[] eliminaRepetidos(int[] arr, int ocupados){
		
		for(int i=0; i<ocupados;i++){
			for(int j=i+1; j<ocupados; j++){
				if(arr[i]==arr[j]){
					for(int k=j; k<ocupados-1;k++)
						arr[k]=arr[k+1];
				}
				j--;
				ocupados--;
			}
		}
		return arr;
		
	}
	
//Main:
	public static void main(String[] args) {
		int[] a1={1, 2, 3, 4, 4, 4, 1, 9};
		int[] a2={5, 8, 7, 3, 2};
		
		Laboratorio.imprimeArreglo(a1);
		System.out.println("");
		Laboratorio.imprimeArreglo(a2);
		System.out.println("");
		Laboratorio.imprimeLista(Laboratorio.unionArreglos(a1, a2));
		
		
		
		
		
	}

}
