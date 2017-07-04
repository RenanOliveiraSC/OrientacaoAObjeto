package orientacaoAObejtos2;

public class TesteClientes {

	public static void main(String[] args) {
		Clientes cliente = new Clientes();
		cliente.codigo = 1;
		cliente.nome = "Renan";

		Clientes cliente2 = new Clientes();
		cliente2.codigo = 2;
		cliente2.nome = "Maria";

		System.out.println("Clientes:" + "\nCódigo: " + cliente.codigo + "\nNome: " + cliente.nome);
		System.out.println("Clientes:" + "\nCódigo: " + cliente2.codigo + "\nNome: " + cliente2.nome);
	}
}
