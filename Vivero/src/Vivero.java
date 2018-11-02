
public class Vivero {
	/*
	 * Diego Hernandez Delgado
	 * 176262
	 * 10/11/2107
	 */
	
	private String nombre;
	private final int MAX=100;
	private int ocupados;
	private Planta[] plantas;
	
	public Vivero(){
		plantas=new Planta[MAX];
		ocupados=0;
	}

	public Vivero(String nombre, Planta[] plantas) {
		this();
		this.nombre = nombre;
		this.plantas = plantas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Planta[] getPlantas() {
		return plantas;
	}

	public void setPlantas(Planta[] plantas) {
		this.plantas = plantas;
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
		Vivero other = (Vivero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Vivero otro){
		return nombre.compareTo(otro.getNombre());
	}
	
	public String toString(){
		StringBuilder sb;
		int i;
		sb= new StringBuilder();
		sb.append("Vivero \n");
		sb.append("nombre:"+nombre+"\n");
		for(i=0; i<ocupados;i++)
			sb.append(plantas[i].toString());
		return sb.toString();
		
	}

	

	
}
