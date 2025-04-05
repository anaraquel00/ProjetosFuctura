package SystemCar;

public class Veiculo extends EntidadeBase {

	private String placa;
	private String modelo;
    private double preco;
    private boolean disponivel;
	public Veiculo(String placa, String modelo, double preco) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.preco = preco;
		this.disponivel=true;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void marcarComoVendido() {
		this.disponivel=false;
	}
	public boolean validar() {
		return placa.matches("[A-Z]{3}-\\d{4}");
		
	}
}
