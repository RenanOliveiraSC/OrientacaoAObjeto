package orientacaoAObejtos2;

public class TesteTurma {

	public static void main(String[] args) {

		Turma turma = new Turma();
		turma.periodo = "Manh�";
		turma.serie = "8�";
		turma.sigla = "A";
		turma.TipoEnsino = "Matutino";

		Turma turma2 = new Turma();
		turma2.periodo = "Manh�";
		turma2.serie = "5�";
		turma2.sigla = "B";
		turma2.TipoEnsino = "Matutino";

		System.out.println("S�rie: " + turma.serie + turma.sigla + " " + "Tipo de Ensino: " + turma.TipoEnsino);
		System.out.println("S�rie: " + turma2.serie + turma2.sigla + " " + "Tipo de Ensino: " + turma2.TipoEnsino);
	}
}
