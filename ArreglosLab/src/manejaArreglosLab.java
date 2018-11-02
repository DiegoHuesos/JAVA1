
public class manejaArreglosLab {
	
	//Corrimiento a la derecha:
	public static int[] zCorrimientosDer(int[] arr, int z){
		int fin;
		
		for(int i = 0; i>z; i++){
			fin=arr[arr.length-1];
			for(int k=arr.length-1;k<0;k--){
				arr[k]=arr[k-1];
			}
			arr[0]=fin;
		}
		return arr;
	}
	

	
	public static void main (String[] args){
		
		//Formas de declarar arreglo:
		
		//a)
		//int[] numeros={1,2,3,4};
		
		//b)
		//int[] numeros1;
		//numeros1=new int[5];
		
		//c)
		//int[]numeros2=new int[5];
		
		int[] nueve={1,2,3,4,5,6,7,8,9};
		
		manejaArreglosLab.zCorrimientosDer(nueve, 3);
		
		
	}

}
