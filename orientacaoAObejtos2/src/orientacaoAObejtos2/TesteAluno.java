package orientacaoAObejtos2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		Aluno aluno = new Aluno();
		aluno.nome = "Renan";
		aluno.rg = "47266837-7";
		aluno.dataNsc = sdf.parse("09/07/1990");

		Aluno aluno2 = new Aluno();
		aluno2.nome = "João";
		aluno2.rg = "568347-7";
		aluno2.dataNsc = sdf.parse("11/11/1996");

		System.out.println(
				"Aluno 1: " + aluno.nome + " " + "RG: " + aluno.rg + " " + "Data Nasc. " + sdf.format(aluno.dataNsc));
		System.out.println("Aluno 2: " + aluno2.nome + " " + "RG: " + aluno2.rg + " " + "Data Nasc. "
				+ sdf.format(aluno2.dataNsc));
	}
}
