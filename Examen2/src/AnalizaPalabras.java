/*
 * Diego Hernandez Delgado
 * 176262
 * Examen
 */
import java.util.*;
public class AnalizaPalabras {
	
	public static ArrayList<String> palabrasConEstasLetras(String[] palabras, char[] letras){
		ArrayList<String> resp= new ArrayList<String>();
		
		
		for(int i=0; i<letras.length; i++) {
			
			for(int e=0; e<palabras.length;e++) {
				
				if( letras[i] ==palabras[e].toLowerCase().charAt(0)  ) 
					resp.add(palabras[e]);
				
			}
			
			
		}
		return resp;
		
		
		
	}
	

	public static void main (String[]args) {
		String [] arregloPalabras= {"Hola", "examen", "Algoritmos", "facil", "divertido"};
		char[] arregloCaracteres= { 'e', 'm', 'h', 'a'};
		
		System.out.println(AnalizaPalabras.palabrasConEstasLetras(arregloPalabras, arregloCaracteres).toString());
	}

}
