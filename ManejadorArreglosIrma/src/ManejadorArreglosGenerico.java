
public class ManejadorArreglosGenerico {
	
	public static <T extends Comparable <T>> int posMenor(T[]arr, int n){
		int min=0;
		for(int i=1; i<n; i++)
			if(arr[min].compareTo(arr[i]) > 0)
				min=i;
		return min;
	}
	/*
	public static <T extends Comparable<T>> int posMayor(T[] arr, int n){
		int mayor=0;
		for(int i=1; i<n; i++)
			
	}
	*/
}
