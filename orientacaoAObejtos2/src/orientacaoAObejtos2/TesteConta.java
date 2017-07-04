package orientacaoAObejtos2;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Conta conta = new Conta();
		conta.numero = "987654321";
		conta.saldo = 500d;
		conta.limite = 1000d;

		Conta conta2 = new Conta();
		conta2.numero = "123456789";
		conta2.saldo = 1000d;
		conta2.limite = 4000;

		// Ligação entre as Tabelas
		Agencia agencia = new Agencia();
		agencia.numero = 140;

		Conta conta3 = new Conta();
		conta3.numero = "123456789";
		conta3.saldo = 1000d;
		conta3.limite = 4000;
		conta3.agencia = agencia;

		System.out.println("Conta 3" + " " + "Número: " + " " + conta3.numero + " " + "Agência: " + " " + conta3.agencia
				+ "Saldo: " + df.format(conta3.saldo) + " " + "Limite: " + df.format(conta3.limite));

		System.out.println("Conta 1" + " " + "Número: " + " " + conta.numero + " " + "Saldo: " + df.format(conta.saldo)
				+ " " + "Limite: " + df.format(conta.limite));

		System.out.println("Conta 2" + " " + "Número: " + " " + conta2.numero + " " + "Saldo: "
				+ df.format(conta2.saldo) + " " + "Limite: " + df.format(conta2.limite));

	}
}
