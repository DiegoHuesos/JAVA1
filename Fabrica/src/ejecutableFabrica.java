import java.util.*;
public class ejecutableFabrica{

/*
* Diego Hernandez Delgado 176262
* 25/10/2017
* Clase para probar la funcionalidad de la fabrica
*/
public static void main(String[] args) {
Scanner lectura;
Fabrica unaFabrica;
char resp;
double radio, tela, costo, venta, circ, costoCirc, ventaCirc;
unaFabrica=new Fabrica("Alfombras Voladoras SA de CV", "Azcapotzalco");


lectura=new Scanner(System.in);

System.out.println("Quieres un tapete S/N");
resp=lectura.next().charAt(0);
while(resp=='S'){
	
System.out.println("Dame el radio del tapete: ");
radio=lectura.nextDouble();
unaFabrica.altaTapete(radio);

circ=Math.PI*(Math.pow(radio, 2));
costoCirc=(circ*250)+56;
ventaCirc=costoCirc*1.25;
System.out.print("Este tapete te costará: $ "+ventaCirc+"\n \n");

System.out.println("Quieres un tapete S/N");
resp=lectura.next().charAt(0);
}

tela=unaFabrica.calculaTela();
System.out.println("Necesitas "+tela+" m2.");
costo=unaFabrica.calculaCosto();
System.out.println("Costo "+costo);
venta=unaFabrica.calculaVenta();
System.out.println("Venta "+tela);
}

}

