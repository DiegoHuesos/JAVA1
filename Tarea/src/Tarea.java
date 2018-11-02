public class Tarea {
	public static void ordenaAscendente(int a[], int n){
		int min, aux;
		for(int i=0;i<n-1;i++){//comparara cada numero del array, hasta -1 porque debe llegar a la penultima casilla unicamente
			min=i;
			for (int j=i+1;j<n;j++){//compara el numero del array en turno con los que hay de el en adelante
				if (a[j]<a[min])//si es menor guarda su posicion
					min=j;
			}
			aux=a[i];//reemplaza la casilla 1 con el menor hayado
			a[i]=a[min];
			a[min]=aux;
		}//luego vuelve a iniciar comparando solo los numeros faltantes y buscando el menor de ellos
	}
	
	/*esta busca como lo "hariamos en un diccionario", abres a la moitad y mentalmente revisas en cual de las dos mitades
	 * esta el valor que buscas. Esa seccion la partes a la mitad y vuelves a pensar si esta en la primera mitad o la segunda
	 * asi de forma suseciva hasta que encuentras el valor buscado, esta funcion parte de forma continua el arraye n 2
	 * hasta encontrar lo que busca o hasta llegar  a un punto donde ya no hay avance*/
	public static int busquedaOrdenada(int a[], int n, int valor){
		int inicio=0;
		int fin=n-1;
		int mitad=(inicio+fin)/2;
		int posicion;
		while (inicio<=fin && a[mitad]!=valor){
			if (valor<a[mitad])
				fin=mitad-1;//si el valor esta en la primera mitad se mueve el fin a la mitad para cerrar el parametro-1 para no revisar de nuez mitad
			else
				inicio=mitad+1;
			mitad=(inicio+fin)/2;
		}
		if(inicio<=fin)
			posicion=mitad;//te dice el lugar donde esta el valor
		else
			posicion=-(inicio)-1;//vuelve negativo el valor del inicio para decirle al usuario en que posicion deberia estar lo que no econtro
								//-1 porque el algoritmo deja inicio una caja mas adelante
		return posicion;
	}							
	
	public static void imprimeArregloInt(int a[], int n){
		  int i;
		  for(i=0; i<n;i++)
		   System.out.print(a[i]+" ");
		  System.out.println();
		 }
	
	public static void main (String [] args){
		int[] arre=new int[]{5,6,7,4,8};
		
		int posicion=busquedaOrdenada(arre,arre.length,8);
		System.out.println(posicion);
	}

}