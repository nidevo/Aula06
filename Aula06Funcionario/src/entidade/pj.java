package entidade;

public class pj extends Funcionario {

	private double adicional;

	public pj(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional = adicional;
	}

	public double receber() {

		return super.receber() + adicional;
	}

	@Override
	public String toString() {
		return super.toString() + " Seu salário liquído é: " + receber();
	}

	
}