/* Diego Hernández Delgado (176262)
 * Fecha: 14/09/2018
 * "Clase Circulo"
 */

public class Circulo{
	//Declaro variable:
	double radio;
	
	//Constructores:
	public Circulo(){	
	}
	
	public Circulo(double radio){
		this.radio=radio;
		}
	
	//Funcionalidad mínima requerida;
	public void setRadio(double neoradio){
		radio=neoradio;		
	}
	
	public double getRadio(){
		return radio;
	}
	
	public boolean equals (Circulo otroCirculo){
		boolean resp;
		if(radio==otroCirculo.getRadio())
			resp=true;
		else 
			resp=false;
		return resp;		
	}
	
	public int compareTo(Circulo otroCirculo){
		int resp;
		if(radio==otroCirculo.getRadio())
			resp=0;
		else
			if(radio>otroCirculo.getRadio())
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb= new StringBuilder();
		
		sb.append("Radio: ");
		sb.append(radio+"\n");
		return sb.toString();
	}
	
	//Funciones requeridas:
	public double calculaArea(){
		double area;
		area=Math.PI*(radio*radio);
		return area;
	}
	
	public double calculaCircunferencia(){
		double circunferencia;
		circunferencia= Math.PI*(radio+radio);
		return circunferencia;
	}
}
