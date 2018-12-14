/*
 * Diego HD
 * 09/Nov/2018
 */
public class GastosCompania {
	private String nombre;
	private String direccion;
	private double[][] gastos;
	private final int REN = 5;
	private final int COL =3;
	
	public GastosCompania(String nombre, String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		this.gastos= new double [REN][COL];
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public int getREN(){
		return REN;
	}
	public int getCOL(){
		return COL;
	}
	
	public void setNombre(String nuevoNombre){
		this.nombre=nuevoNombre;
	}
	public void setDireccion(String nuevaDireccion){
		this.direccion=nuevaDireccion;
	}
	
	public boolean equals(GastosCompania otra){
		boolean resp=false;
		if(this.nombre.equals(otra.nombre))
				resp=true;
		return resp;
	}
	
	public int compareTo(GastosCompania otra){
		int resp;
		if(this.nombre.compareTo(otra.nombre) > 0)
				resp=1;
		else
			if(this.nombre.compareTo(otra.nombre) < 0)
				resp=-1;
			else
				resp=0;
		return resp;
	}
	
	public String toStringGastos(){
		StringBuilder sb=new StringBuilder();
		sb.append("Compania: "+ nombre+ "\n");
		sb.append("Domicilio: "+ direccion+"\n\n");
		for(int i=0; i<REN; i++){
			for(int j=0; j<COL; j++)
				sb.append(gastos[i][j]+"\t");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public boolean altaGasto( int renglon, int columna, double cant){
		boolean resp=false;
		if(renglon< REN && renglon>=0  &&  columna<COL && columna>=0 ){
			gastos[renglon][columna]= cant;
			resp=true;
			}
			return resp;
		}
	public double sumaGastos(int dia){
		double sumaDia;
		sumaDia= ManejadorMatrices.sumaRenglon(gastos, dia);
		return sumaDia;
	}
	
	}
	
	
	

