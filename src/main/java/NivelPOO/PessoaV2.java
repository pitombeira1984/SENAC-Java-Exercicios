package NivelPOO;

public class PessoaV2 {
	
	private String nome;
	private int idade;
	
	//getter - Acessar Valor
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	//setter - Modificar Valor
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade >= 0) { //Validando
			this.idade = idade;
		}
	}

	public static void main(String[] args) {
		
		PessoaV2 p = new PessoaV2();
		p.setNome("Tiago");
		p.setIdade(42);
		
		System.out.printf("Nome: %s", p.getNome());
		System.out.printf("Idade: %d", p.getIdade());

	}

}
