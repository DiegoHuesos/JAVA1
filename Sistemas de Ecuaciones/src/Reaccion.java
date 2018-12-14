/**LIBRERIAS IMPORTADAS:
 * MatrixOps: para poder resolver el sistema de ecuaciones a partir de una matriz.
 * ArrayList: para poder crear listas.
 */
import com.berkeleychurchill.chembal.MatrixOps;
import java.util.ArrayList;

/**
 * @author Diego Hernández Delgado
 * Clave única: 176262
 * Fecha de entrega: 05/12/2018
 * Proyecto Final AyPI: MyChemestry 
 */


/**CLASE REACCION*/
public class Reaccion {
	/**ATRIBUTOS DE LA CLASE REACCION:*/
	String strReaccion;
	ArrayList <String>listaElementos;
	String[] arrCompuestos;
	double[] arrCoeficientes;
	double [][] matriz;
	int[][] matSol;
	ArrayList<Integer> coefReactivosSolucion;
	ArrayList<Integer> coefProductosSolucion;
	String reaccionBalanceada="";
	
	/**CONSTRUCTOR DE LA CLASE REACCION
	 * @param String strReaccionDada
	 */
	public Reaccion(String strReaccionDada){
		strReaccion=strReaccionDada.replace(" ", "")+" ";
		this.crearListaElementos();
		this.crearArregloCompuestos();
		this.crearArregloCoeficientes();
		this.crearMatriz();
		this.balancear();
		this.solucionToString();
	}
	
	/**FUNCIÓN CREAR-LISTA-ELEMENTOS:*/
	public void crearListaElementos(){
		listaElementos=new ArrayList<String>();
		
		for(int i=0; i< strReaccion.length(); i++){
			char a= strReaccion.charAt(i);
			
			if(a>='A' && a<='Z' && strReaccion.charAt(i+1)>='a' && strReaccion.charAt(i+1)<='z' && !listaElementos.contains(strReaccion.substring(i,i+2)))
				listaElementos.add(strReaccion.substring(i, i+2));
			else
				if(a>='A' && a<='Z' && !listaElementos.contains(strReaccion.substring(i, i+1)))
						listaElementos.add(strReaccion.substring(i, i+1));
		}	
	}
	
	/**FUNCIÓN CREAR-ARREGLO-COMPUESTOS:*/
	public void crearArregloCompuestos(){
		arrCompuestos=strReaccion.replace("=", ":").replace("+", ":").split(":");
		for(int i=0; i<arrCompuestos.length; i++)
			arrCompuestos[i]+=" ";
	}
	
	/**FUNCIÓN ARREGLO COEFICIENTES:*/
	public void crearArregloCoeficientes(){
		arrCoeficientes= new double[arrCompuestos.length];
		for(int w=0; w< arrCompuestos.length;w++){
			if(arrCompuestos[w].charAt(0) >= '0' && arrCompuestos[w].charAt(0) <='9'){
				int pos=1;
				while(arrCompuestos[w].charAt(pos) >= '0' && arrCompuestos[w].charAt(pos) <='9'){
					pos++;
				}
				arrCoeficientes[w]=Double.parseDouble(arrCompuestos[w].substring(0,pos));
				arrCompuestos[w]= arrCompuestos[w].replaceAll(arrCompuestos[w].substring(0, pos), "");
			}
			else
				arrCoeficientes[w]=1;
		}
	}
	
	/**FUCNIÓN CREAR-MATRIZ:*/
	public void crearMatriz(){
			matriz= new double[listaElementos.size()][arrCompuestos.length];
			for(int j=0; j<listaElementos.size(); j++){
				for(int e=0; e<arrCompuestos.length; e++){
					if(arrCompuestos[e].contains(listaElementos.get(j)) ){
						//OBTENCIÓN DEL SUBINDICE
						double subIndice=0;
						int pos= arrCompuestos[e].lastIndexOf(listaElementos.get(j));
						if(pos < arrCompuestos[e].length()-1){
							int posI=pos+ 1;
							int posF=posI;
							while(posF < arrCompuestos[e].length() && arrCompuestos[e].charAt(posF) >='0' && arrCompuestos[e].charAt(posF) <='9' && arrCompuestos[e].charAt(posI) >='0' && arrCompuestos[e].charAt(posI) <='9'){
								posF++;
							}
							if(posI==posF)
								subIndice=1;
							else
								subIndice=Double.parseDouble(arrCompuestos[e].substring(posI, posF));
						}
						if(pos == arrCompuestos[e].length()-1)
							subIndice=1;
							matriz[j][e]=subIndice*arrCoeficientes[e];
					}	
				}
			}
	}
	
	/**FUNCIÓN BALANCEAR*/
	public void balancear(){
		matSol= MatrixOps.solveDependentSystem(matriz);
		coefReactivosSolucion=new ArrayList<Integer>();
		coefProductosSolucion=new ArrayList<Integer>();
		for(int i=0; i<matSol.length; i++){
			if(matSol[i][0]>0)
				coefReactivosSolucion.add((int)matSol[i][0]);
			else
				coefProductosSolucion.add((int)matSol[i][0]*-1);			
		}
	}
	
	/**REACCION RESUELTA TO STRING
	*FUNCIÓN SOLUCION-STRING:*/
	public void solucionToString(){
		int a=0;
		for(int i=0; i<coefReactivosSolucion.size(); i++){
			reaccionBalanceada+= coefReactivosSolucion.get(i)+" "+arrCompuestos[i];
			if(i<coefReactivosSolucion.size()-1)
				reaccionBalanceada+="  +  ";
			a=i;
		}
		reaccionBalanceada+=" -->  ";
		for(int j=0; j<coefProductosSolucion.size(); j++){
			reaccionBalanceada+= coefProductosSolucion.get(j)+" "+arrCompuestos[a];
			if(j<coefProductosSolucion.size()-1)
				reaccionBalanceada+="  +  ";
			a++;
		}
	}
	
	/**FUNCIONES GETTERS:*/
	public ArrayList<String> getListaElementos(){
		return this.listaElementos;
	}
	public String[] getArrCompuestos(){
		return this.arrCompuestos;
	}
	public double[] getArrCoeficientes(){
		return this.arrCoeficientes;
	}
	public double[][] getMatriz(){
		return this.matriz;
	}
	public String getReaccionBalanceada(){
		return this.reaccionBalanceada;
	}
	
	
	/**FUNCIONES TO-STRING PARA VERIFICAR LOS RESULTADOS EN LOS TESTS:*/
	public <T>String arrToString(T[]arr){
		String resp="";
		for(int i=0; i<arr.length;i++)
			resp+=arr[i]+" ";
		return resp;
	}
	public String arrToStringDouble(double [] arr){
		String resp="";
		for(int i=0; i<arr.length;i++)
			resp+=arr[i]+" ";
		return resp;
	}
	public String arrToStringInt(int [] arr){
		String resp="";
		for(int i=0; i<arr.length;i++)
			resp+=arr[i]+" ";
		return resp;
	}
	public String toStringMatriz(double[][] m){
		String s="";
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length; j++)
				s+=m[i][j]+" ";
			s+="\n";
		}
		return s;
	}
	public String toStringMatriz(int[][] m){
		String s="";
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length; j++)
				s+=m[i][j]+" ";
			s+="\n";
		}
		return s;
	}
	
	
/**MAIN-CLASS: EJECUTABLE PARA TEST (PRUEBA):*/
	public static void main (String[] args){
		Reaccion r1= new Reaccion("C3H8+O2=CO2+H2O");
		System.out.println("C3H8+O2 -->CO2+H2O");
		System.out.println(r1.getListaElementos()+"\n");
		System.out.println(r1.arrToString(r1.getArrCompuestos())+"\n");
		System.out.println(r1.arrToStringDouble(r1.getArrCoeficientes())+"\n");
		System.out.println(r1.toStringMatriz(r1.getMatriz())+"\n");
		int [][]res= MatrixOps.solveDependentSystem(r1.getMatriz());
		System.out.println(r1.toStringMatriz(res)+"\n");
		System.out.println(res.length+" "+res[0].length);
		r1.balancear();
		System.out.println("\n\n"+r1.getReaccionBalanceada());
	}
	
}
