package BancoFuctura;

import java.util.Random;

public abstract class Conta {
	
	private int NumeroDaConta;
	private String NomeDoTitular;
	private double SaldoDisponível;
	
		
	@Override
	public String toString() {
		return "Conta [NumeroDaConta=" + NumeroDaConta + ", NomeDoTitular=" + NomeDoTitular + ", SaldoDisponível="
				+ SaldoDisponível + "]";
	}
	public int getNúmeroDaConta() {
		return NumeroDaConta;
	}
	public void setNúmeroDaConta(int númeroDaConta) {
		NumeroDaConta = númeroDaConta;
	}
	public boolean getNomeDoTitular(boolean NomeDoTitular) {
		if(NomeDoTitular==true) {
			System.out.println(this.getNomeDoTitular(NomeDoTitular));
			
		}
		else {
			System.out.println("Correntista nao cadastrado");
		}
		return NomeDoTitular;
	}
	public void setNomeDoTitular(String nomeDoTitular) {
		NomeDoTitular = nomeDoTitular;
	}
	public double getSaldoDisponível() {
		return SaldoDisponível;
	}
	public void setSaldoDisponível(double saldoDisponível) {
		SaldoDisponível = saldoDisponível;
	}
	
	public static String gerarNumeroConta() {
	Random random = new Random();
	int primeiraParte = random.nextInt(1000); // Gera número entre 0 e 999
	int segundaParte = random.nextInt(1000);  // Gera número entre 0 e 999
	int terceiraParte = random.nextInt(100);  // Gera número entre 0 e 99		
	
	 // Formata as partes com zeros à esquerda e concatena
   return String.format("%03d.%03d-%02d", primeiraParte, segundaParte, terceiraParte);	 
	
		
	}
	
	public void criarConta(boolean cc) {
		if (cc==true) {
			System.out.println("Conta criada com sucesso -->> "+this.getNomeDoTitular(true)+gerarNumeroConta()+".");
			
		}
	}
	
	public void exibirDados() {
		toString();
		
	}
	public void depositar(double valor) {
		
	}
    public void getSaldo() {
    	
    }
    public void alterarSaldo(double valor) {
    	
    }
	public void aplicarTarifaMensal(double valor) {
		
		
	}
	public void cobrarTaxa(double valor) {
		
		
	}
    
}
