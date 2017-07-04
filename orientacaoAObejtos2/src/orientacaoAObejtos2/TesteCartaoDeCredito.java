package orientacaoAObejtos2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartaoDeCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		CartaodeCredito CartaodeCredito = new CartaodeCredito();
		CartaodeCredito.numero = 12345;
		CartaodeCredito.data = sdf.parse("02/05/2025");

		CartaodeCredito CartaodeCredito2 = new CartaodeCredito();
		CartaodeCredito2.numero = 54321;
		CartaodeCredito2.data = sdf.parse("02/05/2019");

		System.out.println(
				"Cartão 1: " + CartaodeCredito.numero + " " + "\nCom Validade de: " + sdf.format(CartaodeCredito.data));

		System.out.println("Cartão 2: " + CartaodeCredito2.numero + " " + "\nCom Validade de: "
				+ sdf.format(CartaodeCredito2.data));

		Clientes cliente = new Clientes();
		cliente.codigo = 5;
		cliente.nome = "Ferrari";

		// 18 Teste de Relacionamento entre Clientes e Cartão de Credito
		CartaodeCredito CartaodeCredito3 = new CartaodeCredito();
		CartaodeCredito3.numero = 75431;
		CartaodeCredito3.data = sdf.parse("01/01/2018");
		CartaodeCredito3.cliente = cliente;
		System.out.println(
				"Cartão 3" + CartaodeCredito3.numero + " " + "Nome do Cliente: " + CartaodeCredito3.cliente.nome);

	}
}
