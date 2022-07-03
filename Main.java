
public class Main {

	public static void main(String[] args) {
		Cliente katymilla = new Cliente();
		katymilla.setNome("Venilton");
		
		Conta cc = new ContaCorrente(katymilla);
		Conta poupanca = new ContaPoupanca(katymilla);

		cc.depositar(1000);
		cc.transferir(900, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
