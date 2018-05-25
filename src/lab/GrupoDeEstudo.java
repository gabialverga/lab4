package lab;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class GrupoDeEstudo {

	private HashSet<Aluno> alunos;
	private String tema;

	public GrupoDeEstudo(String tema) {
		if (tema.equals("") || tema.equals(null)) {
			throw new NullPointerException("Tema invalido.");
		}
		this.tema = tema;
		this.alunos = new HashSet<>();
	}

	public void alocaAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String listaAlunos() {
		String listaAlunos = "";
		for (Aluno aluno : this.alunos) {
			listaAlunos += "* " + aluno.toString();
		}
		return listaAlunos;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof GrupoDeEstudo))
			return false;
		GrupoDeEstudo other = (GrupoDeEstudo) obj;
		if (!this.tema.equals(other.tema))
			return false;
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.tema.equals(null)) ? 0 : this.tema.hashCode());
		return result;
	}
}