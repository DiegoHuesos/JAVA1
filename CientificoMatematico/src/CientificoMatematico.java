
public class CientificoMatematico {
	private String nombre;
	private String areaEspecialidad;
	private int edad;
	
	public CientificoMatematico(){
	}
	
	public CientificoMatematico(String nombre, String areaEspecialidad, int edad){
		this.nombre=nombre;
		this.areaEspecialidad=areaEspecialidad;
		this.edad=edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setAreaEspecialidad(String nuevaAreaEspecialidad){
		areaEspecialidad=nuevaAreaEspecialidad;
	}
	
	public String getAreaEspecialidad(){
		return areaEspecialidad;
	}
	
	public String toString(){
		StringBuilder sb;
		sb= new StringBuilder();
		
		sb.append("Datos del cientifico:\n");
		sb.append("   Nombre:"+nombre+"\n");
		sb.append("   Área de especialidad:"+areaEspecialidad+"\n");
		sb.append("   Edad:"+edad+"\n");
		
		return sb.toString();
	}
	
	public boolean equals(CientificoMatematico otroCientifico){
		boolean resp;
		if(nombre.equals(otroCientifico.nombre))
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public int compareTo(CientificoMatematico otroCientifico){
		int resp;
		if(nombre.equals(otroCientifico.nombre))
			resp=0;
		else
			if(nombre.compareTo(otroCientifico.nombre)>0)
			resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public boolean esteOrdenCreciente(int num1, int num2){
		boolean resp;
		if(num1<num2)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	public String ordenaCreciente(int num1, int num2){
		StringBuilder sb;
		sb=new StringBuilder();
		if(num1<num2)
			sb.append(num1+"-"+num2);
			else
				sb.append(num2+"-"+num1);
		return sb.toString();
	}
	
	public boolean esImpar(int num1){
		boolean resp;
		if( (num1 % 2) !=0)
			resp=true;
		else
			resp=false;
		return resp;
	}
	
	//Ejercicio 11:
	public double calculaFuncion1(double x){
		double y;
		
		if(x<=11)
			y=3*x+36;
		else
			if(x<=33)
				y=(x*x)-10;
			else
				if(x<=64)
					y=x+6;
				else
					y=0;
		return y;		
	}
	
	//Ejercicio 12: 
	public double calculaFuncion2(int x){
		double y=0;
		
		switch(x%4){
			case 0:
				y=(x*x);
				break;
				
			case 1:
				y=(x/6.0);
				break;
				
			case 2:
				y= Math.sqrt(x);
				break;
			
			case 3:
				y=(x*x*x)+5;
				break;
		}
		return y;
	}
	
	//Ejercicio 13:
	public double calculaFuncion3(int num, int v){
		double resp;
		
		switch(num){
		case 1:
			resp=100*v;
			break;
		case 2:
			resp=Math.pow(100,v);
			break;
		case 3:
			resp=100/v;
			break;
		default:
			resp=0;
			break;			
		}
		return resp;
	}
	
	
	
}
