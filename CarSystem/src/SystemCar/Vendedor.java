package SystemCar;

public class Vendedor extends Pessoa{
	 
	private double comissaoAcumulada;
	
	public Vendedor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		
	}

	public void adicionarComissao(double valor) {
		this.comissaoAcumulada+= valor *0.05; // Exemplo: 5% de comissão
	}
	public double getComissaoAcumulada() { 
		return comissaoAcumulada; 
		}
	
}
