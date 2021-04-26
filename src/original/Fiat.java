package original;

public class Fiat implements Carro {
	
	public void ligar(String comando) {
		System.out.println("Fiat " + comando);
	}
	
	public void desligar(String comando) {
		System.out.println("Fiat " + comando);
	}
	
	public void acelerar(String comando) {
		System.out.println("Fiat " + comando);
	}
	
	public void freiar(String comando) {
		System.out.println("Fiat " + comando);
	}
	
	public void ligarRadio(String comando) {
		System.out.println("Fiat " + comando);
	}

	@Override
	public void abrirTetoSolar(String comando) {
		//Não possui essa funcionalidade
		
	}

	@Override
	public void ligarArCondicionado(String comando) {
		//Não possui essa funcionalidade	
	}

	@Override
	public void ligarPilotoAutomatico(String comando) {
		//Não possui essa funcionalidade
	}

}
