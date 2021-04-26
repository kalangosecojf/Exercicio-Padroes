package refatorado;

public class Veiculo {
	
	private boolean estado = false;
	private Carro carro;
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Veiculo(Carro carro) {
		this.carro = carro;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public void ligar() {
		this.carro.ligar();		
	}

	public void desligar() {
		this.carro.desligar();	
	}
	
	public void acelerar() {
		this.carro.acelerar();
	}
	
	public void freiar() {
		this.carro.freiar();
	}
}
