
import java.util.Scanner;
public class EjecutableManejadorArreglosIrma {
	
	private final static int MAXIMO=10;
	
	public static void main(String[]args){
		Scanner lectura= new Scanner(System.in);
		double[] arr= new double[MAXIMO];
		double[] arr2={6.1, 3.4, 5.7, 1.3};
		int[] arr3={1,5,1,5,5,1,0,0};
		int cantNum;
		double suma;
		
		
		/*System.out.println(arr2[0]);
		System.out.println(arr[6]);
		
		System.out.println("¿Cuantos numeros deseas meter en tu arreglo? "+"  (Máximo permitido: "+MAXIMO+")");
		cantNum= lectura.nextInt();
		
		System.out.println("Dame los "+cantNum+" numeros:");
		for(int i=0; i<cantNum; i++)
			arr[i]= lectura.nextDouble();
		suma=ManejadorArreglosIrma.sumaArreglo(arr, cantNum);
		System.out.println(suma);
		*/
		
		
		System.out.println("Imprime arreglo: ");
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Suma arreglo: ");
		System.out.println(ManejadorArreglosIrma.sumaArreglo(arr2, 4));
		
		System.out.println("Promedio arreglo: ");
		System.out.println(ManejadorArreglosIrma.promedioArreglo(arr2, 4));
		
		System.out.println("Posición del mayor elemento del arreglo: ");
		System.out.println(ManejadorArreglosIrma.posMaximo(arr2, arr2.length, 0));
		System.out.println("Valor del mayor elemento del arreglo: ");
		System.out.println(arr2[ManejadorArreglosIrma.posMaximo(arr2, arr2.length, 0)]);
		
		System.out.println("Posición del menor elemento del arreglo: ");
		System.out.println(ManejadorArreglosIrma.posMinimo(arr2, arr2.length, 0));
		System.out.println("Valor menor elemento del arreglo: ");
		System.out.println(arr2[ManejadorArreglosIrma.posMinimo(arr2, arr2.length, 0)]);
		
		System.out.println("¿Cuántos números mayores al valor dado (4) hay en el arrreglo? ");
		System.out.println(ManejadorArreglosIrma.cuantosMayor(arr2, 4, 4));
		
		
		
		System.out.println("Invierte arreglo: ");
		ManejadorArreglosIrma.invertirArreglo(arr2, arr2.length);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Intercambia (swap) el elemento de la pos. 0 con 3: ");
		ManejadorArreglosIrma.swap(arr2, 0, 3);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Busca (secuencial desordenada) la posición del elemento '3.4':");
		System.out.println(ManejadorArreglosIrma.buscaSecuencialDesordenada(arr2, arr2.length, 3.4));
		
		System.out.println("Ordenamiento de seleccion directa: ");
		ManejadorArreglosIrma.seleccionDirecta(arr2, 4);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Busca (secuencial ordenada) la posición del elemento '3.4':");
		System.out.println(ManejadorArreglosIrma.buscaSecuencialOrdenada(arr2, arr2.length, 3.4));
		
		System.out.println("Busca (binaria) la posición del elemento '3.4':");
		System.out.println(ManejadorArreglosIrma.buscaBinaria(arr2, arr2.length, 3.4));
		
		System.out.println("Recorre derecha sin dejar ceros: ");
		ManejadorArreglosIrma.correDerecha(arr2, 4, 2);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Recorre izquierda sin dejar ceros: ");
		ManejadorArreglosIrma.correIzquierda(arr2, 4, 2);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Recorre derecha dejando ceros: ");
		ManejadorArreglosIrma.correDerechaDejandoCeros(arr2, 4, 2);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		System.out.println("Recorre izquierda dejando ceros: ");
		ManejadorArreglosIrma.correIzquierdaDejandoCeros(arr2,2, 2);
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		
		
		System.out.println("Arreglo3: ");
		ManejadorArreglosIrma.imprimeArregloInt(arr3);;
		System.out.println("Elimina repetidos: "+"(ahora ocupdos: "+ManejadorArreglosIrma.eliminaRepetidosSinOrd(arr3, 6)+")");
		ManejadorArreglosIrma.imprimeArregloInt(arr3);
		System.out.println("");
		
		System.out.println("Arreglo2: ");
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		System.out.println("Elimina dato dado(3.4): "+"(ahora ocupados: "+ManejadorArreglosIrma.eliminaDatoArrOrdDouble(arr2, 4, 3.4)+")");
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		System.out.println("");
		
		System.out.println("Arreglo2: ");
		ManejadorArreglosIrma.imprimeArreglo(arr2);
		System.out.println("Cuáles son mayores al valor dado (4) en el arreglo 2;");
		System.out.println(ManejadorArreglosIrma.cualesSonMayores(arr2, 3, 4.0));
	}
	
}
