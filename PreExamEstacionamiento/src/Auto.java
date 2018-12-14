import java.util.ArrayList;
public class Auto {
	private String marca;
	private int anio;
	private String modelo;
	private String placas;
	private char tipo;
	private ArrayList<String> mesesConServicio;
	private ArrayList<String> serviciosRealizados;
	private Persona duenio;
	private int piso;
	private int lugar;
	private String color;
	
	public Auto(String marca, int anio, String modelo, String placas, char tipo, int piso, int lugar, String color, String nombre, int edad, char sexo){
		this.marca= marca;
		this.anio=anio;
		this.modelo=modelo;
		this.placas=placas;
		this.tipo=tipo;
		this.mesesConServicio=new ArrayList<String>();
		this.serviciosRealizados=new ArrayList<String>();
		this.piso=piso;
		this.lugar=lugar;
		this.color=color;
		this.duenio= new Persona(nombre, edad, sexo);
	}
	
	

	public boolean equals(Auto otro){
		boolean resp=false;
		if(this.placas.equals(otro.placas))
			resp=true;
		return resp;
	}
	public int compareTo(Auto otro){
		int resp=0;
		if(placas.compareTo(otro.placas)>0)
			resp=1;
		else
			if(placas.compareTo(otro.placas)<0)
				resp=-1;
		return resp;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Marca: "+marca+"\n");
		sb.append("Anio: "+anio+"\n");
		sb.append("Modelo: "+modelo+"\n");
		sb.append("Placas: "+placas+"\n");
		sb.append("Tipo: "+tipo+"\n");
		sb.append(duenio.toString());
		sb.append(mesesConServicio.toString()+"\n");
		sb.append(serviciosRealizados.toString()+"\n");
		return sb.toString();
	}

	public String getMarca() {
		return marca;
	}

	public int getAnio() {
		return anio;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlacas() {
		return placas;
	}

	public char getTipo() {
		return tipo;
	}
	public String getColor(){
		return color;
	}
	public ArrayList<String> getMesesConServicio() {
		return mesesConServicio;
	}

	public ArrayList<String> getServiciosRealizados() {
		return serviciosRealizados;
	}

	public int getPiso(){
		return piso;
	}
	public int getLugar(){
		return lugar;
	}
	public Persona getDuenio() {
		return duenio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public void setMesesConServicio(ArrayList<String> mesesConServicio) {
		this.mesesConServicio = mesesConServicio;
	}

	public void setServiciosRealizados(ArrayList<String> serviciosRealizados) {
		this.serviciosRealizados = serviciosRealizados;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	
	
	
	
	
}
