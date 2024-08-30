package principal;

import java.util.Scanner;
import entidade.Cargo;
import entidade.Funcionario;
import entidade.clt;
import entidade.pj;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String nome = null;
		double salario = 0;
		double convenio = 0;
		double adicional = 0;
		Cargo cargo = null;

		Funcionario c = new clt(nome, salario, cargo, convenio);
		System.out.println("Conta CLT.");

		System.out.println("Digite o nome: ");
		nome = scn.next();

		System.out.println("Digite o valor do convênio: ");
		convenio = scn.nextDouble();

		System.out.println("Digite o salário: ");
		salario = scn.nextDouble();

		System.out.println("Cargo: 1.Desenvolvedor - 2.Contador - 3.Professor");
		int escolha = scn.nextInt();

		if (escolha == 1) {
			cargo = Cargo.DESENVOLVEDOR;
		}

		if (escolha == 2) {
			cargo = Cargo.CONTADOR;
		}
		if (escolha == 3) {
			cargo = Cargo.PROFESSOR;
		}
		c = new clt(nome, salario, cargo, convenio);
		System.out.println(c);

		
		Funcionario p = new pj (nome, salario, cargo, adicional);
		System.out.println("\nConta PJ.");

		System.out.println("Digite o nome: ");
		nome = scn.next();

		System.out.println("Digite o valor do adicional: ");
		adicional = scn.nextDouble();

		System.out.println("Digite o salário: ");
		salario = scn.nextDouble();

		System.out.println("Cargo: 1.Desenvolvedor - 2.Contador - 3.Professor");
		escolha = scn.nextInt();
		if (escolha == 1) {
			cargo = Cargo.DESENVOLVEDOR;
		}
		if (escolha == 2) {
			cargo = Cargo.CONTADOR;
		}
		if (escolha == 3) {
			cargo = Cargo.PROFESSOR;
		}

		p = new pj(nome, salario, cargo, adicional);
		System.out.println(p);

	}

}
