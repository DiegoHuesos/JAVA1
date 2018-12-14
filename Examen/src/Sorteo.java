//Diego Hernandez Delgado
//Clave Unica: 1762626
//Fecha:16/11/2018
//Examen 3er Parcial
import java.util.ArrayList;

//CLASE SORTEO:
public class Sorteo{
	private final int REN=12;
	private final int COL=10;
	private int [][]matriz;
	private String nombre;
	
	//A) Constructores:
	public Sorteo() {
		matriz=new int[REN][COL];
	}
	public Sorteo(String nombre) {
		this.nombre=nombre;
		matriz=new int[REN][COL];
	}
	
	//B)
	public boolean actualizarMatriz(int mes, int numGanador) {
		boolean resp=false;
		if( 1<=mes && mes<=12 && numGanador>=0) {
			matriz[mes-1][numGanador]++;
			resp=true;
		}
		return resp;
	}
	
	//C)
	public ArrayList<Integer> noHayanSalido() {
		ArrayList<Integer> noHanSalido= new ArrayList<Integer>();

		for(int i=0; i<10; i++) {
			int j=0;
			while(j<12 && matriz[j][i]==0 ) 
				j++;
			if(j==12)
				noHanSalido.add(i);	
		}
		
		return noHanSalido;
	}
	
	//*GetMatriz:
	public int[][] getMatriz(){
		return matriz;
	}
	
	//*Imprime matriz:
	public String imprimeMatriz() {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<12; i++) {
			for(int j=0; j<10; j++)
				sb.append(matriz[i][j]+"\t");
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
