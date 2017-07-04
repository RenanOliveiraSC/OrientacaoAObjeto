package orientacaoAObejtos2;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.nome = "José";
		funcionario.salario = 1200d;

		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Márcio";
		funcionario2.salario = 1280d;

		System.out.println("Funcionário 1: " + funcionario.nome + " " + "Salario: R$ " + funcionario.salario);
		System.out.println("Funcionário 2: " + funcionario2.nome + " " + "Salario: R$ " + funcionario2.salario);
	}
}
