
/*
 * Diego Hernandez Delgado
 * 176262
 * Examen
 */
public class PruebRosticeria {

	public static void main(String[] args) {
		Rosticeria miRosti= new Rosticeria("miRosticeria", 55667788, "HREF768O");
		
		miRosti.altaPlatillo("Ensalada verde", 'I', 63);
		miRosti.altaPlatillo("Pozole", 'V', 120);
		miRosti.altaPlatillo("Tortilla espaÒola", '-', 85);
		
		System.out.println("El total de platillos que no se producen en verano son: "+miRosti.totalNoSeElaboran('V'));
		
		boolean resp= (miRosti.platilloCuesteMenos(70.0));
		if(resp)
			System.out.println("Si existe un platillo mas barato que $70");
		else
			System.out.println("NO hay mas barato que $70");
	}

}
