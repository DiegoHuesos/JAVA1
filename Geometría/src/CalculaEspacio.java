/*
 * DiegoHernández Delgado
 * (176262)
 * Fecha:17/09/2018
 * Programación en JAVA.- Ejercicio 3
 */
public class CalculaEspacio {

	public static void main(String[] args) {
		Rectangulo mesa1, mesa2, mesa3;
		double espacioOcupado;
		
		mesa1= new Rectangulo(2, 1.8);
		mesa2= new Rectangulo(1, 1.5);
		mesa3= new Rectangulo(3, 2);
		
		espacioOcupado= mesa1.calculaArea()+mesa2.calculaArea()+mesa3.calculaArea();
		
		System.out.print("El espacio ocupado por las 3 mesas: "+espacioOcupado+" m2");

	}

}
