
public class Obra {
	private static int folio=1001;
	private int clave;
	private String nombreAutor;
	private String nombreObra;
	private char tecnica;
	private double precioBase;
	private double tamanio;
	
	Obra(String nombreAutor, String nombreObra, char tecnica, double precioBase, double tamanio){
		this.clave=folio;
		folio++;
		this.nombreAutor=nombreAutor;
		this.nombreObra=nombreObra;
		this.tecnica=tecnica;
		this.precioBase=precioBase;
		this.tamanio=tamanio;
	}
	
	public boolean equals(Obra otra){
		boolean resp=false;
		if(this.clave==otra.clave)
			resp=true;
		return resp;
	}
	
	public int compareTo(Obra otra){
		int resp;
		if(this.clave>otra.clave)
			resp=1;
		else
			if(this.clave<otra.clave)
				resp=-1;
			else
				resp=0;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb= new StringBuilder();
		sb.append("Obra # "+clave+"\n");
		sb.append("   Titulo: "+nombreObra+"\n");
		sb.append("   Autor: "+nombreAutor+"\n");
		sb.append("   Tecnica: "+tecnica+"\n");
		sb.append("   Precio base: "+precioBase+"\n");
		sb.append("   Tamaño: "+tamanio+"\n");
		
		return sb.toString();
	}

	public int getClave() {
		return clave;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public String getNombreObra() {
		return nombreObra;
	}

	public char getTecnica() {
		return tecnica;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getTamanio(){
		return tamanio;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public void setNombreObra(String nombreObra) {
		this.nombreObra = nombreObra;
	}

	public void setTecnica(char tecnica) {
		this.tecnica = tecnica;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setTamanio(double tamanio){
		this.tamanio=tamanio;
	}
	
	
	public double calculaPrecioVenta(){
		double precioVenta=0;
		
		switch(tecnica){
		case 'O':
			break;
			
			
			
		}
		return precioVenta;
	}
	
}
