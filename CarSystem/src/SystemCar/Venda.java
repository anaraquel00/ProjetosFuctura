package SystemCar;

import java.time.LocalDate;

public class Venda implements Relatorio{
	private Veiculo veiculo;
    private Vendedor vendedor;
    private Cliente cliente;
    private LocalDate data;
	
    @Override
	public String gerarRelatorio() {
		
		return String.format(
	            "Venda realizada em %s\nVeículo: %s\nVendedor: %s\nCliente: %s",
	            data.toString(), veiculo.getPlaca(), vendedor.getNome(), cliente.getNome()
	        );
	}

	
	
    
}
