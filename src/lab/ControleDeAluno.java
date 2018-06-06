package lab;

import java.util.HashMap;
import java.util.HashSet;

public class ControleDeAluno {
	private HashMap<String, Aluno> alunos;
	private HashMap<String, GrupoDeEstudo> gruposDeEstudos;
	private HashSet<Aluno> alunosQueResponderam;
	
	public ControleDeAluno() {
		this.alunos = new HashMap<>();
		this.gruposDeEstudos = new HashMap<>();
		this.alunosQueResponderam = new HashSet<>();
		
	}

	public String cadastraAluno(String matricula, String nome, String curso) {
		if (this.alunos.containsKey(matricula)) {
			throw new NullPointerException("Matricula já cadastrada.");
		}
		this.alunos.put(matricula, new Aluno(matricula, nome, curso));
		return ("Cadastro realizado!");
	}

	public String exibirAluno(String matricula) {
		if (this.alunos.containsKey(matricula)) {
			return (this.alunos.get(matricula).toString());
		} else {
			throw new NullPointerException("Matricula invalida.");
		}
	}

	public String cadastrarGrupo(String grupo) {
		if (this.gruposDeEstudos.containsKey(grupo)) {
			throw new NullPointerException("Grupo já cadastrada.");
		}
		this.gruposDeEstudos.put(grupo, new GrupoDeEstudo(grupo));
		return ("Cadastro realizado!");
	}

	public String alocaAluno(String matricula, String grupo) {
		if (!this.gruposDeEstudos.containsKey(grupo)) {
			throw new NullPointerException("Grupo não cadastrada.");
		}
		if (!this.alunos.containsKey(matricula)) {
			throw new NullPointerException("Aluno não cadastrada.");
		}
		this.gruposDeEstudos.get(grupo).alocaAluno(this.alunos.get(matricula));
		return ("Aluno alocado.");
	}

	public String listaAlunoGrupo(String grupo) {
		if (!this.gruposDeEstudos.containsKey(grupo)) {
			throw new NullPointerException("Grupo não cadastrada.");
		}
		return ("Alunos do grupo " + grupo + ":\n" + this.gruposDeEstudos.get(grupo).listaAlunos());
	}

	public String registraAlunoRespondeu(String matricula) {
		if (!this.alunos.containsKey(matricula)) {
			throw new NullPointerException("Aluno não cadastrada.");
		}
		this.alunosQueResponderam.add(this.alunos.get(matricula));
		return "Aluno registrado.";
	}

	public String listaAlunoRespondeu() {
		String listaAlunos = "";
		for(Aluno aluno: this.alunosQueResponderam) {
			listaAlunos +="* "+aluno.toString();
		}
		return listaAlunos;
	}
}