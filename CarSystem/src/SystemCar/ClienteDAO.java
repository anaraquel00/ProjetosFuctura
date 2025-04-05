package SystemCar;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends Cliente{
public ClienteDAO(String nome, String cpf, String telefone, String endereco) {
		super(nome, cpf, telefone, endereco);
		// TODO Auto-generated constructor stub
	}

private List<Cliente> clientes = new ArrayList<>();

//Adiciona um cliente à lista

public void adicionar (Cliente cliente) {
	if (cliente.validarCpf()) {
		clientes.add(cliente);
		
	} else {
         System.out.println("CPF inválido! Cliente não cadastrado.");
	}	}

	 // Atualiza os dados de um cliente
    public boolean atualizar(String cpf, String novoEndereco, String novoTelefone) {
        Cliente cliente = new Cliente(novoTelefone, novoTelefone, novoTelefone, novoTelefone);
        if (cliente != null) {
            cliente.getEndereco();
            cliente.setTelefone(novoTelefone);
            return true;
        }
        return false;
	
	}

    // Remove um cliente
    public boolean remover(String cpf) {
        Cliente cliente = new Cliente(cpf, cpf, cpf, cpf);
        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }
        return false;
	}

}
	



