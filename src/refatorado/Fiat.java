package refatorado;

public class Fiat implements CarroFiat {

	private boolean estado = false;

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	private String nome() {
		return "Fiat: ";
	}

	@Override
	public void ligar() {
		setEstado(true);
		System.out.println(nome() + "Carro ligado");

	}

	@Override
	public void desligar() {
		setEstado(false);
		System.out.println(nome() + "Carro desligado");
	}

	@Override
	public void acelerar() {
		if (this.estado) {
			System.out.println(nome() + "Acelerando");
		} else {
			System.out.println(nome() + "É preciso ligar o carro");
		}
	}

	@Override
	public void freiar() {
		if (this.estado) {
			System.out.println(nome() + "Freiando");
		} else {
			System.out.println(nome() + "É preciso ligar o carro");
		}
	}

	@Override
	public void ligarRadio() {
		System.out.println("Ligando rádio");
	}

}
