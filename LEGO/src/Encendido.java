/*Diego Hernández Delgado
 * (176262)
 * Retos Programación en JAVA
 * Ejercicio1.-LEGO
 * Fecha:08/10/2018
 * 
 * Clase Encendido
 */
public class Encendido {
	double tiempo, costo;
	static int folio=0;
	int numEncendido;
	
	//Constructores:
	public Encendido(){	
		folio++;
		numEncendido=folio;
	}
	
	public Encendido(double tiempo, double costo){
		this();
		this.tiempo=tiempo;
		this.costo=costo;	
	}
	
	//Setter's:
	public void setTiempo(double tiempo){
		this.tiempo=tiempo;
	}
	
	public void setCosto(double costo){
		this.costo=costo;
	}
	
	//Getter's:
	public double getTiempo(){
		return tiempo;
	}
	
	public double getCosto(){
		return costo;
	}
	
	//Equals:
	public boolean equals(Encendido on){
		boolean resp;
		if(numEncendido==on.numEncendido)
			resp=true;
		else 
			resp=false;
		return resp;
	}
	
	//compareTo:
	public int compareTo(Encendido on){
		int resp;
		if(numEncendido==on.numEncendido)
			resp=0;
		else
			if(numEncendido>on.numEncendido)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	//toString:
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Encendido "+numEncendido+"\n");
		sb.append("  Tiempo: "+tiempo+" min\n");
		sb.append("  Costo: $"+costo+"\n");
		
		return sb.toString();
	}

}
