package class21;

public class Banco {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"mario", 2000, 500);
		
		c1.info();
		if(!c1.sacar(2000)) {
			System.out.println("Problema ao Sacar!");
		};
		if(!c1.depositar(-500)) {
			System.out.println("Problema ao Depositar!");
		};
		System.out.println();
		c1.info();

	}

}
