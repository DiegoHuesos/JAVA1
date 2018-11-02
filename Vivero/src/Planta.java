import java.util.*;

public class Planta {
	/*
	 * Diego Hernandez Delgado !76262
	 * 10/11/2017
	 */
	private String nombre;
	private String color;
	private int epoca;
	private int total;
	
	public Planta() {
	}

	public Planta(String nombre, String color, int epoca, int total) {
		this.nombre = nombre;
		this.color = color;
		this.epoca = epoca;
		this.total = total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEpoca() {
		return epoca;
	}

	public void setEpoca(int epoca) {
		this.epoca = epoca;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
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
		Planta other = (Planta) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Planta otra){
		return nombre.compareTo(otra.getNombre());
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Planta: \n");
		sb.append(" nombre : \n"+nombre+"\n");
		sb.append(" color  : \n"+color+"\n");
		sb.append(" epoca  : \n"+epoca+"\n");
		sb.append(" total  : \n"+total+"\n");
		return sb.toString();
	}
	

}
