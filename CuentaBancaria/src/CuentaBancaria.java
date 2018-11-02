
public class CuentaBancaria {
	private int numCuenta, nip;
	private static int folio=1000;
	private String nombre;
	private double saldo;
	
	public CuentaBancaria(){
		folio++;
		numCuenta=folio;
	}
	
	public CuentaBancaria(String nombre, int nip, double saldo){
		this();
		this.nombre=nombre;
		this.nip=nip;
		this.saldo=saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(CuentaBancaria otraCuenta){
		boolean resp;
		if(this.numCuenta==otraCuenta.numCuenta)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(CuentaBancaria otraCuenta){
		int resp;
		if(this.numCuenta==otraCuenta.numCuenta)
			resp=0;
		else
			if(this.numCuenta>otraCuenta.numCuenta)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		
	sb.append("Cuenta Bancaria: "+numCuenta+"\n");
	sb.append("  Nombre: "+nombre+"\n");
	sb.append("  Saldo: "+saldo+"\n");
	
	return sb.toString();
	}
	
	//Función depósito:
	public String deposito(double cantidad){
		StringBuilder sb;
		sb= new StringBuilder();
		
		if(cantidad<50)
			sb.append("Error: la cantidad debe ser mayor a $50");
		else{
			this.saldo=this.saldo+cantidad;
			sb.append("Depósito realizado con éxito.");
		}
		
		return sb.toString();
	}
	
	//Función retiro:
	public String retiro(double cantidad){
		StringBuilder sb;
		sb=new StringBuilder();
		
		if(cantidad>this.saldo)
			sb.append("Error: la cantidad a retirar debe ser menor al saldo");
		else{
			if(cantidad>3000)
				sb.append("Error: el retiro no puede ser mayor a $3,000");
			else{
				if(cantidad%50!=0)
					sb.append("Error: la cantidad a retirar debe ser múltiplo de $50");
				else{
					sb.append("Su retiro se ha realizado con éxito.");
					saldo=saldo-cantidad;
				}
			}
		}
		return sb.toString();
		}

}
