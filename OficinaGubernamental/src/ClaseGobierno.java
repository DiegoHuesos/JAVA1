
public class ClaseGobierno {

	public static void main(String[] args) {
		String edoMayorPoblacion;
		double promHabitNacional;
		int edoPoblMenorProm;
			
		OficinaGobierno gobMex= new OficinaGobierno("Lic. MArtin Cuenta");
			
		edoMayorPoblacion=gobMex.edoMayorPoblacion();
		
		promHabitNacional=gobMex.promedioHabitantes();

		edoPoblMenorProm=gobMex.numEdoMenorAlProm(promHabitNacional);

		System.out.println("a) Nombre del estado con mayor población: "+edoMayorPoblacion);
		System.out.println("b) Promedio de habitantes a nivel nacional: "+promHabitNacional);
		System.out.println("c) Total de estados que tienen una poblacion menor al promedio: "+edoPoblMenorProm);
	}

}
