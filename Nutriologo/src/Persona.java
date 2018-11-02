/*
 * Diego Hernández Delgado
 * (01/09/2018)
 * Clase que crea pasientes
 */
public class Persona {
	private int numPaciente;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;
	private char sexo;
	private double peso;
	private double estatura;
	private int nivelActividad;
	private static int folio= 0;
	private int clave;
	
	public Persona(){
		folio++;
		clave=folio;
	}
	
	public Persona(int numPaciente, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, char sexo, double peso, double estatura, int nivelActividad){
		this();
		this.numPaciente=numPaciente;
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=peso;
		this.estatura=estatura;
		this.nivelActividad=nivelActividad;
	}

	public int getNumPaciente() {
		return numPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public int getNivelActividad() {
		return nivelActividad;
	}
	
	public int getClave(){
		return clave;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public void setNivelActividad(int nivelActividad) {
		this.nivelActividad = nivelActividad;
	}

	@Override
	public String toString() {
		return "Persona /nnumPaciente=" + numPaciente + "/n nombre=" + nombre + "/n apellidoPaterno=" + apellidoPaterno
				+ "/n apellidoMaterno=" + apellidoMaterno + "/n edad=" + edad + "/n sexo=" + sexo + "/n peso=" + peso
				+ "/n estatura=" + estatura + "/n nivelActividad=" + nivelActividad+ "\n Clave= "+clave;
	}
	
	public boolean equals(Persona otra){
		boolean resp;
		if(this.numPaciente==otra.numPaciente)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(Persona otra){
		int resp;
		if(this.numPaciente==otra.numPaciente)
			resp=0;
		else
			if(this.numPaciente>otra.numPaciente)
				resp=1;
			else
				resp=1;
		return resp;
	}
	
	public int calculaIMC(){
		double imc;
		int resp;
		imc=peso/ Math.pow(estatura, 2);
		
		if(imc<20)
			resp=-1;
		else
			if(imc<=25)
				resp=0;
			else
				resp=1;
		return resp;
	}
	
	public boolean esMayorEdad(){
		boolean resp;
		if(edad>=18)
			resp=true;
		else
			resp=false;
		
		return resp;
	}
	
	

}
