/*Diego Hernández Delgado
 * (176262)
 * Retos Programación en JAVA
 * Ejercicio1.-LEGO
 * Fecha:08/10/2018
 * 
 * Clase Maquina:
 */

public class Maquina {
	String modelo;
	
	//Constructor:
	public Maquina(String modelo){
		this.modelo=modelo;
	}
	
	//Get:
	public String getModelo(){
		return modelo;
	}
	
	//Equals:
	public boolean equals(Maquina otra){
		boolean resp;
		if(modelo.equals(otra.modelo))
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	//CompareTo:
	public int compareTo(Maquina otra){
		int resp;
		if(modelo.compareTo(otra.modelo)==0)
			resp=0;
		else
			if(modelo.compareTo(otra.modelo)>0)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	//ToString:
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Máquina: "+modelo+"\n");
		return sb.toString();
	}
	
	//Función encender1: Regresa un String que da la información del tiempo y el costo:
	
	public String encender1(char tipoPieza, int numPieza, int colorPiezas, double precioPlastico){
		StringBuilder sb;
		double tiempo, consumoPlastico, costo;
		sb=new StringBuilder();
		
		if(tipoPieza=='B'){
			tiempo=numPieza/720;
			consumoPlastico=numPieza*0.12/12;
			costo=consumoPlastico*precioPlastico;
		}
		else{
			tiempo=numPieza/240;
			consumoPlastico=numPieza*0.0285/4;
			costo=consumoPlastico*precioPlastico;
		}
		
		if(colorPiezas==3 || colorPiezas==4)
			costo=costo+consumoPlastico/5*10;
		else
			costo=costo+consumoPlastico/5*12.50;
		
		sb.append("Tiempo: "+tiempo+"\n");
		sb.append("Costo: "+costo+"\n");
		
		return sb.toString();
	}

	
	//Función encender2: regresa un arreglo que contiene el tiempo y el costo:
	public double[] encender2(char tipoPieza, int numPieza, int colorPiezas, double precioPlastico){
		double[] encendido;
		double tiempo, consumoPlastico, costo;
		
		
		if(tipoPieza=='B'){
			tiempo=numPieza/720;
			consumoPlastico=numPieza*0.12/12;
			costo=consumoPlastico*precioPlastico;
		}
		else{
			tiempo=numPieza/240;
			consumoPlastico=numPieza*0.0285/4;
			costo=consumoPlastico*precioPlastico;
		}
		
		if(colorPiezas==3 || colorPiezas==4)
			costo=costo+consumoPlastico/5*10;
		else
			costo=costo+consumoPlastico/5*12.50;
		
		encendido= new double[2];
		encendido[0]=tiempo;
		encendido[1]=costo;
		
		return encendido;
	}
	
	
	//Función encender3: regresa un objeto con el tiempo y el costo:
	
	public Encendido encender3(char tipoPieza, int numPieza, int colorPiezas, double precioPlastico){
		Encendido encendido;
		double tiempo, consumoPlastico, costo;
		
		
		if(tipoPieza=='B'){
			tiempo=numPieza/720;
			consumoPlastico=numPieza*0.12/12;
			costo=consumoPlastico*precioPlastico;
		}
		else{
			tiempo=numPieza/240;
			consumoPlastico=numPieza*0.0285/4;
			costo=consumoPlastico*precioPlastico;
		}
		
		if(colorPiezas==3 || colorPiezas==4)
			costo=costo+consumoPlastico/5*10;
		else
			costo=costo+consumoPlastico/5*12.50;
		
		encendido= new Encendido(tiempo, costo);
		
		return encendido;
	}
	

}
