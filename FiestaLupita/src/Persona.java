
public class Persona {
	private String nombre;
	private String direccion;
	private char genero;
	private int edad;
	
	public Persona(String nombre, String direccion, char genero, int edad){
		this.nombre=nombre;
		this.direccion=direccion;
		this.genero=genero;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public char getGenero() {
		return genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (genero != other.genero)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public int compareTo(Persona otra){
		int resp;
		if(nombre.compareTo(otra.nombre)==0)
			resp=0;
		else
			if(nombre.compareTo(otra.nombre)>0)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Invitado: \n");
		sb.append("   Nombre:"+nombre+"\n");
		sb.append("   Direccion:"+direccion+"\n");
		sb.append("   Genero:"+genero+"\n");
		sb.append("   Edad:"+edad+"\n");
		
	
		return sb.toString();
	}

	
	
	
	
	

}
