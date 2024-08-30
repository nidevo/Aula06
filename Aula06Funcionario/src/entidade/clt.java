package entidade;

public class clt extends Funcionario {

	private double convenio;

	public clt(String nome, double salario, Cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
	}

	public double receber() {

		return super.receber() - convenio;
	}

	@Override
	public String toString() {
		return super.toString() + " Seu salário liquído é: " + receber();
	}

	
}
