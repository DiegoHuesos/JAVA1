import java.util.*;

public class Doctor {
	private static int folio=0;
	private String nombre;
	private int edad, clave;
	private ArrayList<String> especialidades;
	
	Doctor(){
		folio=folio+1;
		clave=folio;
		especialidades = new ArrayList<String>();
	}
	
	Doctor(String nombre, int edad){
		this();
		this.nombre=nombre;
		this.edad=edad;
	}
	

}
