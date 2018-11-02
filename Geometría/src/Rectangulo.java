
public class Rectangulo {
	double base, altura;

		public Rectangulo(){	
		}
		
		public Rectangulo(double base, double altura){
			this.base=base;
			this.altura=altura;
			}
		
		//Funcionalidad mínima requerida;
		public void setBase(double neoBase){
			base=neoBase;		
		}
		
		public void setAltura(double neoAltura){
			altura=neoAltura;		
		}
		
		public double getBase(){
			return base;
		}
		
		public double getAltura(){
			return altura;
		}
		
		public boolean equals (Rectangulo otroRectangulo){
			boolean resp;
			if(base==otroRectangulo.base && altura==otroRectangulo.altura)
				resp=true;
			else 
				resp=false;
			return resp;		
		}
		
		public int compareTo(Rectangulo otroRectangulo){
			int resp;
			if(base==otroRectangulo.base && altura==otroRectangulo.altura)
				resp=0;
			else
				if(base>otroRectangulo.base && altura>otroRectangulo.altura)
					resp=1;
				else
					resp=-1;
			return resp;
		}
		
		public String toString(){
			StringBuilder sb;
			sb= new StringBuilder();
			sb.append("Base: "+base+"\n");
			sb.append("Altura: "+altura+"\n");
			return sb.toString();
		}
		
		//Funciones requeridas:
		public double calculaArea(){
			double area;
			area=base*altura;
			return area;
		}
		
		public double calculaPerimetro(){
			double perimetro;
			perimetro= (base*2)+(altura*2);
			return perimetro;
		}

}
