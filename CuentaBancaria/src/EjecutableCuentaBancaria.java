
public class EjecutableCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria c1, c2;
		
		c1=new CuentaBancaria("Diego", 5555, 15900);
		c2=new CuentaBancaria("Juan", 6666, 8000);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString()+"\n");
		
		System.out.println("¿Son iguales?"+"\n"+c1.equals(c2)+"\n");
		
		int a=c1.compareTo(c2);
		if(a==0)
			System.out.println("Es la misma cuenta.\n");
		else
			if(a<0)
				System.out.println("La cuenta de "+c1.getNombre()+" es más antigua.\n");
			else
				System.out.println("La cuenta de "+c2.getNombre()+" es más nueva.\n");
			
		System.out.println(c1.deposito(5));
		System.out.println(c1.deposito(500));
		System.out.println("Nuevo saldo: $"+c1.getSaldo()+"\n");
		
	
		System.out.println(c2.retiro(100000));
		System.out.println(c2.retiro(3100));
		System.out.println(c2.retiro(55));
		System.out.println(c2.retiro(100));
		System.out.println("Nuevo saldo: $"+c2.getSaldo()+"\n");
		
		
		
		
	}

}
