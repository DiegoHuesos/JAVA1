/*Diego Hernández Delgado (176262)
 * (14-10-2018)
 * Tarea: Agencia Automotriz
 * Clase "Auto"
 */
public class Auto {
	
	private static int folio=0;
	int id;
	String marca;
	String modelo;
	int anio;
	String color;
	
	public Auto(){
		folio++;
		id=folio;
	}
	
	public Auto(String marca, String modelo, int anio, String color){
		this();
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
		this.color=color;
	}
	
	public int getId(){
		return id;
	}
	
	public String getMarca(){
		return marca;
	}
	public String getModelo(){
		return modelo;
	}
	
	public int getAnio(){
		return anio;
	}
	
	public String getColor(){
		return color;
	}
	
	public boolean equals(Auto otro){
		boolean resp;
		if(id==otro.id)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(Auto otro){
		int resp;
		if(id==otro.id)
			resp=0;
		else
			if(id>otro.id)
			resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Auto: \n");
		sb.append("  ID: "+id+"\n");
		sb.append("  Marca"+marca+" \n");
		sb.append("  Modelo"+modelo+" \n");
		sb.append("  Año: "+anio+"\n");
		sb.append("  Color: "+color+"\n");
		
		return sb.toString();
	}
	
}
