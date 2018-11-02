import java.util.Scanner;
public class ejecutableNutriologa {

	public static void main(String[] args) {
		
		Persona pac1, pac2, pac3;
		Scanner lectura;
		int resImc1;
		
		lectura=new Scanner(System.in);
		
		pac1= new Persona(100,"Irma", "Lozano", "Mendicuti", 20, 'F', 95, 1.65,2);
		
		pac2= new Persona(100,"Diego", "Gómez", "Gamper", 19, 'M', 75, 1.70,3);

		pac3= new Persona(100,"Lupita", "Moreno", "Partida", 20, 'F', 63, 1.60,1);
		
		resImc1=pac1.calculaIMC();
		System.out.println(resImc1);
		
		if(resImc1==0)
			System.out.println("Peso ideal. Yeah!");
		else
			if(resImc1<0)
				System.out.println("¡Debes comer más!");
			else
				System.out.println("Tienes sobre peso. :(");
			
		System.out.println("pac1="+pac1.getClave());
		System.out.println("pac2="+pac2.getClave());
		System.out.println("pac3="+pac3.getClave());
		
		if(pac1.esMayorEdad())
			System.out.print("Sí es mayor de edad");
		else
			System.out.print("Todavía no.");
		
		
	}
	



}
