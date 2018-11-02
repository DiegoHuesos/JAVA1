
public class Automoviles {

	private int clave;
	private int anio;
	private int numLic;
	private String marca, nombre;
	private double km;
	private static int folio=0;
	
	public Automoviles(){
		folio++;
		clave=folio;
	}
	
	public Automoviles(String marca, int anio, double km, String nombre, int numLic){
		this();
		this.marca=marca;
		this.anio=anio;
		this.km=km;
		this.nombre=nombre;
		this.numLic=numLic;
	}
	
	public double calculaMonto(int dias){
		double monto, rd, sp=0;
		if(anio<2005)
			rd=200;
		else
			rd=300;
		if(km<20000)
			sp=20;
		monto=(rd+sp)*dias;
		
		return monto;
	}
	
	public String devolverAuto(double km1){
		nombre=null;
		numLic=0;
		km=km+km1;
		
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Datos automovil devuelto: \n");
		sb.append("  Clave: "+clave+"\n");
		sb.append("  Año: "+anio+"\n");
		sb.append("  Marca: "+marca+"\n");
		sb.append("  Nombre: "+nombre+"\n");
		sb.append("  # licencia: "+numLic+"\n");
		sb.append("  Kilometraje: "+km+"\n");
		
		return sb.toString();
		
	}
}
