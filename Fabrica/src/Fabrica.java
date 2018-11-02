import java.util.*;
public class Fabrica {
/*
* Diego Hernandez Delgado
* 
*/

private String nombre;
private String direccion;
private ArrayList<Circulo> tapetes;
public Fabrica(){
tapetes=new ArrayList<Circulo>();
}

public Fabrica(String nombre, String direccion) {
this();
this.nombre = nombre;
this.direccion = direccion;
}

public String getDireccion() {
return direccion;
}

public void setDireccion(String direccion) {
this.direccion = direccion;
}

public String getNombre() {
return nombre;
}

@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
return result;
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Fabrica other = (Fabrica) obj;
if (nombre == null) {
if (other.nombre != null)
return false;
} else if (!nombre.equals(other.nombre))
return false;
return true;
}
public int compareTo(Fabrica otra){
return nombre.compareTo(otra.getNombre());
}

@Override
public String toString() {
StringBuilder sb;
sb=new StringBuilder();
sb.append("Fabrica \n");
sb.append(" nombre=   "+nombre+"\n");
sb.append(" direcion= "+direccion+"\n");
sb.append(" tapetes=  "+tapetes.toString()+"\n");
return sb.toString(); 
}
public void altaTapete(double radio){
Circulo unTapete;
unTapete= new Circulo(radio);
tapetes.add(unTapete);
}
public double calculaTela(){
int n,i;
double area, sumaAreas;
Circulo tapete;
n=tapetes.size();
sumaAreas=0;
for(i=0;i<n;i++){
tapete=tapetes.get(i);
area=tapete.calculaArea();
sumaAreas=sumaAreas+area;
}
return sumaAreas;
}
public double calculaCosto(){
int n;
double tela, costo;
tela=calculaTela();
costo=tela*250;
n=tapetes.size();
costo=costo+n*56;
return costo;
}
public double calculaVenta(){
double venta;
venta=calculaCosto()*1.25;
return venta;
}
}

