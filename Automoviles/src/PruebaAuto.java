import java.util.Scanner;
public class PruebaAuto {
	
	public static void main(String[] args){
		
		Automoviles a1, a2, a3;
		double monto1, monto2;
		Scanner lectura=new Scanner(System.in);
		a1=new Automoviles("Nissan", 2010, 54000, "Pedro Fuentes", 56879);
		a2=new Automoviles("BMV", 2000, 102000, "Beto Pedroza", 98560);
		a3=new Automoviles("Lamborghini", 2018, 1000, "Ferucco Lamborghini", 56879);
		
		monto1= a1.calculaMonto(14);
		monto2= a3.calculaMonto(18);
	
		System.out.println("Monto auto 1: "+monto1+"\n");
		System.out.println("Monto auto 2: "+monto2+"\n");
		
		//Devolucion:
		System.out.println(a2.devolverAuto(150));
	}

}
