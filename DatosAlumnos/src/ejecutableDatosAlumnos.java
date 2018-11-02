import java.util.Scanner;
public class ejecutableDatosAlumnos {

	public static void main(String[] args) {
		Alumno alumno1;
		double costoSem;
		Scanner lectura;
		
		lectura= new Scanner(System.in);
		
		
		alumno1= new Alumno("Diego", "20", 9.0, "Mecatronica", 22, 4);
		
		System.out.println("Nombre: "+ alumno1.getNombre()+"\n");
		System.out.println("Edad: "+ alumno1.getEdad()+"\n");
		System.out.println("Promedio: "+ alumno1.getPromedio()+"\n");
		System.out.println("Carrera: "+ alumno1.getCarrera()+"\n");
		System.out.println("TotalCreditossSem: "+ alumno1.getTotCredSem()+"\n");
		System.out.println("Aprobadas: "+ alumno1.getAprobadas()+"\n");
		
		System.out.println("Escribe el nuevo nombre: ");
		String newName= lectura.nextLine();
		alumno1.setNombre(newName);
		
		System.out.println("Nombre: "+ alumno1.getNombre()+"\n");
	}

}
