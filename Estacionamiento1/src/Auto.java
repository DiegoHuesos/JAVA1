// Irma
// clase 

public class Auto {
	private String placa;
	private char tipo;
	private int horaEntrada;
	private int minEntrada;
	private int horaSalida;
	private int minSalida;
	
	
	public Auto() {
		
	}
	
	public Auto(String placa, char tipo, int horaEntrada, int minEntrada) {
		this.placa = placa;
		this.tipo = tipo;
		this.horaEntrada = horaEntrada;
		this.minEntrada = minEntrada;
	}
	
	public String getPlaca() {
		return placa;
	}

	public char getTipo() {
		return tipo;
	}
	
	public int getHoraEntrada() {
		return horaEntrada;
	}
	
	public int getMinEntrada() {
		return minEntrada;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public void setMinSalida(int minSalida) {
		this.minSalida = minSalida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		Auto other = (Auto) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	public int compareTo(Auto otra) {
		int resp;
			
		resp = placa.compareTo(otra.placa);
		return resp;
	}

	public String toString() {
		StringBuilder cadena = new StringBuilder();
			
		cadena.append(placa);
		//cadena.append("tipo:  "+ tipo + "\t");
		//cadena.append("hora de entrada: "+ horaEntrada + "\t");
		//cadena.append("mins de entrada: "+ minEntrada + "\t");
		//cadena.append("hora de salida:  "+ horaSalida + "\n");
		//cadena.append("mins de salida: "+ minSalida + "\t");
		return cadena.toString();
	}

}
