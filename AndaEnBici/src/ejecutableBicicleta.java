import java.util.Scanner;
public class ejecutableBicicleta {

	public static void main(String[] args) {
		Bicicleta bici1, bici2;
		Scanner lectura;
		
		lectura=new Scanner(System.in);
		
		bici1=new Bicicleta('M', 4, "aluminio");
		bici2=new Bicicleta('P', 0, "fibra de carbono");
		
		System.out.println("¡Bienvenido a 'Anda en bici'!\n");
		System.out.println("Bicicletas en existencia:\n");
		
		System.out.println("->Bici1:\n  "+bici1.toString()+"\n");
		System.out.println("Costo bici1: "+bici1.calculaCosto()+"\n");
		
		System.out.println("->Bici2:\n  "+bici2.toString()+"\n");
		System.out.println("Costo bici2: "+bici2.calculaCosto()+"\n");
		
		System.out.print("Dame el nuevo número de accesorios de la bici2:");
		bici2.setNumAcc(lectura.nextInt());
		
		System.out.println("\n->Bici2:\n  "+bici2.toString()+"\n");
		System.out.println("Costo bici2: "+bici2.calculaCosto()+"\n");
		
		
		System.out.println("¿La bici1 es igual a la Bici2?\n "+bici1.equals(bici2)+"\n");
		System.out.println("¿La bici1 es más nueva(1), más vieja(-1) ó es la misma que la Bici2?\n  '"+bici1.compareTo(bici2)+"'\n");
		
		

	}

}
