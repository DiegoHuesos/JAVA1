/*
 * Diego Hern�ndez Delgado
 * (176262)
 * Examen 
 */

public class PaqueteTurismo {
	//Declaro atributos:
	private static int folio=0;
	private int clave;
	private int destino;
	private int duracion;
	private char estilo;
	private int alimentos;
	
	public PaqueteTurismo(){
		folio=folio+1;
		clave=folio;
	}
	
	public PaqueteTurismo(int destino, int duracion, char estilo, int alimentos) {
		this();
		this.destino=destino;
		this.duracion=duracion;
		this.estilo=estilo;
		this.alimentos=alimentos;
	}
	
	public double calculaPrecio(String temporada) {
		double total=0;
		
		switch (destino) {
		case 1:
			total=total+100;
			break;
		case 2:
			total=total+120;
			break;
		case 3:
			total=total+90;
			break;
		}
		
		total=total*duracion+(alimentos*50*duracion);
		
		if(estilo=='L') 
			total=total+(total*0.18);
		
		
		if(estilo=='E') 
				total=total+(total*0.12);	
		
		
		if(temporada.equals("alta")) 
			total=total+(total*0.10);
		
		
		if(temporada.equals("baja"))
			total=total-(total*0.15);
		
		return total;
	}
	
	public void setDuracion(int duracion) {
		this.duracion=duracion;
	}
	
	public int getClave() {
		return clave;
	}
	
	public int getDestino() {
		return destino;
	}
	
	public int getDuracion() {
	return duracion;
	}
	
	public char getEstilo() {
		return estilo;
	}
	
	public int getAlimentos() {
		return alimentos;
	}
	
	public boolean equals(PaqueteTurismo otroPaquete) {
		boolean resp;
		if(clave==otroPaquete.clave)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(PaqueteTurismo otroPaquete) {
		int resp;
		if(clave==otroPaquete.clave)
			resp=0;
		else
			if(clave>otroPaquete.clave)
				resp=1;
			else
				resp=-1;
		return resp;
	}	
	
	public String toString() {
		StringBuilder sb;
		sb= new StringBuilder();
		
		sb.append("Datos del paquete:\n");
		sb.append("  -Clave:"+clave+"\n");
		sb.append("  -Destino:"+destino+"\n");
		sb.append("  -Duraci�n:"+duracion+"\n");
		sb.append("  -Estilo:"+estilo+"\n");
		sb.append("  -Alimentos:"+alimentos+"\n");
		return sb.toString();
	}



}
