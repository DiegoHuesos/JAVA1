
public class Ejercicio6 {
	
	public static String cubosNicomaco(int n){
		StringBuilder stb= new StringBuilder();
		int cont=1, suma=0;
		
		for (int i=1; i<=n; i++){
			stb.append("El cubo "+i+" es: ");
			for(int k=0; k<i; k++){
				suma=suma+cont;
				stb.append(cont+" + ");
				cont += 2;
			}
			stb.append("="+suma+"\n");
			suma=0;
		}
		return stb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(cubosNicomaco(5));

	}

}
