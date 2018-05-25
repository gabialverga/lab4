package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab.Aluno;
import lab.GrupoDeEstudo;

public class GrupoDeEstudoTest {

	private GrupoDeEstudo grupo;
	private Aluno aluno;
	
	@Before
	public void CriaGrupoPadrão() {
		grupo = new GrupoDeEstudo("P2");
		aluno = new Aluno("123","Gabriela","C. da Computacao");
		grupo.alocaAluno(aluno);
	}
	
	@Test (expected = NullPointerException.class)
	public void CriaGrupoNomeInvalido() {
		GrupoDeEstudo grupo = new GrupoDeEstudo("");
	}
	
	@Test (expected = NullPointerException.class)
	public void CriaGrupoNomeNull() {
		GrupoDeEstudo grupo = new GrupoDeEstudo(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void alocaAlunoInvalido() {
		Aluno aluno = new Aluno(null,"Gabriela","C. da Computacao");
		grupo.alocaAluno(aluno);
	}
	
	@Test
	public void testaGrupoIguais() {
		GrupoDeEstudo grupo2 = new GrupoDeEstudo("P2");
		assertEquals(true,grupo.equals(grupo2));
	}
	
	@Test
	public void testaListaAlunos() {
		assertEquals(("* 123 - Gabriela - C. da Computacao\n"),grupo.listaAlunos());
	}
	
}
