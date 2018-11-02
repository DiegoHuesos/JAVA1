
public class PruebaCientificoMat {

	public static void main(String[] args) {
		CientificoMatematico inv1, inv2;
		int a, b;
		
		inv1=new CientificoMatematico("Monse", "Mate", 57);
		inv2=new CientificoMatematico("Samir", "Quimica",30);
		
		System.out.println(inv1.toString());
		System.out.println(inv2.toString());
		
		System.out.println("¿Los cientificos son iguales?");
		if(inv1.equals(inv2))
			System.out.println("Sí\n");
		else
			System.out.println("No\n");
		
		//ejercicio 7:
		if(inv1.compareTo(inv2)<0)
			System.out.println(inv1.getNombre()+" es mayor");
		else
			if(inv1.compareTo(inv2)>0)
				System.out.println(inv1.getNombre()+" es menor");
			else
				System.out.println("son iguales");
		
		//ejercicio 8:
		a=4; 
		b=30;
	
		if(inv1.esteOrdenCreciente(a, b))
			System.out.println("\n Sí está en orden");
		else
			System.out.println("\n No está en orden");
		
		System.out.println(inv1.ordenaCreciente(a, b));
		
		//Ejercicio 9:
		System.out.println(inv1.esImpar(4));
		
		//Ejercicio 11:
		System.out.println(inv1.calculaFuncion1(40));
		
		//Ejercicio 12:
		System.out.println(inv1.calculaFuncion2(17));
		
		//Ejercicio 13:
		System.out.println(inv1.calculaFuncion3(8,2));

	}

}
