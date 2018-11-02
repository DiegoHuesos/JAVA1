
public class Persona {
	/*
	 * Diego Hernandez Delgado
	 * 06/11/2017
	 * 176262
	 */
	
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	private char sexo;
	private int edad;
	
	public Persona(String nombre, String direccion, String telefono, String email, char sexo, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Persona otra){
		return nombre.compareTo(otra.getNombre());
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("    nombre: "+nombre+"\n");
		sb.append(" direccion: "+direccion+"\n");
		sb.append("  telefono: "+telefono+"\n");
		sb.append("     email: "+email+"\n");
		sb.append("      sexo: "+sexo+"\n");
		sb.append("  anio nac: "+edad+"\n");
		return sb.toString();
	}

}
