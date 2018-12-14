import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class leeArchivo {
	
	public static int gengen(String nameFile){
		String[] words;
		int[] veces;
		String linea;
		
		int a=0;
		
		File archivo= new File("textoco.txt");
		try(Scanner lectura=new Scanner (archivo)){
			ArrayList <String> aux= new ArrayList<String>();
			ArrayList <String> auxNoRep= new ArrayList<String>();
			while(lectura.hasNext()){
				String var= lectura.next();
				aux.add(var);
				if(!auxNoRep.contains(var))
					auxNoRep.add(var);
			}
			a=auxNoRep.size();
			words=new String[auxNoRep.size()];
			veces=new int[auxNoRep.size()];
			
			for(int i=0; i<auxNoRep.size(); i++)
				words[i]=auxNoRep.get(i);
			
			for(int i=0; i< words.length; i++){
				for(int j=0; j<aux.size(); j++){
					if(words[i].equals(aux.get(j)))
						veces[i]++;
				}
			}
			System.out.println(leeArchivo.arrStringToString(words));
			System.out.println(leeArchivo.arrIntToString(veces));
			lectura.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return a;
	}
	
	public static String arrIntToString(int[] arr){
		String resp="";
		for(int i=0; i<arr.length; i++)
			resp+=arr[i]+" ";
		return resp;
	}
	public static String arrStringToString(String[] arr){
		String resp="";
		for(int i=0; i<arr.length; i++)
			resp+=arr[i]+" ";
		return resp;
	}
	
	public static void main (String[]args){
		System.out.println(leeArchivo.gengen("textoco.txt"));
	}
}
