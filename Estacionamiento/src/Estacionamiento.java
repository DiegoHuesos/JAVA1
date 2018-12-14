//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 12/11/2018
//Clase Estacionamiento

// clase para crear un estacionamiento de 5 pisos y capacidad para 10 autos

public class Estacionamiento {
	private final int PISOS=4;
	private final int LUGARES=5;
	private String nombre;
	private String direccion;
	private Auto[][] autos;
	
	public Estacionamiento(String nombre, String direccion) {
		autos = new Auto[PISOS][LUGARES];
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public int getPisos() {
		return PISOS;
	}
	
	public int getLugares() {
		return LUGARES;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		Estacionamiento other = (Estacionamiento) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Estacionamiento otro) {
		int resp;
		
		resp = this.nombre.compareTo(otro.nombre);
		return resp;
	}
	
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		
		cadena.append("Nombre:    "+ nombre + "\n");
		cadena.append("Direccion: "+ direccion + "\n");
		cadena.append("Registro de autos:  \n");
		for (int j=0; j < PISOS; j++) {
			for (int i = 0; i<LUGARES; i++) {
				if (autos[j][i] != null)
					cadena.append(autos[j][i].toString()+ "\t");
				else
					cadena.append("---\t");
			}
			cadena.append("\n");
		}
		return cadena.toString();
	}
	
	public boolean altaAuto(String placa, char tipo, int horaEntrada, int minEntrada) {
		boolean resp = false;
		int i, renglon=0;
		
		Auto unAuto;
		i = 0;
		
		unAuto = new Auto(placa, tipo, horaEntrada, minEntrada);
		if (tipo == 'C')
			renglon = 0;
		else 
			renglon = 1;
		do {
			i = 0;
			resp = false;
			while (i < LUGARES && autos[renglon][i] != null)
				i++;
			if (i < LUGARES) {
				autos[renglon][i] = unAuto;
				resp = true;
			}
			else
				if (tipo == 'C')
					resp = false;
				else
					renglon++;

		} while (renglon < PISOS && !resp);
		
		return resp;	
	}
	
	public double saleAuto(String placa, int horaSalida, int minSalida) {
		boolean resp = false;
		int i, renglon = 0, entro= 0, tiempo=0;
		double costo=0.0;
				
		do {
			
			i = 0;
			resp = false;
			while ((i < LUGARES) && (autos[renglon][i] == null || !autos[renglon][i].getPlaca().equals(placa))) {
					i++;
			}
			if (i >= LUGARES )
				renglon++;
			else {
				entro = autos[renglon][i].getHoraEntrada();
				tiempo = horaSalida - entro;
				costo = (tiempo / 15)*5 ;
				if (tiempo%15 != 0)
					costo += 5;
				if (tiempo>60)
					costo+=15;
				autos[renglon][i] = null;	
				resp = true;
			}
			
		} while (renglon < PISOS && !resp);
		
		return costo;
	}


}
