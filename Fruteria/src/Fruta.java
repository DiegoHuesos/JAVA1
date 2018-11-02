/* Diego Hernandez Delgado
 * (176262)
 * Tarea.-Fruteria
 * Fecha: 24/10/2018
 */

public class Fruta {
	private static int folio=2000;
	private int id;
	private String nombre;
	private String color;
	private String ciudadDeOrigen;
	private double costoXKilo;
	
	//Constructores:
	public Fruta(){
		id=folio;
		folio++;
	}
	public Fruta(String nombre, String color, String ciudadDeOrigen, double costoXKilo){
		this();
		this.nombre=nombre;
		this.color=color;
		this.ciudadDeOrigen=ciudadDeOrigen;
		this.costoXKilo=costoXKilo;
	}
	
	//Funcionalidad minima requerida:
	public boolean equals(Fruta otra){
		boolean resp=false;
		if(this.id==otra.id)
			resp=true;
		return resp;
	}
	
	public int compareTo(Fruta otra){
		int resp;
		if(this.id==otra.id)
			resp=0;
		else
			if(this.id>otra.id)
				resp=1;
			else resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Fruta #"+id+": \n");
		sb.append("   Nombre: "+nombre+": \n");
		sb.append("   Color: "+color+": \n");
		sb.append("   Ciudad de origen: "+ciudadDeOrigen+": \n");
		sb.append("   Costo por kilo: "+costoXKilo+": \n");
		
		return sb.toString();
	}
	
	
	//Getter's:
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getColor() {
		return color;
	}
	public String getCiudadDeOrigen() {
		return ciudadDeOrigen;
	}
	public double getCostoXKilo() {
		return costoXKilo;
	}
	
	
	//Setters:
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCiudadDeOrigen(String ciudadDeOrigen) {
		this.ciudadDeOrigen = ciudadDeOrigen;
	}
	public void setCostoXKilo(double costoXKilo) {
		this.costoXKilo = costoXKilo;
	}
	
	
	//Funcionalidad del problema:
	public double calculaCosto(double kilos){
		double costo;
		costo=costoXKilo*kilos;
		return costo;
	}
	
	public double calculaPorcentajeDescuento(double costo){
		double desc=0;
		if(costo >= 1500  &&  costo<= 10000)
			desc=((costo-1500)/8500)*10;
		else
			if(costo>10000)
				desc=10;
		return desc;
	}
		
}
