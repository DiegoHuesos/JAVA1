//Diego Hernandez Delgado
//176262
//06/11/2017
//Encriptacion: examen control


public class Encriptado {
	
//char a int
	public static int[] convierteCharAInt(char[] a, int n){
		int i;
		int mInt[];
		
		mInt=new int[n];
		for(i=0; i<n; i++)
			mInt[i]=(int)a[i];
		return mInt;
	}
	
//int a char
	public static char[] convierteIntAChar(int[] a, int n){
		int i;
		char mChar[];
		
		mChar=new char[n];
		for(i=0; i<n; i++)
			mChar[i]=(char)a[i];
		return mChar;
	}
	
//imprime Arreglo
	 public static void imprimeArreglo(int a[], int n){
		  int i;
		  for(i=0; i<n;i++)
		   System.out.print(a[i]+" ");
		  System.out.println();
		 }
	 
//imprime arreglo de chars
	 public static void imprimeArregloChar(char a[], int n){
		  int i;
		  for(i=0; i<n;i++)
		   System.out.print(a[i]+" ");
		  System.out.println();
		 }
	
//generador aleatorio de arreglo de encriptaciones
	 public static int[] creaEncriptaciones(){
		 int[] encriptaciones;
		 int i;
		 int n=(int)(Math.random()*10) + 1;
		 encriptaciones= new int [n];
		 for(i=0;i<n;i++){
			 encriptaciones [i]=(int)(Math.random()*4+1);}
		 return encriptaciones;
	 }
	 

//encriptadoción
	 public static void encriptado1(int a[], int n){
		 int i;
		 for (i=0;i<n;i++)
			a[i]=a[i]-3; 
	 }
	 
	 public static void desencriptado1(int a[], int n){
		 int i;
		 for (i=0;i<n;i++)
			 a[i]=a[i]+3;
	 }
	 	
	 public static void encriptado2(int a[], int n){
		 int mod, i, modi = 0;

		 mod= Math.floorMod(a[0], 2);
			if(mod==0)
				for (i=0;i<n;i++){
					modi= Math.floorMod(a[i], 2);
					if (modi==0)
					a[i]=a[i]*2;
					}
			
			else 
			{ for (i=0;i<n;i++){
					modi= Math.floorMod(a[i], 2);
					if (modi!=0)
					a[i]=a[i]*3;}
			}
	 }
	 
	 public static void desencriptado2(int a[], int n){
		 int mod, i, modi = 0;
		 mod= Math.floorMod(a[0], 2);
			if(mod==0)
				for (i=0;i<n;i++){
					modi= (a[i]% 2);
					if (modi==0)
					a[i]=a[i]/2;}
			
			else 
			{ for (i=0;i<n;i++){
					modi= (a[i]% 2);
					if (modi!=0)
					a[i]=a[i]/3;}
			}
	 }
	 
	 public static void encriptado3(int a[], int n){
		 int i, ult;
		 ult= a[n-1];
		 for(i=0;i<n-1;i++)
			 a[n-1-i]=a[n-2-i];
		 a[0]=ult;
	 }
	 
	 public static void desencriptado3(int a[], int n){
		 int i, prim;
		 prim= a[0];
		 for(i=0;i<n-1;i++){
			 a[i]=a[i+1];
		 }
		 a[n-1]=prim;
	 }
	 
	 public static void encriptado4(int a[], int n){
		 int i, b=0;
		 for (i=0;i<(n/2);i++){
			 b= a[i];
			 a[i]=a[n-1-i];
			 a[n-1-i]=b; 	
		 }
	 }
	 
	 public static void desencriptado4(int a[], int n){
		 int i, b=0;
		 for (i=0;i<(n/2);i++){
			 b= a[i];
			 a[i]=a[n-1-i];
			 a[n-1-i]=b; 	
		 }
		 
		 

	 }

	////////////////////////////////////////////////////////
	
	public static void main(String[] args){
		char[] mensaje={'¡','F','e','l','i','c','e','s',' ','v','a','c','a','c','i','o','n','e','s','!'};
		int[] mensajeInt;
		int n=mensaje.length;
		mensajeInt= new int [mensaje.length];
		mensajeInt=convierteCharAInt(mensaje,n);
		imprimeArreglo(mensajeInt, mensajeInt.length);	
		imprimeArregloChar(mensaje, n);
		System.out.println();
		
		//encriptador
		int[] encriptaciones = creaEncriptaciones();
		for(int i=0;i<encriptaciones.length;i++){
			switch(encriptaciones[i]){
			case 1:
				encriptado1(mensajeInt, n);
				break;
			case 2:
				encriptado2(mensajeInt, n);
				break;
			case 3:
				encriptado3(mensajeInt, n);
				break;
			case 4:
				encriptado4(mensajeInt, n);
				break;
			}
		}
		
		imprimeArreglo(mensajeInt,n);
		imprimeArregloChar(convierteIntAChar(mensajeInt, n), n);
		System.out.println();
		
		//desencriptador
		
		for(int i=encriptaciones.length-1; i>=0; i--){
			switch(encriptaciones[i]){
			case 1:
				desencriptado1(mensajeInt, n);
				break;
			case 2:
				desencriptado2(mensajeInt, n);
				break;
			case 3:
				desencriptado3(mensajeInt, n);
				break;
			case 4:
				desencriptado4(mensajeInt, n);
				break;
			}
	}
		imprimeArreglo(mensajeInt,n);
		imprimeArregloChar(convierteIntAChar(mensajeInt, n), n);
	}}
