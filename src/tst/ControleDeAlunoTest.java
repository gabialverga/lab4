package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab.Aluno;
import lab.ControleDeAluno;

public class ControleDeAlunoTest {

	ControleDeAluno controle;
	
	@Before
	public void criaControlePadão() {
		controle = new ControleDeAluno();
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastraAlunoMatriculaJaCadastrada() {
		controle.cadastraAluno("123","Gabriela","C. da Computacao");
		controle.cadastraAluno("123","Gabriela","C. da Computacao");
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastraAlunoNomeInvalido() {
		controle.cadastraAluno("123","","C. da Computacao");
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastraAlunoMatriculaInvalida() {
		controle.cadastraAluno("","Gabriela","C. da Computacao");
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastraAlunoCursoInvalido() {
		controle.cadastraAluno("123","Gabriela","");
	}
	
	@Test(expected = NullPointerException.class)
	public void exibirAlunoInvalido() {
		controle.exibirAluno("321");
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastrarGrupoInvalido() {
		controle.cadastrarGrupo("LP2");
		controle.cadastrarGrupo("LP2");
	}
	
	@Test(expected = NullPointerException.class)
	public void AlocaAlunoGrupoInvalido() {
		controle.cadastraAluno("123","Gabriela","C. da Computacao");
		controle.alocaAluno("123","errado");
	}
	
	@Test(expected = NullPointerException.class)
	public void AlocaAlunoInvalido() {
		controle.cadastrarGrupo("LP2");
		controle.alocaAluno("123","LP2");
	}
	
	@Test(expected = NullPointerException.class)
	public void RegistraAlunoRespodeuInvalido() {
		controle.registraAlunoRespondeu(null);
	}
}
