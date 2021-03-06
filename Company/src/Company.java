/*
 * Diego HD
 * 26/0ct/2018
 */
public class Company {
	private final int MAX=12;    //ventas mensuales
	private String nombre;
	private String direccion;
	private String telefono;
	private String rfc;          //RFC--> Registro Federal del Contribuyente
	private double [] ventas;
	private int ocupVentas, edad;
	
	public Company(){
		ventas=new double [MAX];
		ocupVentas=0;
	}
	
	public Company(String nombre, String direccion, String telefono, String rfc){
		this();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getRfc() {
		return rfc;
	}
	
	public boolean equals(Company other){
		boolean answer=false;
		if(this.rfc.equals(other.rfc))
			answer=true;
		return answer;
	}
	
	public int compareTo(Company other){
		int answer;
		if(this.rfc.equals(other.rfc))
			answer=0;
		else
			if(this.rfc.compareTo(other.rfc)>0)
				answer=1;
			else
				answer=-1;
		return answer;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Company "+nombre+": \n");
		sb.append("   Adress:"+direccion+"\n");
		sb.append("   Phone:"+telefono+"\n");
		sb.append("   RFC:"+rfc+"\n");
		for(int i=0; i<ocupVentas; i++)
			sb.append(ventas[i]+" ");
		
		return sb.toString();
	}
	
	public boolean altaVentas(double monto, int mes){
		boolean resp=false;
		if(mes >=1 && mes<= MAX){
			ocupVentas++;
			ventas[mes-1]=monto;
		}
		return resp;
			
	}
	
	public double totalVentas(){
		double total;
		
		total= ManejadorArreglosIrma.sumaArreglo(ventas, MAX);
		return total;
	}
	
	public int mesMasVentas() {
		int mes, mesf; 
		mes = ManejadorArreglosIrma.posMaximo(ventas, MAX, 0); 
		mes =+1; 
		return mes;
	
	}
	
	
	public int antiguedad(){
		String cadena;
		int anios;
		
		cadena=rfc.substring(4,6);
		anios= Integer.parseInt(cadena);
		
		if(anios<= 18)
			anios+=2000;
		else
			anios+=1900;
		anios= 2018-anios;
		
		return  anios;
	}
		
	
}
