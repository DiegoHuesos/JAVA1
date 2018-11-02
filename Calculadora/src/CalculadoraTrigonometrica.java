
public class CalculadoraTrigonometrica {

	//Calcula Seno:
	public static double seno(double x){
		double seno=0;
		int i=1;
		do{
			seno=seno+( Math.pow(x, i) / Calculadora.calculaFactorial(i) );
			i=i+2;
		} while (seno>0.0001);
		
		return seno;
	}
	
	//Calcula Coseno:
	public static double cos(double x){
		double cos=0;
		int i=0;
		
		do{
			cos=cos+ ( Math.pow(x, i) / Calculadora.calculaFactorial(i) );
			i=i+2;
		} while (cos>0.0001);
		
		return cos;
	}
	
	//Calcula Tangente:
	public static double tan(double x){
		double tan;
		tan= (CalculadoraTrigonometrica.seno(x)) / (CalculadoraTrigonometrica.cos(x));
		return tan;
	}
	
	//Calcula Cotangente:
		public static double cot(double x){
			double cot;
			cot=  (CalculadoraTrigonometrica.cos(x)) / (CalculadoraTrigonometrica.seno(x));
			return cot; 
		}
	
	
	
}
