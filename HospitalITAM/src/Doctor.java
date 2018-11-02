import java.util.*;
public class Doctor {
	private static int folio=100;
	private int id;
	private String nombre;
	ArrayList<String> especialidades;
	
	public Doctor(){
		id=folio;
		folio++;
		especialidades=new ArrayList<String>();
	}
	
	public Doctor(String nombre){
		this();
		this.nombre=nombre;
	}
	
	public ArrayList<String> getEspecialidades(){
		return especialidades;
	}
	
	public void agregaEspecialidades(String especialidad){
		especialidades.add(especialidad);
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Doctor: "+nombre+"\n");
		sb.append("  Clave: "+id+"\n");
		sb.append("  Especialidades: "+nombre+"\n");
		//sb.append("       "+especialidades.toString()+"\n");
		for(int i=0; i<especialidades.size(); i++)
			sb.append(especialidades.get(i));
		
		return sb.toString();
	}
	
	
	public int getId(){
		return id;
	}


}
