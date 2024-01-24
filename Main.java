public class Main
{
	public static void main(String[] args) {
	   
	    Cliente cli01 = new Cliente("111.111.111-11", 
	                                "João Batista",
	                                1,
	                                "99111-1111");
	    
	    Cliente cli02 = new Cliente("222.222.222-22", 
	                                "Paula Leite",
	                                2,
	                                "99222-2222");
	                                
		Conta c1 = new ContaCorrente(cli01, "1234-5");
		Conta c2 = new ContaEspecial(cli02, "6789-0");
		
		c1.depositar(50);
		c2.depositar(30);
		c1.depositar(100);
		c2.depositar(10000);
		
		c2.sacar(10);
		c1.sacar(80);
		
		if(c2 instanceof ContaPoupança) {
		((ContaPoupança)c2).renderJuros(0.01);
		}
		
		if (c2 instanceof ContaEspecial) {
		    ((ContaEspecial)c2).renderBonus();		}
		
		System.out.println("Conta #1");
		System.out.println(c1);
		
		System.out.println();

		System.out.println("Conta #2");
		System.out.println(c2);
	}
}
