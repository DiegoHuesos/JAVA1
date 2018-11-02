public class Compania {
	/*
	 * Diego Hernández Delgado 176262
	 * 30/10/2017
	 * Clase que tiene como atributo un arreglo de tipo primitivo
	 * y manda a llamar a nuestra libreria  de Manejador de arreglos
	 */
	
	private String nombre, direccion, ciudad, director;
	private double [] ventas;
	private final int NUM_MESES=12; //esto es para fijar el valor de una variable, que no sea != a 12, y se pone en mayus
	private String []meses={"Ene","Feb", "Mar", "Abr", "May","Jul","Ago", "Sept", "Oct", "Nov", "Dic"};
	//constructores
	public Compania(){
		ventas=new double[NUM_MESES];
	}

	public Compania(String nombre, String direccion, String ciudad, String director) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
	}
	
	//gets-sets

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getUnaVenta(int mes){
		double monto;
		/*aqui validamos primero que el mes exista para no pedirle que busque una
		 *ubicacion que no exista y quiebre el programa 
		 */
		if (mes>0 && mes<=12)
			monto=ventas[mes-1];
		else
			monto=-1;
		return monto;
	}
	
	public boolean altaVenta (double monto, int mes){
		boolean resp;
		/* Es para establecer el monto de la venta de un mes, nuevamente validamos mes
		 * y en caso de no poderse avisamos al usuario, por eso regresa un boolean
		 */
		
		if(mes>0 && mes<12){
			ventas[mes-1]=monto;
			resp=true;
		}
		else
			resp=false;
		return resp;
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
		Compania other = (Compania) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Compania otra){
		return nombre.compareTo(otra.getNombre());
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Compa�ia \n");
		sb.append("Nombre: "+nombre+"\n");
		sb.append("Direccion: "+direccion+"\n");
		sb.append("Ciudad: "+ciudad+"\n");
		sb.append("Director: "+director+"\n");
		for(int i=0;i<NUM_MESES;i++) //esto es para que imprima cada venta del mes en el array
			sb.append(meses[i]+": "+ventas[i]+"  ");
		sb.append("\n");
		return sb.toString();
	}
	
	/*aqu� debes dar click derecho a la carpeta de Compania, hasta abajo en properties
	 * luego escojes en la columna a la izquierda Java Build Path, de esa ventana
	 * te vas a la pesta�a de Projects, a la derecha el boton de add, la sumas, le picas 
	 * al boton de Apply  y luego OK
	 */
	
	public double promedio(){
		double prom;
		prom=ManejadorArreglos.promedioArreglo(ventas,NUM_MESES);
		return prom;
	}
	
	public int mesMayor(){
		int mes;
		mes=ManejadorArreglos.mayorArreglo(ventas, NUM_MESES);
		return mes+1;
	}
	
	public String mesMayor2(){
		int mes;
		mes=ManejadorArreglos.mayorArreglo(ventas, NUM_MESES);
		return meses[mes];
	}
	
	public int mesMenor(){
		int mes;
		mes=ManejadorArreglos.menorArreglo(ventas, NUM_MESES);
		return mes+1;
	}
	
	public String mesMenor2(){
		int mes;
		mes=ManejadorArreglos.menorArreglo(ventas, NUM_MESES);
		return meses[mes];
	}
	
	public int arribaPromedio(){
		double prom;
		int cuantos;
		prom=promedio();
		cuantos=ManejadorArreglos.cuentaArribaParam(ventas, NUM_MESES, prom);
		return cuantos;
	}
	
	public double totalVentas(){
		double suma;
		suma=ManejadorArreglos.sumaArreglo(ventas, NUM_MESES);
		return suma;
	}

}