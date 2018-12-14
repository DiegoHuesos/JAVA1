//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 11/09/2018
//Clase Serpiente

public class Serpiente {
	private String raza;
	private String color;
	private String tipoAlimento;
	private static int folio=100;
	private int id;

	public Serpiente(String raza, String color, String tipoAlimento){
		this.id=this.folio;
		this.folio++;
		this.raza=raza;
		this.color=color;
		this.tipoAlimento=tipoAlimento;
	}
	
	public String getRaza(){
		return raza;
	}
	public String getColor(){
		return color;
	}
	public int getId(){
		return id;
	}
	public String getTipoAlimento(){
		return tipoAlimento;
	}
	public void setRaza(String raza){
		this.raza=raza;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setTipoAlimento(String tipoAlimento){
		this.tipoAlimento=tipoAlimento;
	}
	public boolean equals(Serpiente otra){
		boolean resp=false;
		if(this.id == otra.id)
			resp=true;
		return resp;
	}
	public int compareTo(Serpiente otra){
		int resp;
		if(this.id > otra.id)
			resp=1;
		else
			if(this.id < otra.id)
				resp=-1;
			else
				resp=0;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Serpiente # "+id+"\n");
		sb.append("	Raza: "+raza+"\n");
		sb.append("	Color: "+color+"\n");
		sb.append("	Alimento: "+tipoAlimento+"\n");
		return sb.toString();
	}
}
