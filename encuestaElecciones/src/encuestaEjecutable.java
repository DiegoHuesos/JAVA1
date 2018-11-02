import java.util.Scanner;

public class encuestaEjecutable {
	
	/*
	 * Diego Hernández Delgado (176262)
	 * Tarea: Retos algorítmica
	 * Ejercicio 2: Encuesta de elleciones políticas
	 * Fecha: 07-sep-2018 
	 */  
	
	public static void main (String[]args){
		
		//Declaro el tipo de qué tipo son las variables:
		int abst, pan, prd, pri, morena, n, partido;
		char resp;
		String fav;
		Scanner lectura;
		
		//Iniciaizo/instancio las variables:
		abst=0;
		pan=0;
		prd=0;
		pri=0;
		morena=0;
		lectura= new Scanner(System.in);
		
		//Pregunto cuántas personas van a votar:
		System.out.println("Ingrese el número de personas que se va a encuestar:");
		n=lectura.nextInt();
		
		//Se establece un for para preguntar a cada participante si va a votar y por qué partido lo hará:
		for(int i=1; i<=n; i++){
			
			//Leo el primer valor para saber si votarán o no:
			System.out.println("Escriba 'S' o 's' si usted votará o escriba 'N' o 'n' si se abstendrá del voto:");
			resp=lectura.next().charAt(0);
			
			//Se pregunta si se votará o se abstebdrá del voto:
			if(resp=='S'|resp=='s'){
				
				//Se lee el partido por el cuál se votará:
				System.out.println("¿Por qué partido político votará en las próximas elecciones?");
				System.out.println("   PAN = 1     PRD = 2     PRI = 3     MORENA = 4     ");
				System.out.println("Escriba el número asignado al partido de su prefernecia:");
				partido=lectura.nextInt();
				
				switch(partido){
				
				case 1:
					pan++;
					break;
				case 2:
					prd++;
					break;
				case 3:
					pri++;
					break;
				case 4:
					morena++;
					break;
					
					default:
						System.out.println("Respuesta invalida.");
						i--;	
				}	
			}
			else{
				if(resp == 'N' | resp=='n' ){
					abst++;					
				}
				else{
					System.out.println("Respuesta invalida.");
					i--;
				}
			}
		}
		
		if(pan>=prd && pan>=pri && pan>=morena){
			fav="PAN";
		} 
		else{
			if(prd>=pri && prd>=morena){
				fav="PRD";
			}
			else{
				if(pri>=morena){
					fav="PRI";
				}
				else{
					fav="MORENA";
				}
			}
		}
		double pAbst=abst*100/n;
		double pPan=pan*100/n;
		double pPrd=prd*100/n;
		double pPri=pri*100/n;
		double pMor=morena*100/n;
		
		System.out.println("Resultados:");
		System.out.println("Abstenciones: "+pAbst+" %");
		System.out.println("Votos para el PAN: "+pPan+" %");
		System.out.println("Votos para el PRD: "+pPrd+" %");
		System.out.println("Votos para el PRI: "+pPri+" %");
		System.out.println("Votos para MORENA: "+pMor+" %");
		System.out.println("Partdio favorito :"+fav);
		
		if(pan==0){
			System.out.println("PAN no obtuvo votos.");
		}
		if(prd==0){
			System.out.println("PRD no obtuvo votos.");
		}
		if(pri==0){
			System.out.println("PRI no obtuvo votos.");
		}
		if(morena==0){
			System.out.println("MORENA no obtuvo votos.");
		}
	}
	
}