package teste;

import util.Cursos;

/**
 *  classe responsavel por demonstrar a utilização de classe Enum
 * @author Nathalia Lanaro
 *
 */
public class TestaEnum {

	public static void main(String[] args) {
		System.out.println("Curso de " + Cursos.JAVA + "Duração de " + Cursos.JAVA.getHoras() + Cursos.JAVA.getPeriodo());
		System.out.println("Todos os cursos");
		for (Cursos c : Cursos.values()) {
			System.out.println(c + "Com total de horas:" + c.getHoras());
		}

	}

}
