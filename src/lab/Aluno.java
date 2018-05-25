package lab;

public class Aluno {

	private String matricula;
	private String nome;
	private String curso;

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

	public String toString() {
		return this.matricula + " - " + this.nome + " - " + this.curso + "\n";
	}

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