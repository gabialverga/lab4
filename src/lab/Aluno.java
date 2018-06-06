package lab;

/**
 * Representação de um aluno, todo aluno precisa de matricula, nome e cuso que
 * esta cursando.
 * 
 * @author Gabriela Alverga - 117210703
 *
 */
public class Aluno {

	/**
	 * matricula: representação da matricula do aluno; 
	 * nome: representação no nome do aluno; 
	 * curso: representação do curso do aluno;
	 */
	private String matricula;
	private String nome;
	private String curso;
	
	/**
	 * Constroi um Aluno a partir da matricula, nome e curso.
	 * 
	 * @param matricula, matricula do aluno
	 * @param nome, nome do aluno
	 * @param curso, curso do aluno
	 */
	public Aluno(String matricula, String nome, String curso) {
		if (matricula.equals("") || matricula.equals(null)) {
			throw new NullPointerException("Matricula invalido.");
		}
		if (nome.equals("") || nome.equals(null)) {
			throw new NullPointerException("Nome invalido.");
		}
		if (curso.equals("") || curso.equals(null)) {
			throw new NullPointerException("Curso invalido.");
		}
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	/**
	 * Retorna um String representando todos os dados do aluno.
	 * A representação segue da seginite forma:
	 * matricula - nome - curso\n
	 * 
	 * @return retorna uma representação String de todos os dados do aluno
	 */
	public String toString() {
		return this.matricula + " - " + this.nome + " - " + this.curso + "\n";
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		if (!this.matricula.equals(other.matricula))
			return false;
		return true;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.matricula.equals(null)) ? 0 : this.matricula.hashCode());
		result = prime * result + ((this.nome.equals(null)) ? 0 : this.nome.hashCode());
		result = prime * result + ((this.curso.equals(null)) ? 0 : this.curso.hashCode());
		return result;
	}
}