//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 11/09/2018
//Clase ZooEjecutabble

public class ZooEjecutable {

	public static void main(String[] args) {
		Zoologico z1 = new Zoologico("Itafari", 3, 3);
	
		System.out.println(z1.altaSerpiente("Cascabel", "Verde",  "ratones", 0));
		z1.altaSerpiente("Cascabel", "Morada",  "ratones", 0);
		z1.altaSerpiente("Anaconda", "Negra",  "toros", 1);
		z1.altaSerpiente("Anacando", "Morada",  "vacas", 1);
		z1.altaSerpiente("Boa", "Amarillo",  "ratones", 2);
		
		System.out.println("DATOS: "+z1.datos(101)+"\n");
		
		System.out.println("Cantidad de serpientes que comen ratones: "+z1.numAlimento("ratones")+"\n");
		
		System.out.println(z1.bajaSerpiente(104, 2));
	}

}
