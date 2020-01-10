package veiculo.model;

public class Aviao extends Veiculo{
	
	private String Classe;
	private String PaisOrigem;

	public Aviao(String Marca, String Modelo, String Placa, String Cor, float Km, boolean isLigado,
			int litrosCombustivel, int Velocidade, Double Preco, String PaisOrigem, String Classe) {
		super(Marca, Modelo, Placa, Cor, Km, isLigado, litrosCombustivel, Velocidade, Preco);
		this.Classe = Classe;
		this.PaisOrigem = PaisOrigem;
		}
	
	@Override
	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 150) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 30);
			System.out.println("A velocidade agora � de " + this.getVelocidade() + " km/h e resta apenas " + this.getLitrosCombustivel() + " litros de querosene.");
		} else if(this.getisLigado() == false) {
			System.out.println("N�o � possivel acelerar pois o avi�o est� desligado.");
		} else {
			System.out.println("N�o h� querosene para acelerar.");
		}
	}
	
	public void Abastecer(String gasosa) {
		if( (this.getLitrosCombustivel() + Integer.parseInt(gasosa)) > 400) {
			System.out.println("N�o � possivel abastecer essa quantidade, apenas � poss�vel abastecer " + (400 - this.getLitrosCombustivel()) + " de querosene.");
			this.setLitrosCombustivel(400);
	} else {
			this.setLitrosCombustivel(this.getLitrosCombustivel() + Integer.parseInt(gasosa));
			System.out.println("Avi�o abastecido com sucesso.");
	}
		System.out.println("O avi�o possui agora " + this.getLitrosCombustivel() + " litros de querosene no tanque.");
	}
		
	
	public String getClasse() {
		return Classe;
	}

	public void setClasse(String classe) {
		Classe = classe;
	}

	public String getPaisOrigem() {
		return PaisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		PaisOrigem = paisOrigem;
	}
	
	
	
}
