
public class MundoFruteria {

	public static void main(String[] args) {
		//Inciso a)
		Fruta fruta1, fruta2;
		fruta1= new Fruta("Manzana", "roja", "Campeche", 14.50);
		fruta2= new Fruta("Platano", "amarillo", "Veracruz", 6.85);
		
		//Inciso b)
		double desc1, desc2;
		desc1= fruta1.calculaPorcentajeDescuento(8500);
		desc2= fruta2.calculaPorcentajeDescuento(8500);
		
		System.out.println("desc1: "+desc1+" % \n");
		System.out.println("desc1: "+desc2+" % \n");
		
		
		//Inciso c)
		double costo1, costo2, descu1, descu2, costoFinal1, costoFinal2;
		
		costo1=fruta1.calculaCosto(122);
		descu1=fruta1.calculaPorcentajeDescuento(costo1);
		costoFinal1= (100-descu1)/100*costo1;
		System.out.println("Costo final de la "+fruta1.getNombre()+": $ "+costoFinal1+"\n");
		
		costo2=fruta2.calculaCosto(122);
		descu2=fruta2.calculaPorcentajeDescuento(costo2);
		costoFinal2= (100-descu2)/100*costo2;
		System.out.println("Costo final de la "+fruta2.getNombre()+": $ "+costoFinal2+"\n");
		
		//Inciso d)
		fruta1.toString();
		fruta2.toString();
		
		//Inciso e)
		if(fruta1.compareTo(fruta2)>0)
			System.out.println("La "+fruta1.getNombre()+" es mayor o fue después que el "+fruta2.getNombre());
		else
			System.out.println("El "+fruta2.getNombre()+" es mayor o fue después que la "+fruta1.getNombre());
	}

}
