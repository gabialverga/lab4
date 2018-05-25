package tst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lab.Aluno;

class AlunoTest {

	Aluno aluno;
	
	@Before
	public void criaAlunoPadão() {
		aluno = new Aluno("123","Gabriela","C. da Computacao");
	}
	
	@Test(expected = NullPointerException.class)
	public void criaAlunoMatriculaInvalida() {
		Aluno aluno = new Aluno("","Gabriela","C. da Computacao");
	}

	@Test (expected = NullPointerException.class)
	public void criaAlunoMatriculaNull() {
		Aluno aluno = new Aluno(null,"Gabriela","C. da Computacao");
	}

	@Test (expected = NullPointerException.class)
	public void criaAlunoNomeInvalida() {
		Aluno aluno = new Aluno("123","","C. da Computacao");
	}
	
	@Test (expected = NullPointerException.class)
	public void criaAlunoNomeNull() {
		Aluno aluno = new Aluno("123",null,"C. da Computacao");
	}
	
	@Test (expected = NullPointerException.class)
	public void criaAlunoCursoInvalida() {
		Aluno aluno = new Aluno("123","Gabriela","");
	}
	
	@Test (expected = NullPointerException.class)
	public void criaAlunoCursoNull() {
		Aluno aluno = new Aluno("123","Gabriela",null);
	}

	@Test
	public void testaToString() {
		assertEquals(("123 - Gabriela - C. da Computacao\n"),aluno.toString());
	}
	
	@Test
	public void testaAlunoIguais() {
		Aluno aluno2 = new Aluno("123","Pedro","C. da Computacao");
		assertEquals(true,aluno.equals(aluno2));
	}
	
}
