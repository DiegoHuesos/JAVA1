//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 11/09/2018
//Clase Zoologico

public class Zoologico {
	String nombre;
	Serpiente[][] espacio;
	int renOcup;
	int colOcup;
	
	public Zoologico(String nombre,int renglones, int columnas){
		this.nombre=nombre;
		espacio= new Serpiente[renglones][columnas];
	}
	
	public boolean altaSerpiente(String raza, String color, String tipoAlimento, int renglon){
		boolean resp=false;	
		Serpiente s = new Serpiente(raza, color, tipoAlimento);
		int i=0;
		while( i< espacio[0].length && espacio[renglon][i]!=null && espacio[renglon][i].getId() != s.getId()) 
			i++;
		if(i!=espacio[0].length && espacio[renglon][i] != null)
			resp=true;
		return resp;
	}
	
	public String datos(int id){
		String datos;
		int i=0;
		int j = 0;
		
		
		while(i<espacio.length  &&  espacio[i][j].getId() != id){
			j=0;
			while(j<espacio[0].length && espacio[i][j] != null && espacio[i][j].getId() != id)
				j++;
			if(j>=espacio[0].length )
				i++;
		}
		if(i<espacio.length && espacio[i][j] != null)
			datos=espacio[i][j].toString();
		else
			datos="No se encontró la serpiente.";
		
		return datos;
	}
	
	public int numAlimento(String tipoAlimento){
		int resp=0;
		for(int i=0, j=0; i<espacio.length; i++)
			for(j=0; j<espacio[0].length && espacio[i][j] != null; j++)
				if(espacio[i][j].getTipoAlimento().equals(tipoAlimento) && espacio[i][j] != null)
					resp++;
		return resp;
	}
	
	
	public String bajaSerpiente(int id, int renglon){
		String resp;	
		int i=0;

		while( i< espacio[0].length && espacio[renglon][i].getId() != id) 
			i++;
		if(i<espacio[0].length && espacio[renglon][i] != null){
			resp=espacio[renglon][i].toString();
			for(int j=i; j<espacio[0].length; j++)
				espacio[renglon][j]=espacio[renglon][j];
			espacio[renglon][espacio[0].length]=null;
		}
		else
			resp="No se encontró ejemplar.";
			
		return resp;
	}
}
