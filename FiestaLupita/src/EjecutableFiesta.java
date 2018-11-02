import java.util.Scanner;

public class EjecutableFiesta {

	public static void main(String[] args) {
		Fiesta miFiesta;
		Scanner lectura= new Scanner(System.in);
		String nombre, direccion;
		char genero;
		int edad, invitar;
		boolean resp;
		int comida;
		
		miFiesta= new Fiesta("Graduacion", "Plaza Roja");
		System.out.println("¿Cuántos personas deseas invitar?");
		invitar=lectura.nextInt();
		
		for(int i=0; i<invitar; i++){
			System.out.println("Nombre: ");
			nombre=lectura.nextLine();
			System.out.println("Direccion: ");
			direccion=lectura.nextLine();
			System.out.println("Genero: ");
			genero=lectura.next().charAt(0);
			System.out.println("Edad: ");
			edad=lectura.nextInt();
			
			resp=miFiesta.altaInvitado(nombre, direccion, genero, edad);
			if(resp)
				System.out.println("Invitado registrado");
			else
				System.out.println("No registrado");
		}
		System.out.println(miFiesta.toString());
		
		comida=miFiesta.calculaPizzas();
		System.out.println("Debes comprar "+comida+" pizzas;");
	}

}
