package veiculo.model;

public class veiculo {
	
	private String Modelo;
	private float Velocidade;
	private int Passageiros;			
	private double Combustivel;
	
	public void Modelo(String Modelo){
		this.setModelo(getModelo());
		System.out.println(this.getModelo());
	}
	
	public void Velocidade(float Velocidade) {
		this.setVelocidade(this.getVelocidade());
	}
	
	
	public void Passageiros(int Passageiros) {
		this.setPassageiros(this.getPassageiros());
	}
	
	public void Combustivel(double Combustivel){
		this.setCombustivel(this.getCombustivel());
	}
	
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public float getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(float Velocidade) {
		this.Velocidade = Velocidade;
	}

	public int getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(int Passageiros) {
		this.Passageiros = Passageiros;
	}

	public double getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(double Combustivel) {
		this.Combustivel = Combustivel;
	}
			
			public veiculo(String Modelo, float Velocidade,int Passageiros, double Combustivel) {
	
			this.setModelo(Modelo);
			this.setVelocidade(Velocidade);
			this.setPassageiros(Passageiros);
			this.setCombustivel(Combustivel);
			
			
			}
			
			

			

}