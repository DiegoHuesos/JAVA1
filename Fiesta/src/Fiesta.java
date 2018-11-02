
public class Fiesta {
	/*
	 * Diego Hernandez Delgado
	 * 176262
	 * 06/11/2017
	 *Clase que tiene como atributo un arreglo de objetos
	 */
	
	private String lugar;
	private String fecha;
	private Persona[] invitados;
	private final int MAX=60;
	private int ocupados;
	
	public Fiesta(){
		invitados=new Persona[MAX];
		ocupados=0;
	}

	public Fiesta(String lugar, String fecha) {
		this();
		this.lugar = lugar;
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getOcupados() {
		return ocupados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fiesta other = (Fiesta) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (lugar == null) {
			if (other.lugar != null)
				return false;
		} else if (!lugar.equals(other.lugar))
			return false;
		return true;
	}
	
	public int compareTo(Fiesta otra){
		int resp;
		if(fecha.compareTo(otra.getFecha())<0 && lugar.compareTo(otra.getLugar())<0)
				resp=-1;
		else
			if(fecha.compareTo(otra.getFecha())==0 && lugar.compareTo(otra.getLugar())==0)
				resp=0;
			else 
				resp=1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Fiesta \n"+" lugar:"+lugar+"\n"+" fecha:"+fecha+"\n");
		for(int i=0;i<ocupados;i++)
			sb.append(invitados[i].toString());
		return sb.toString();
			
	}

	
	public boolean altaInvitado(String nombre, String direccion, String telefono, String email, char sexo, int edad){
		boolean resp=false;
		Persona unaPersona;
		
		if(ocupados<MAX){
			int i=0;
			while(i<ocupados && !invitados[i].getNombre().equals(nombre))
				i++;
			if(i==ocupados){
				resp=true;
				unaPersona=new Persona(nombre, direccion, telefono, email, sexo, edad);
				invitados[ocupados]=unaPersona;
				ocupados++;
			}
		}
		return resp;
	}

	
	
	public String bajaInvitado(String nombre){
		int i, j;
		String info;
		
		i=0;
		while(i<ocupados && !invitados[i].getNombre().equals(nombre))
			i++;
		if(i<ocupados){
			info=invitados[i].toString();
			j=i;
			while(j<ocupados-1){
				invitados[j]=invitados[j+1];
				j++;
			}
			invitados[ocupados-1]=null;
			ocupados--;
		}
		else
			info="No esta";
	return info;
	}
	
	//
	public String bajaInvitadoD(String nombre){
		String resp;
		int i;
		
		i=0;
		while(i<ocupados && !invitados[i].getNombre().equals(nombre))
			i++;
		if(i<ocupados){
			resp=invitados[i].toString();
			for(int j=i; j<ocupados-1;j++)
				invitados[j]=invitados[j+1];
			invitados[ocupados-1]=null;
			ocupados--;
		}
		else
			resp="No se encuentra en lista.";
		return resp;
	}
	//
	
	public int calculaCervezas(){
		int i, cervezas, mujeres;
		cervezas=0;
		mujeres=0;
		for(i=0;i<ocupados;i++){
			if(invitados[i].getEdad()>=18){
				char sexo;
				sexo = invitados[i].getSexo();
				if(sexo=='H')
					cervezas=cervezas+3;
				else mujeres++;
			}
		}
		cervezas=cervezas+(int)Math.ceil(mujeres/3.0);
		return cervezas;
	}
	
	public int calculaPizzas(){
		int rebanadas, i, pizzas;
		char sexo;
		rebanadas=0;
		for(i=0;i<ocupados;i++){
			sexo=invitados[i].getSexo();
			if(sexo=='H')
				rebanadas=rebanadas+6;
			else rebanadas=rebanadas+3;
		}
		pizzas=(int)Math.ceil(rebanadas/8.0);
		return pizzas;
	}

}
