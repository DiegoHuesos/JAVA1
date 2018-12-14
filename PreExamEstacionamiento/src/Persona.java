
public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	
	public Persona(String nombre, int edad, char sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	public String getNombre(){return nombre;}
	public int getEdad(){return edad;}
	public char getSexo(){return sexo;};
	
	public void setNombre(String nuevo){this.nombre=nuevo;}
	public void setEdad(int nueva){this.edad=nueva;}
	public void setSexo(char nuevo){this.sexo=nuevo;}
	
	public boolean equals(Persona otra){
		boolean resp=false;
		if(this.nombre.equals(otra.nombre))
			resp=true;
		return resp;
	}
	
	public int compareTo(Persona otra){
		int resp;
		if(this.nombre.equals(otra.nombre))
			resp=0;
		else
			if(this.nombre.compareTo(otra.nombre)>0)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: "+nombre+"\n");
		sb.append("Edad:   "+edad+"\n");
		sb.append("Sexo:   "+sexo+"\n");
		return sb.toString();
	}
}
