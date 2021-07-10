
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta primeiraConta2 = primeiraConta;
		System.out.println(primeiraConta);
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta2.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		System.out.println(segundaConta.saldo);
		
		Conta terceiraConta = new Conta();
		terceiraConta.titular = "Walquiria";
		System.out.println(terceiraConta.titular);
	}

}
