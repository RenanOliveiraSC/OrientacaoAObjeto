package orientacaoAObejtos2;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Jos�";
		funcionario.salario = 1200d;

		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "M�rcio";
		funcionario2.salario = 1280d;

		System.out.println("Funcion�rio 1: " + funcionario.nome + " " + "Salario: R$ " + funcionario.salario);
		System.out.println("Funcion�rio 2: " + funcionario2.nome + " " + "Salario: R$ " + funcionario2.salario);
	}
}
