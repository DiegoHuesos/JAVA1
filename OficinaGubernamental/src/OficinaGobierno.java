
public class OficinaGobierno {
	String encargado;
	double[] poblacion;
	String[] nombreEdos;
	private static final int NUM_ESTADOS=32;
	
	//Constructores
	public OficinaGobierno(){
		poblacion=new double[NUM_ESTADOS];
		nombreEdos=new String[NUM_ESTADOS];
	}
	
	public OficinaGobierno(String encargado){
		this();
		this.encargado=encargado;
	}
	
	//a) Nombre del Estado con mayor población:
	public String edoMayorPoblacion(){
		double mayorPoblacion=0;
		int edoMayor=0;
		
		for(int i=0 ; i<NUM_ESTADOS ; i++){
			if(i==1){
				mayorPoblacion=poblacion[i];
				edoMayor=i;
			}
			else
				if(mayorPoblacion<poblacion[i]){
					mayorPoblacion=poblacion[i];
					edoMayor=i;
				}		
		}
		return nombreEdos[edoMayor];
	}
	
	//b) Promedio de habitantes a nivel nacional:
	public double promedioHabitantes(){
		double suma=0, promedio;
		
		for(int i=0; i<NUM_ESTADOS; i++){
			suma=suma+ poblacion[i];
		}
		promedio=suma/NUM_ESTADOS;
		
		return promedio;
	}
	
	//c) Total de estados que tienen una poblacion menor al promedio:
	public int numEdoMenorAlProm(double prom){
		int numEdoMenorAlProm=0;
		
		for(int i=0; i<NUM_ESTADOS; i++){
			if(poblacion[i]<prom)
				numEdoMenorAlProm++;
		}
		return numEdoMenorAlProm;
	}
	
	//Funcionalidad minima requerida:
	
	public void setEncargado(String encargado){
		this.encargado=encargado;
	}
	
	public String getEncargado(){
		return encargado;
	}
	
	public boolean equals(OficinaGobierno otra){
		boolean resp;
		if(encargado.equals(otra.encargado))
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(OficinaGobierno otra){
		int resp;
		if(encargado.equals(otra.encargado))
			resp=0;
		else
			if(encargado.compareTo(otra.encargado)>0)
			resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Encargada de la oficina:"+encargado);
		return sb.toString();
	}

}
