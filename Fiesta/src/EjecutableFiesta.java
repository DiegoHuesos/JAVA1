import java.util.*;
public class EjecutableFiesta {

	public static void main(String[] args) {
		Fiesta miFiesta;
		Scanner lectura;
		String nombre, dir, tel, email;
		int edad, i, c, p;
		char genero;
		boolean resp;
		
		miFiesta=new Fiesta("Ajusco", "11-11-17");
		lectura=new Scanner(System.in);
		for(i=1;i<=3;i++){
			System.out.println("Dame la información del invitado "+i+": ");
			System.out.println(" Nombre: ");
			nombre=lectura.next();
			System.out.println(" Direccion: ");
			dir=lectura.next();
			System.out.println(" Telefono ");
			tel=lectura.next();
			System.out.println(" E-mail: ");
			email=lectura.next();
			System.out.println(" Genero: ");
			genero=lectura.next().charAt(0);
			System.out.println(" Edad: ");
			edad=lectura.nextInt();
			resp=miFiesta.altaInvitado(nombre, dir, tel, email, genero, edad);
			if(resp)
				System.out.println("Alta exitosa. \n");
			else
				System.out.println("Alta NO exitosa. \n");
		}
		System.out.println(miFiesta.toString());
		c=miFiesta.calculaCervezas();
		System.out.println("Necesitas "+c+" cervezas.\n");
		p=miFiesta.calculaPizzas();
		System.out.println("Necesitas "+p+" pizzas.\n");
		
		System.out.println("Escribe el nombre del invitado que desea darse de baja: ");
		String b, info;
		b=lectura.next();
		info=miFiesta.bajaInvitado(b);
		System.out.println(info);
		
	
	}

}
