package lab;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ControleDeAluno controle = new ControleDeAluno();
		boolean sair = false;
		char op, op2;
		String matricula, nome, curso, grupo;

		while (!sair) {
			System.out.println(showMenu());
			op = sc.nextLine().charAt(0);
			op = Character.toUpperCase(op);
			if (op == 'C') {
				System.out.println("\nMatrícula:");
				matricula = sc.nextLine();
				System.out.println("\nNome:");
				nome = sc.nextLine();
				System.out.println("\nCurso:");
				curso = sc.nextLine();
				try {
					System.out.println(controle.cadastraAluno(matricula, nome, curso) + "\n");
				} catch (NullPointerException e) {
					System.out.println(e.getMessage() + "\n");
				}
			} else if (op == 'E') {
				System.out.println("\nMatrícula:");
				matricula = sc.nextLine();
				try {
					System.out.println(controle.exibirAluno(matricula));
				} catch (NullPointerException e) {
					System.out.println(e.getMessage() + "\n");
				}
			} else if (op == 'N') {
				System.out.println("\nGrupo:");
				grupo = sc.nextLine();
				try {
					System.out.println(controle.cadastrarGrupo(grupo) + "\n");
				} catch (NullPointerException e) {
					System.out.println(e.getMessage() + "\n");
				}
			} else if (op == 'A') {
				System.out.println("(A)locar Aluno ou (I)mprimir Grupo?");
				op2 = sc.nextLine().charAt(0);
				op2 = Character.toUpperCase(op);
				if (op2 == 'A') {
					System.out.println("\nMatrícula:");
					matricula = sc.nextLine();
					System.out.println("\nGrupo:");
					grupo = sc.nextLine();
					try {
						System.out.println(controle.alocaAluno(matricula, grupo) + "\n");
					} catch (NullPointerException e) {
						System.out.println(e.getMessage() + "\n");
					}
				} else if (op2 == 'I') {
					System.out.println("\nGrupo:");
					grupo = sc.nextLine();
					try {
						System.out.println(controle.listaAlunoGrupo(grupo));
					} catch (NullPointerException e) {
						System.out.println(e.getMessage() + "\n");
					}
				}
			} else if (op == 'R') {
				System.out.println("\nMatrícula:");
				matricula = sc.nextLine();
				try {
					System.out.println(controle.registraAlunoRespondeu(matricula));
				} catch (NullPointerException e) {
					System.out.println(e.getMessage() + "\n");
				}
			} else if (op == 'I') {
				System.out.println(controle.listaAlunoRespondeu());
			} else if (op == 'O') {
				sair = true;
			}
		}

	}

	public static String showMenu() {
		return ("(C)adastrar Aluno\n" + "(E)xibir Aluno\n" + "(N)ovo Grupo\n"
				+ "(A)locar Aluno no Grupo e Imprimir Grupos\n" + "(R)egistrar Aluno que Respondeu\n"
				+ "(I)mprimir Alunos que Responderam\n" + "(O)ra, vamos fechar o programa!\n" + "\n" + "Opção>");
	}
}