//Diego Hernandez Delgado
//Clave unica: 176262
//Tarea: Pag.37 Ej.3
//Fecha: 07-12-2018
//Clase Tarjeta

public class Tarjeta {
	private int numTarjeta;  
	private static int folio=100000;
	private int numCuenta;		  //Se asigna automaticamente
	private int nip;
	private String tipo;          //"titular" o "adicional"
	private int categoria;        //azul=0, oro=1, platinum=2
	private int anioAdquisicion;
	private int anioVencimiento;  //Sólo cinco años de vigencia
	private double limiteCredito; //azul=$20 000 , oro=$30 000 , platinum=$50 000
	private double saldo;
	
	public Tarjeta(int numTarjeta, String tipo, int categoria, int anioAdquisicion){
		this.numTarjeta=numTarjeta;
		this.numCuenta= folio;
		folio++;
		this.nip=0;
		this.tipo=tipo;
		this.categoria=categoria;
		this.anioAdquisicion=anioAdquisicion;
		this.anioVencimiento=anioAdquisicion+5;
		this.saldo=0;
		switch(categoria){
			case 0:
				this.limiteCredito=20000;
				break;
			case 1:
				this.limiteCredito=30000;
				break;
			case 2:
				this.limiteCredito=50000;
				break;
		}	
	}
	
	public boolean activaTarjeta(int nip){
		boolean resp=true;
		this.nip=nip;
		return resp;
	}
	
	public double calculaCreditoDisponible(){
		return this.limiteCredito-this.saldo;
	}
	
	public double calculaComision(){
		double comision=0;
		if(tipo.equals("titular")){
			if(categoria==2)
				comision=this.limiteCredito/100;
			else
				comision=this.limiteCredito*0.05/100;
		}
		else
			if(tipo.equals("adicional")){
				switch(categoria){
				case 2:
					comision=this.limiteCredito*0.05/100;
					break;
				case 1:
					comision=this.limiteCredito*0.02/100;
					break;
				case 0:
					comision=this.limiteCredito*0.01/100;
					break;
				}
			}
		return comision;		
	}
	
	
	public String toString(){
		StringBuilder sb;
		sb = new StringBuilder();
		sb.append("Tarjeta # "+numTarjeta+"\n");
		sb.append("		Cuenta: "+numCuenta+"\n");
		sb.append("		Tipo: "+tipo+"\n");
		sb.append("		Categoria: "+categoria+"\n");
		sb.append("		Anio Adquisicion: "+anioAdquisicion+"\n");
		sb.append("		Anio vencimiento: "+anioVencimiento+"\n");
		sb.append("		Limite de credito: "+limiteCredito+"\n");
		return sb.toString();
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCategoria() {
		return categoria;
	}

	public int getAnioAdquisicion() {
		return anioAdquisicion;
	}

	public int getAnioVencimiento() {
		return anioVencimiento;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public boolean equals(Tarjeta t){
		boolean resp=false;
		if(this.numTarjeta==t.numTarjeta)
			resp=true;
		return resp;
	}
	
	public int compareTo(Tarjeta t){
		int resp=0;
		if(this.numTarjeta > t.numTarjeta)
			resp=1;
		else
			if(this.numTarjeta < t.numTarjeta)
				resp=-1;
		return resp;
	}
}
