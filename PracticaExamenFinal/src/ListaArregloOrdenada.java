import java.util.ArrayList;
public class ListaArregloOrdenada<T>{
	ArrayList<T> lista;
	public <T extends Comparable<T>> boolean equals (ArrayList <T> otra){
		boolean resp= false;
		if(lista.equals(otra))
			resp=true;
		return resp;
	}
	
}
