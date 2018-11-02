
public class Fiesta {

	private String nombre;
	private String lugar;
	private int asistentes;
	private Persona[] invitados;
	private final int MAX = 40;
	
	//Constructor vacio:
	public Fiesta(){
		invitados= new Persona[MAX];
		asistentes=0;
	}
	
	//Constructor:
	public Fiesta(String nombre, String lugar){
		this();
		this.nombre=nombre;
		this.lugar=lugar;
	}

	//Funcionalidad minima requerida:
	
	//Getter's
	public String getNombre() {
		return nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public int getAsistentes() {
		return asistentes;
	}

	public Persona[] getInvitados() {
		return invitados;
	}

	public int getMAX() {
		return MAX;
	}

	//Setter's
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	//ToString
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Fiesta de "+nombre+"\n");
		sb.append("    Lugar: "+lugar+"\n");
		sb.append("    # Invitados: "+asistentes+"\n");
		
		for(int i=0; i<asistentes; i++)
			sb.append(invitados[i].toString());
		
		return sb.toString();
	}
	
	//CompareTo
	public int compareTo(Fiesta otra){
		int resp;
		resp= nombre.compareTo(otra.nombre);
		return resp;
	}
	
	//Equals
	public boolean equals(Fiesta otra){
		boolean resp;
		resp=false;
		
		if(nombre.equals(otra.nombre))
			resp=true;
		return resp;
	}
	
	public boolean altaInvitado(String nombre, String direccion, char genero, int edad){
		boolean resp=false;
		Persona unaPersona;
		int i=0;
		if(asistentes < MAX)  //Todavia hay lugar en la fiesta
			i=0;
			while(i<asistentes && !invitados[i].getNombre().equals(nombre))
				i++;
	
			if(i==asistentes){
				unaPersona= new Persona(nombre, direccion, genero, edad);
				invitados[asistentes]= unaPersona;
				asistentes++;
				resp=true;
			}
		return resp;	
	}
	
	public int calculaPizzas(){
		int pizzas, rebanadas;
		
		rebanadas=0;
		for(int i=0; i<asistentes; i++){
			if(invitados[i].getGenero()=='H')
				rebanadas+=4;
			else
				rebanadas+=2;
		}
		pizzas=rebanadas/8;
		if(pizzas %8 !=0)
			pizzas++;
		return pizzas;
	}
	
}
