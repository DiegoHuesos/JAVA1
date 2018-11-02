import java.util.function.*;

public class Celular{
	String marca;
	int año;
	
	
public Celular(){
	this.marca = "";
	this.año = 2000;
}




public static void main(String []args){
	Celular cel;
	String marca;
	int año;
	String info;
	
	cel= new Celular();
	
	info= cel.toString();
	
	System.out.println(info);
	
}
}