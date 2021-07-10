
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaWalquiria = new Conta();
		contaDaWalquiria.deposita(1000);

		boolean sucessoTransferencia = contaDaWalquiria.transfere(300, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("saldo insuficiente");
		}

		System.out.println(contaDaWalquiria.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDaWalquiria.titular = "walquiria lima";
		System.out.println(contaDaWalquiria.titular);

	}

}
