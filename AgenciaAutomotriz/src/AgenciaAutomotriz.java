/*Diego Hernández Delgado (176262)
 * (14-10-2018)
 * Tarea: Agencia Automotriz
 * Clase "AgenciaAutomotriz"
 */
public class AgenciaAutomotriz {
	
	private String nombre;
	private String direccion;
	private int cantMarcas;
	private String[] nomMarcas;
	private int cantAutos;
	private Auto[] autos;
	
	//Constructor vacio:
	public AgenciaAutomotriz(){
		
	}
	
	//Constructor principal:
	public AgenciaAutomotriz(String nombre, String direccion, int cantMarcas, String[] nomMarcas, int cantAutos, Auto[] autos){
		this.nombre=nombre;
		this.direccion=direccion;
		this.cantMarcas=cantMarcas;
		this.nomMarcas=nomMarcas;
		this.cantAutos=cantAutos;
		this.autos=autos; 
	}
	
	//Funcionalidad minima requerida::
	public String toString(){
		StringBuilder sb;
		sb= new StringBuilder();
		sb.append("Agencia Automotriz:\n");
		sb.append("   Nombre: "+nombre+"\n");
		sb.append("   Direccion: "+direccion+"\n");
		sb.append("   Cantidad de marcas: "+cantMarcas+"\n");
		sb.append("   Cantidad de autos: "+nombre+"\n");
		
		return sb.toString();
	}
	
	public boolean equals(AgenciaAutomotriz otra){
		boolean resp;
		if(nombre.equals(otra.nombre))
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(AgenciaAutomotriz otra){
		int resp;
		if(nombre.equals(otra.nombre))
			resp=0;
		else
			if(nombre.compareTo(otra.nombre)>0)
				resp=1;
			else
				resp=-1;
		return resp;	
	}
	
	
	//Getters:
	public String getNombre(){
		return nombre;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public int getCantMarcas(){
		return cantMarcas;
	}

	public String[] getNomMarcas(){
		return nomMarcas;
	}
	
	public int getCantAutos(){
		return cantAutos;
	}
	
	public Auto[] getAutos(){
		return autos;
	}
	
	
	//Setters
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	
	public void setCantMarcas(int cantMarcas){
		this.cantMarcas=cantMarcas;
	}
	
	public void setCantAutos(int cantAutos){
		this.cantAutos=cantAutos;
	}
}
