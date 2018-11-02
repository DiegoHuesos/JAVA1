
public class EjecCalcTrigonometrica {

	public static void main(String[] args) {
		System.out.println("hola");
		
		double seno, cos, tan, cot;
		
		seno=CalculadoraTrigonometrica.seno((Math.PI)/2);
		cos=CalculadoraTrigonometrica.cos((Math.PI)/2);
		tan=CalculadoraTrigonometrica.tan((Math.PI)/2);
		cot=CalculadoraTrigonometrica.cot((Math.PI)/2);
		
		System.out.println("Seno de Pi/2 es: "+seno+"\n");
		System.out.println("Coseno de Pi/2 es: "+cos+"\n");
		System.out.println("Tangente de Pi/2 es: "+tan+"\n");
		System.out.println("Cotangente de Pi/2 es: "+cot+"\n");
	}

}
