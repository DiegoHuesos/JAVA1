import java.util.ArrayList;
public class SumaBorra {
	
	public static double sumaBorraLista(ArrayList<Double> lista){
		double suma=0;
		for(int i=lista.size()-1; i>=0; i--){
			suma+=lista.get(i);
			lista.remove(i);
		}
		return suma;
	}
	
	
	public static void main (String[]args){
		ArrayList<Double> lista= new ArrayList<Double>();
		lista.add(5.5);
		lista.add(4.0);
		lista.add(4.5);
		lista.add(2.0);
		System.out.println(lista.toString());
		System.out.println(SumaBorra.sumaBorraLista(lista));
		System.out.println(lista.toString());
	}
}
