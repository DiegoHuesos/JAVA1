
public class Hospital {
	private String nombre;
	private String direccion;
	private Doctor[] arregloDoctores;
	private final int MAX=50;
	private int numDoctores;
	
	public Hospital(String nombre){
		this.nombre=nombre;
		arregloDoctores=new Doctor[MAX];
		numDoctores=0;
	}
	
	public Hospital(String nombre, String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		arregloDoctores=new Doctor[MAX];
		numDoctores=0;
	}
	
	public int getNumDoctores(){
		return numDoctores;
	}
	
	public boolean altaDocotro(String nombre){
		boolean resp=false;
		Doctor unDoc;
		if(numDoctores<MAX){
			int i=0;
			while(i<numDoctores)
				i++;
			if(i==numDoctores){
				unDoc=new Doctor (nombre);
				arregloDoctores[numDoctores]=unDoc;
				numDoctores++;
				resp=true;
			}
		}
		return resp;
	}

	public String bajaDoctor(int id){
		String resp;
		int i=0;
		while(i<numDoctores && arregloDoctores[i].getId() != id)
			i++;
		if(i<numDoctores){
			resp=arregloDoctores[i].toString();
			for(int e=i; e<numDoctores; e++)
				arregloDoctores[e]=arregloDoctores[e+1];
			arregloDoctores[numDoctores]=null;
			numDoctores--;
		}
		else
			resp="No está en lista.";
		
		return resp;
	}
	
	public boolean altaEspecialidad(String nombre, String especialidad){
		boolean resp=false;
		int i=0;
		while(i<numDoctores && !arregloDoctores[i].equals(nombre))
			i++;
		if(i==numDoctores){
			arregloDoctores[i].agregaEspecialidades(especialidad);
			resp=true;
		}
		return resp;
	}
	
	
}
