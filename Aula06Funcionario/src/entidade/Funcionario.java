package entidade;

public class Funcionario {
	
	private String nome;
	protected double salario;
	private Cargo cargo;
	
	public Funcionario(String nome, double salario, Cargo cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public double receber() {
	
		return  salario * 0.9;
	}

	@Override
	public String toString() {
		return "Funcionario  nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + " ";
	}

	

	

	
	
	
	
}
