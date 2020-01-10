package veiculo.model;

public class Caminhao extends Veiculo {
	private String Carga;
	private float Comprimento;

	public Caminhao(String Marca, String Modelo, String Placa, String Cor, float Km, boolean isLigado,
			int litrosCombustivel, int Velocidade, Double Preco, float Comprimento, String Carga) {
		super(Marca, Modelo, Placa, Cor, Km, isLigado, litrosCombustivel, Velocidade, Preco);
		this.Comprimento = Comprimento;
		this.Carga = Carga;
	}

	@Override
	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 70) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 15);
			System.out.println("A velocidade agora é de " + this.getVelocidade() + " km/h e resta apenas " + this.getLitrosCombustivel() + " litros de diesel.");
		} else if(this.getisLigado() == false) {
			System.out.println("Não é possivel acelerar pois o caminhão está desligado.");
		} else {
			System.out.println("Não há diesel para acelerar.");
		}
	}
	
	public void Abastecer (float gasosa) {
		int gas = (int) gasosa;
		if( (this.getLitrosCombustivel() + (gas)) > 200) {
			System.out.println("Não é possivel abastecer essa quantidade, apenas é possível abastecer " + (200 - this.getLitrosCombustivel()) + " de diesel.");
			this.setLitrosCombustivel(200);
	} else {
			this.setLitrosCombustivel(this.getLitrosCombustivel() + gas);
			System.out.println("Caminhão abastecido com sucesso.");
	}
		System.out.println("O caminhão possui agora " + this.getLitrosCombustivel() + " litros de diesel no tanque.");
	}
		
	
	public String getCarga() {
		return Carga;
	}

	public void setCarga(String carga) {
		Carga = carga;
	}

	public float getComprimento() {
		return Comprimento;
	}

	public void setComprimento(float comprimento) {
		Comprimento = comprimento;
	}

}
