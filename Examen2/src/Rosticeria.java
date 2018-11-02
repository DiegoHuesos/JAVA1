
/*
 * Diego Hernandez Delgado
 * 176262
 * Examen
 */
public class Rosticeria {
	private String nombre;
	private int telefono;
	private String rfc;
	private final int MAX_PLATILLOS=20;
	private int totalPlatillos;
	private Platillo[] datosPlatillos;
	
	public Rosticeria(String nombre, int telefono, String rfc) {
		this.nombre=nombre;
		this.telefono=telefono;
		this.rfc=rfc;
		datosPlatillos= new Platillo[MAX_PLATILLOS];
		totalPlatillos=0;
	}
	
	public void altaPlatillo(String nombre, char noSeElabora, double precio) {
		
		Platillo neoPlato;
		
		if(totalPlatillos<MAX_PLATILLOS) {
			int i=0;
			while(i<totalPlatillos && !datosPlatillos[i].getNombre().equals(nombre))
				i++;
			if(i==totalPlatillos) {
				neoPlato= new Platillo(nombre, noSeElabora, precio);
				datosPlatillos[totalPlatillos]=neoPlato;
				totalPlatillos++;
				
			}
		}
		else
			System.out.print("Ya existe el platillo");
		
	}
	
	public int totalNoSeElaboran( char noSeElabora) {
		int resp=0;
		for(int i=0; i<totalPlatillos; i++) {
			if(datosPlatillos[i].getNoSeElabora()==noSeElabora)
				resp++;
		}
		return resp;
	}
	
	public boolean platilloCuesteMenos(double precio) {
		boolean resp = false;
		int i=0;
		while (i<totalPlatillos && datosPlatillos[i].getPrecio() >= 70)
			i++;
		if(i<totalPlatillos)
			resp=true;
		
		return resp;
	}

}
