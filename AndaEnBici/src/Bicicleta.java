
public class Bicicleta {
	private static int folio=200;
	private int id;
	private char tipo;
	private int numAcc;
	private String material;
	
	public Bicicleta(){
		folio=folio+1;
		id=folio;
	}
	
	public Bicicleta(char tipo, String material){
		this();
		this.tipo=tipo;
		this.material=material;
	}
	
	public Bicicleta(char tipo, int numAcc, String material){
		this();
		this.tipo=tipo;
		this.numAcc=numAcc;
		this.material=material;
	}
	
	public double calculaCosto(){
		double costoBase, costoTotal;
		costoBase=0;
		costoTotal=0;
		
		if(tipo=='U')
			costoBase=700;
		else
			if(tipo=='P')
				costoBase=15000;
			else
				costoBase=27000;
		
		if(material=="aluminio")
			costoTotal=costoBase+2000;
		else
			costoTotal=costoBase+5000;
		
		if(numAcc==3 || numAcc==4)
			costoTotal=costoTotal+600;
		else
			if(numAcc>4)
				costoTotal=costoTotal+1000;
		
		return costoTotal;	
	}
	
	public void setNumAcc(int nuevoNumAcc){
		numAcc=nuevoNumAcc;
	}
	
	public int getId(){
		return id;
	}
	
	public char getTipo(){
		return tipo;
	}
	
	public int getNumAcc(){
		return numAcc;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public boolean equals(Bicicleta otraBici){
		boolean resp;
		if(id==otraBici.id)
			resp=true;
		else
			resp=false;	
		return resp;
	}
	
	public int compareTo(Bicicleta otraBici){
		int resp;
		if(id==otraBici.id)
			resp=0;
		else
			if(id>otraBici.id)
				resp=1;
			else
				resp=-1;
		return resp;
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		
		sb.append("Bicicleta #: "+id+"\n");
		sb.append("  -Tipo: "+tipo+"\n");
		sb.append("  -# acc. extras: "+numAcc+"\n");
		sb.append("  -Material: "+material+"\n");
		
		return sb.toString();	
	}

}
