/*Diego Hernández Delgado (176262)
 * (14-10-2018)
 * Tarea: Agencia Automotriz
 * Clase Ejecutable: "VendeAutos"
 */
public class VendeAutos {

	static final int MARCAS=3;
	static final int AUTOS=2;
	
	
	public static void main(String[] args) {
		String[] nomMarcas;
		Auto[] autos;
		AgenciaAutomotriz agencia1;
		
		nomMarcas= new String[MARCAS];
			nomMarcas[0]="Honda";
			nomMarcas[1]="Nissan";
			nomMarcas[2]="Kia";
		
		autos= new Auto[AUTOS];
			autos[0]= new Auto("Nissan","Altima", 2018, "negro");
			autos[1]= new Auto("Honda","CR-V", 2019, "blanco");
			autos[2]= new Auto("Kia","Brisa", 2000, "azul");
			autos[3]= new Auto("Nissan","X-Trail", 2010, "arena");
		
		agencia1= new AgenciaAutomotriz("AgenciaITAM", "Rio Hndo", MARCAS, nomMarcas, AUTOS, autos);
		

	}

}
