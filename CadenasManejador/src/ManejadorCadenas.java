//Diego Hernandez Delgado
//Clave unica: 176262
//Tarea: Cadena de caracteres y archivos de texto
//Fecha: 05-11-2018

import java.util.Scanner;
import java.io.*;
import java.text.Normalizer;



public class ManejadorCadenas {
	
	//Ejercicio 1.-a) String primero indices pares y luego impares:
	public static String soloPares(String str){
		String newString = "";
		for(int i=0; i<str.length(); i++)
			if(i%2==0)
				newString+= str.charAt(i);
		for(int i=1;i<str.length(); i+=2)
			newString+= str.charAt(i);
		return newString; 
	}
	
	
	//Ejercicio 1.-b) Numero de incidencias de un valor dado en un String:
	public static int numIncidencias(String str, char c){
		int respIncidencias=0;
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i)==c)
				respIncidencias++;
		return respIncidencias;
	}
	
	
	
	//Ejercicio 2.- Elimina las 's' repetidas de un String dado:
	public static String borraS(String str){
		String resp="";
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i) != 's')
				resp+= str.charAt(i);
			else{
				resp+='s';
				i+=2;
			}
		return resp;			
	}
	char c='d';
	
	
	
	//Ejercicio 3.- Lee frases de un archivo de texto y convierte los sustantivos propios en mayúsculas:
	public static String sustantivosPropios(String str){
		String resp="";
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++){
			if(Character.isUpperCase(arr[i].charAt(0))) 
				resp+=arr[i].toUpperCase()+" ";
			else
				resp+=arr[i]+" ";
		}
		return resp;
	}
	
	public static String sustPropDesdeArchivo(File archivo){
		String resp;
		try(Scanner lectura= new Scanner(archivo)){	
			String todasLasFrases="";
			while(lectura.hasNextLine()){
				todasLasFrases+="		"+ManejadorCadenas.sustantivosPropios(lectura.nextLine())+"\n";
			}
			resp = todasLasFrases;
		lectura.close();
		}	
		catch(FileNotFoundException e){
			resp= "Error debido a: "+e.getMessage();
		}
		return resp;
	}
	
	
	
	//Ejercicio 4.- Decodifica una sucesion de a's y b's:
	public static String decodifica(String str){
		String resp="";
		int a=0;
		for(int i=0; i<str.length(); i++)
			if(i%2 ==0){
				a=Character.getNumericValue(str.charAt(i));	
			}
			else
				for(int e=0; e<a; e++)
					resp+= str.charAt(i);
		return resp;
	}
	
	

	//Ejercicio 6.- Palindromo
	public static boolean esPalindromo(String str){
		boolean resp=false;
		String st=str.replace(',',' ').replace('.',' ').replace(':',' ').replace(';',' ').replace('!',' ').replace(" ", "").toLowerCase();
		String stN= Normalizer.normalize(st, Normalizer.Form.NFD);
		String stF= stN.replaceAll("[^\\p{ASCII}]", "");
		
		int i=0;
		int j=stF.length()-1;
		while(i<stF.length()/2 && j>stF.length()/2 && stF.charAt(i)==stF.charAt(j)){
			
			i++;
			j--;
		}
		if(i==j)
			resp=true;
		
		System.out.println("	String procesado:  "+stF);
		return resp;
	}
	
//CLASS MAIN-EJECUTABLE:
	public static void main(String[]args){
		
		//1.- a)
		String cadena="Flor de un dia";
		System.out.println("Ejercicio 1.-a) String primero indices pares y luego impares:"); 
		System.out.println("	String original:   "+cadena);
		System.out.println("	String resultante: "+ManejadorCadenas.soloPares(cadena)+"\n");
		
		//1.- b)
		String cadena2="Tres tristes tigres tragaban trigo en un trigal.";
		System.out.println("Ejercicio 1.-b) Numero de incidencias de un valor dado en un String:");
		System.out.println("	String dado: 'Tres tristes tigres tragaban trigo en un trigal.'");
		System.out.println("	Incidencias de 'r': "+ManejadorCadenas.numIncidencias(cadena2, 'a')+"\n");
		
		//2
		String sss="Yo sssoy un sssalsssero.";
		System.out.println("Ejercicio 2.- Elimina las 's' repetidas de un String dado:");
		System.out.println("	String dado:      "+sss);
		System.out.println("	String resultante:"+ManejadorCadenas.borraS(sss)+"\n");
		
		//3
		File archivo=new File("frases.txt");
		System.out.println("Ejercicio 3.- Lee frases de un archivo de texto y "
				+ "convierte los sustantivos propios en mayúsculas:");
		System.out.println("	Archivo leído: 'frases.txt'");
		System.out.println("	String resultante:\n"+ManejadorCadenas.sustPropDesdeArchivo(archivo));
			
		//4
		String sucesion= "3a4b2a";
		System.out.println("Ejercicio 4.- Decodifica una sucesion de a's y b's:");
		System.out.println("	String sucesion:     "+sucesion);
		System.out.println("	String decodificado: "+ManejadorCadenas.decodifica(sucesion)+"\n");
		
		//6
		String palindromo="Aníta, lÄva!latina.";
		System.out.println("Ejercicio 6.- ¿Es palindromo?");
		System.out.println("	String original:   "+palindromo);
		System.out.println("	Es palindromo:     "+ManejadorCadenas.esPalindromo(palindromo)+"\n");
		
	}

}
