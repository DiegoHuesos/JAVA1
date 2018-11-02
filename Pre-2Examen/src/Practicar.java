import java.util.*;
public class Practicar {
	
	public static void imprimeArreglo(int a[]){
		int n= a.length;
		int i;
		 for(i=0; i<n;i++)
			 System.out.print(a[i]+" ");
		 System.out.println("");
		 }
	
	public static boolean igualesTradicionales( int[] arr1, int[] arr2){
		boolean resp=false;
		int i=0;
		while(i<arr1.length && arr1[i]==arr2[i])
			i++;
		if(i==arr1.length)
			resp=true;
		return resp;
	}
	
	public static boolean igualesCircularmente(int[] arr1, int[] arr2){
		boolean resp=false;
		int i=0, k=0, a=0;
		while(i<arr1.length &&  arr1[0] != arr2[i])
			i++;
		if(i<arr1.length){
			k=i;
			a=0;
			while(k<arr1.length && arr1[a]==arr2[k]){
				a++;
				k++;
			}
			if(k==arr1.length){
				k=0;
				while(a<arr1.length && arr1[a]==arr2[k]){
					a++;
					k++;
				}
				if(a==arr1.length)
					resp=true;
			}
				
		}
		return resp;
	}
	
	
	public static int agregaDatos(int[] arr1, int ocupados, ArrayList<Integer> lista){
		int e=0;
		int dato=lista.get(e);
		for(int i=0; i<ocupados;i++){
			e=i;
			
			while(e<ocupados && arr1[e]<dato){
				e++;
				
			}
			if(e<ocupados){
				for(int k=ocupados-1; k>0; k--)
					arr1[k]=arr1[k-1];
				arr1[e]=dato;
				ocupados++;
			}
				
		}
		return ocupados;
	}
	
//MAIN-->EJECUTABLE:
	public static void main(String[]args){
		
		int [] arr1={5,6,1,2};
		int[] arr2={1,2,5,6};
		
		System.out.println(Practicar.igualesTradicionales(arr1, arr2));
		System.out.println(Practicar.igualesCircularmente(arr1, arr2));
		
		int[] arr3={20, 24, 26, 31, 44, 0, 0, 0, 0};
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(25);
		lista.add(32);
		
		System.out.println(Practicar.agregaDatos(arr3, 5, lista));
		
		Practicar.imprimeArreglo(arr3);
		
	}

}
