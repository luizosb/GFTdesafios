package veiculo.model;

public class Carro extends Veiculo {

	private int Portas;
	private int Ano;	
	
	public Carro(String Marca, String Modelo, String Placa, String Cor, float Km, boolean isLigado,
			int litrosCombustivel, int Velocidade, Double Preco, int Portas, int Ano) {
		super(Marca, Modelo, Placa, Cor, Km, isLigado, litrosCombustivel, Velocidade, Preco);
		this.Portas = Portas;
		this.Ano = Ano;		
	}
	
	@Override
	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 20) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 10);
			System.out.println("A velocidade agora é de " + this.getVelocidade() + " km/h e resta apenas " + this.getLitrosCombustivel() + " litros de gasolina.");
		} else if(this.getisLigado() == false) {
			System.out.println("Não é possivel acelerar pois o carro está desligado.");
		} else {
			System.out.println("Não há gasolina para acelerar.");
		}
	}
	
	@Override
	public void Abastecer(int gasosa) {
		if( (this.getLitrosCombustivel() + gasosa) > 45) {
			System.out.println("Não é possivel abastecer essa quantidade, apenas é possível abastecer " + (45 - this.getLitrosCombustivel()) + " de gasolina.");	
			this.setLitrosCombustivel(45);
	} else {
			setLitrosCombustivel(this.getLitrosCombustivel() + gasosa);
			System.out.println("Carro abastecido com sucesso.");
	}
		System.out.println("O carro possui agora " + this.getLitrosCombustivel() + " litros de gasolina no tanque.");
	}
		
	public int getPortas() {
		return Portas;
	}

	public void setPortas(int portas) {
		Portas = portas;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

}
