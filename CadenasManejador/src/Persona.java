//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 14/11/2018
//Ejercicio 6
//Clase Persona para trabajar con el curp (cadena-String)

public class Persona {
	//Atributos:
	private String nombre;
	private String curp;
	
	//Constructor:
	public Persona(String nombre, String curp){
		this.nombre=nombre;
		this.curp=curp;
	}
	
	//5.a) Género:
	public String obtenGenero(){
		String resp;
		char genero= curp.charAt(10);
		if(genero== 'H')
			resp="masculino";
		else
			resp="femenino";
		return resp;
	}
	
	
	//5.b) Edad:
	public int obtenEdadCurp(){
		int anio= Integer.parseInt( curp.substring(4, 6) );
		int edad;
		if(anio>18)
			edad=118-anio;
		else
			edad=18-anio;
		return edad;
	}
	
	//5.c) Nacional o extranjero:
	public boolean esMexicano(){
		boolean resp = false;
		if(!curp.substring(11, 13).equals("NE"))
			resp=true;
		return resp;
	}
	
	
//MAIN-CLASS:
	
	public static void main(String [] args){
		
		Persona sujeto = new Persona("Diego", "HEDD980615HDFHDG09");
		
		System.out.println("Nombre: "+sujeto.nombre);
		System.out.println("Género: "+sujeto.obtenGenero());
		System.out.println("Edad: "+sujeto.obtenEdadCurp());
		System.out.println("Edad: "+sujeto.esMexicano());
	
	}
	
}
