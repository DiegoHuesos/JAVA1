import java.util.*;
public class Acomoda {
	
	public static void main(String[] args){
	
	Scanner lectura= new Scanner(System.in);
	
	System.out.println("Introduce el numero (n) de columnas:");
	int numColumn=lectura.nextInt();
	int cubos [] = new int [numColumn];
	
	

	for ( int i=0; i<numColumn; i++){
	
	System.out.println("Introduce el numero de cubos de la "+ (i+1)+"a columna:");
		cubos[i]=lectura.nextInt();
	}//cierre del for
	System.out.print("\n \n");
	
	ordenaAsc (cubos);
	
	System.out.print("El nuevo acomodo de cubos es: ");
	for ( int i=0 ; i<cubos.length ; i++){
		System.out.print(cubos[i]+" ");
	}

		
	
	}

	
	static void ordenaAsc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;}
	
	
	}//cierre del ejecutable
	
	

}
}//cierre de clase