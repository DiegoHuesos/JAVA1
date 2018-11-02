
/*
 * Diego Hernandez Delgado
 * 176262
 * Examen
 */
public class Platillo {	
	private String nombre; //Nombre del platillo
	private char noSeElaboraEn; //EstaciÛn del aÒo en la cual no se elabora
	private double precio;
	private static int folio=100;
	private int claveUnica;
	
	public Platillo() {	
		claveUnica=folio;
		folio++;
	}
	
	public Platillo(String nombre, char noSeElabora, double precio) {	
		this();
		this.nombre = nombre;
		this.noSeElaboraEn = noSeElabora;
		this.precio = precio;
	}

	public int compareTo(Platillo otroPlatillo) {
		int resp;
		if(this.claveUnica == otroPlatillo.claveUnica)
			resp=0;
		else
			if(this.claveUnica> otroPlatillo.claveUnica)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	public int getClave() {
		return claveUnica;
	}
	@Override
	public String toString() {
		return "Platillo: " + nombre + "\nNo se elabora en: " + noSeElaboraEn + "\nPrecio: $" + precio;
	}

	public String getNombre() {
		return nombre;
	}

	public char getNoSeElabora() {
		return noSeElaboraEn;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}	
}
