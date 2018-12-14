/*Diego Hernandez Delgado
 * Clave unica: 176262
 * Fecha: 13/12/2018
 * EXAMEN FINAL
 */

//CLASE AGENCIA DE INTELIGENCIA
public class AgenciaDeInteligencia {

	//ATRIBUTOS
	private String nombre;
	private String nomResponsable;
	
	
	//CONSTRUCTOR
	public AgenciaDeInteligencia(String nombre, String nomResponsable) {
		this.nombre=nombre;
		this.nomResponsable=nomResponsable;
	}

	//MÉTODO COMPRIMIR
	public String comprimir(String str) {
		String res="";
		
		if(str.equals(""))
			res="";
		else {
			int cont=0;
			for(int i=0; i<str.length(); i++) {
				if(i==0) {
					res+=str.charAt(i);
					cont=1;
				}
				else
					if(str.charAt(i)==str.charAt(i-1))
						cont++;
					else {
						res+=cont;
						res+=str.charAt(i);
						cont=1;
					}
			}
			res+=cont;
		}
		
		
		return res;
	}
	
	

	//MAIN PARA PROBAR LA SOLUCION
	public static void main(String[]args) {
		
		AgenciaDeInteligencia a1= new AgenciaDeInteligencia("A1", "Diego");
	
		System.out.println("aabccccaaa");
		System.out.println(a1.comprimir("aabccccaaa")+"\n");
		
		System.out.println("abcd");
		System.out.println(a1.comprimir("abcd")+"\n");
		
		System.out.println("ajjjjjjkkumtbb");
		System.out.println(a1.comprimir("ajjjjjjkkumtbb")+"\n");
		
		System.out.println("");
		System.out.println(a1.comprimir("")+"\n");
	
	}
	
}
