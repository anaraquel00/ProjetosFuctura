package SystemCar;

public class Cliente extends Pessoa{
	private String endereco;
	public Cliente(String nome, String cpf, String telefone, String endereco) {
		super(nome, cpf, telefone);
		this.endereco=endereco;
   	
		
	}

	public String getEndereco() { 
		return endereco; 
		}
    public boolean validarCpf() {
    		return getCpf().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    	
    }
    public boolean buscarCpf() {
    	return getCpf().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    	
    }

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()+
				 "]";
	}

	
	
	}
	
	


