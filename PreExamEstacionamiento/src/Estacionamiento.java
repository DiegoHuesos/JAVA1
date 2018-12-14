import java.util.ArrayList;

public class Estacionamiento {
	private final int PISOS=3;
	private final int LUGARES=10;
	private Auto [][] parking;
	private int []ocupados= new int[3];
	private int ocupadosTot;
	
	public Estacionamiento(){
		parking= new Auto[PISOS][LUGARES];
		ocupados[0]=0;
		ocupados[1]=0;
		ocupados[2]=0;
		ocupadosTot=0;
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<PISOS; i++){
			for(int j=0; j<LUGARES; j++)
				if(parking[i][j] != null)
					sb.append(parking[i][j].getPlacas()+"\t");
				else
					sb.append("---"+"\t");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	//0) Alta carro:
	public boolean altaCarro(int piso, int lugar, Auto unAuto){
		parking[piso][lugar]=unAuto;
		return true;
	}
	
	//A) ¿Cuántas camionetas hay estacionadas en cierto piso?
	public int cuantasCamionetas(int piso){
		int resp=0;
		for(int j=0; j<LUGARES; j++)
			if(parking[piso][j].getTipo() == 'C')
				resp++;
		return resp;
	}
	
	
	//B) ¿Cuántos cajones de estacionamiento hay libres?
	public int disponibilidadTot(){
		return 30-ocupadosTot;
	}
	public int disponibilidadPiso1(){
		return 10-ocupados[0];
	}
	public int disponibilidadPiso2(){
		return 10-ocupados[1];
	}
	public int disponibilidadPiso3(){
		return 10-ocupados[2];
	}
	
	
	//C) ¿Cuántos servicios tiene registrados un auto especifico en el año ?
	public int cuantosServicios(Auto uno){
		return uno.getMesesConServicio().size();
	}
	
	//D) La lista de placas de autos que cumplan la condición de tener registrado algún
	//   servicio específico (p.e. cambio de aceite):
		public ArrayList<String> quinesConEsteServicio(String tipoServicio){
		ArrayList<String> listaAutoConServicio = new ArrayList<String>();
		for(int i=0; i<PISOS; i++)
			for(int j=0; j<LUGARES; j++)
				if(parking[i][j].getServiciosRealizados().contains(tipoServicio))
					listaAutoConServicio.add(parking[i][j].getPlacas());
		return listaAutoConServicio;
	}
	
	//E) Lugar de estacionamiento del auto más longevo:
	public String lugarAutoMasViejo(){
		String resp;
		Auto longevo=parking[0][0];
		for(int i=0; i<PISOS; i++)
			for(int j=0; j<LUGARES; j++)
				if(parking[i][j].getPlacas().compareTo(longevo.getPlacas())<0)
					longevo=parking[i][j];
		resp="["+longevo.getPiso()+"] + ["+longevo.getLugar()+"]";
		return resp;
	}
	
	//F) ¿Cuántos autos de un cierto color hay estacionados en todo el estacionamiento?
	public int cuantosDeEsteColor(String color){
		int resp=0;
		for(int i=0; i<PISOS; i++)
			for(int j=0; j<LUGARES; j++)
				if(parking[i][j].getColor().equals(color))
					resp++;
		return resp;
	}
	
	//G) Si existe, indique el piso que se encuentre con todos los lugares disponibles.
	public String pisoVacio(){
		String resp="";
		if(ocupados[0]==0)
			resp+="1 ";
		if(ocupados[1]==0)
			resp+="2 ";
		if(ocupados[2]==0)
			resp+="3 ";
		return resp;
	}
	
	//H) Partiendo del primer piso y primer cajón, hasta el piso 3 y último cajón, indique el primer
	//lugar disponible que haya en el estacionamiento.
	public String primerLugarDisponible(){
		String resp="";
		int cont=0;
		int i=0;
		int j=0;
		while(i<PISOS && parking[i][j]!=null){
			while(j<LUGARES && parking[i][j]!=null)
				j++;
			if(parking[i][j] != null){
				i++;
				j=0;
			}	
		}
		if(parking[i][j]==null)
			resp="Lugar disponible: ["+i+"] "+"["+j+"]";
		else
			//I) Indique si el estacionamiento NO tiene ningún lugar disponible.
			if(i==PISOS && j== LUGARES)
				resp="¡No hay lugar disponible!";
		return resp;
	}
	
	
	//OPCIONAL
	
	//a) ¿Cuál es el auto estacionado (placas) cuyo dueño sea el más longevo?
	public Auto autoConDueñoMasLongevo(){
		Auto resp= parking[0][0];
		for(int i=0; i<PISOS; i++)
			for(int j=0; j<LUGARES; j++)
				if(resp.getDuenio().getEdad()<parking[i][j].getDuenio().getEdad())
					resp=parking[i][j];
		return resp;
	}
	
	//b)¿Cuántos autos estacionados son propiedad de personas de algún género específico (ej.mujeres)?
	public int numAutosPorGenero(char sexo){
		int resp=0;
		for(int i=0; i<PISOS; i++)
			for(int j=0; j<LUGARES; j++)
				if(parking[i][j].getDuenio().getSexo() == sexo)
					resp++;
		return resp;
	}
		
		
}
