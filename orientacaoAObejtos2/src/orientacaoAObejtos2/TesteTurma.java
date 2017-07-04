package orientacaoAObejtos2;

public class TesteTurma {

	public static void main(String[] args) {

		Turma turma = new Turma();
		turma.periodo = "Manhã";
		turma.serie = "8º";
		turma.sigla = "A";
		turma.TipoEnsino = "Matutino";

		Turma turma2 = new Turma();
		turma2.periodo = "Manhã";
		turma2.serie = "5º";
		turma2.sigla = "B";
		turma2.TipoEnsino = "Matutino";

		System.out.println("Série: " + turma.serie + turma.sigla + " " + "Tipo de Ensino: " + turma.TipoEnsino);
		System.out.println("Série: " + turma2.serie + turma2.sigla + " " + "Tipo de Ensino: " + turma2.TipoEnsino);
	}
}
