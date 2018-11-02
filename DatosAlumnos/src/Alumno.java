
public class Alumno {
	
	String nombre;
	String edad;
	double promedio;
	String carrera;
	double totalCreditosDelSem;
	int aprobadas;
	
	
	//constructor vacío:
	public Alumno(){	
	}
	
	//constructor completo:
	public Alumno(String nombre, String edad, double promedio, String carrera, double totalCreditosDelSem, int aprobadas){
		this();
		this.nombre=nombre;
		this.edad=edad;
		this.promedio=promedio;
		this.carrera=carrera;
		this.totalCreditosDelSem=totalCreditosDelSem;
		this.aprobadas=aprobadas;
	
	}
	
	//getters y setters: nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//getters y setters: edad
	public String getEdad(){
		return edad;
	}
	
	public void setEdad(String edad){
		this.edad=edad;
	}
	
	//getters y setters: promedio
	public double getPromedio(){
		return promedio;
	}
	
	public void setPromedio(double promedio){
		this.promedio=promedio;
	}
	
	//getters y setters: carrera
	
	public String getCarrera(){
		return carrera;
	}
	
	public void setCarrera(){
		this.carrera=carrera;
	}
	
	//getters y setters: totalCreditosDelSem
	public double getTotCredSem(){
		return totalCreditosDelSem;
	}
	
	public void setTotCredSem(){
		this.totalCreditosDelSem=totalCreditosDelSem;
	}
	
	//getters y setters: aprobados
	public int getAprobadas(){
		return aprobadas;
	}
	
	public void setAprobadas(int aprobados){
		this.aprobadas=aprobados;
	}
	
	public double calculaCostoSem(double costoCredito){
		double costoSem=costoCredito*totalCreditosDelSem;
		return costoSem;
		
	}	

}


