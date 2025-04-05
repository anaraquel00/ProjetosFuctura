package SystemCar;

public abstract class EntidadeBase {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	// Método abstrato para validação
	
	public abstract boolean validar();
	
		
	
	

}
