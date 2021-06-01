package util;

/**
 * classe responsavel por demonstrar o conceito de ENUM
 * @author Nathalia Lanaro 
 *
 */
public enum Cursos {
	JAVA(180, "Noturno"),
	COBOL(160, "Vespertino"),
	PHP(40, "Noturno, Vespertino"),
	UNITY(100, "Diurno");

	private int horas;
	private String periodo;

	Cursos(int horas, String periodo) {
		this.horas = horas;
		this.periodo = periodo;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public String getPeriodo() {
		return periodo;
	}
}

	
