package orientacaoAObejtos2;

public class TesteAgencia {

	public static void main(String[] args) {

		Agencia agencia = new Agencia();
		agencia.numero = 85;

		Agencia agencia2 = new Agencia();
		agencia2.numero = 41;

		System.out.println("Agência 1 = " + agencia.numero + "\nAgência 2 = " + agencia2.numero);
	}
}
