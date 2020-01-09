package veiculo.model;

public class aviao extends veiculo {
	
	private String Tipo;
	private String Uso;
	
	public aviao(String Modelo, float Velocidade, int Passageiros, double Combustivel, String Uso, String Tipo) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Tipo = Tipo;
		this.Uso = Uso;
	}
			
	public String getUso() {
		return Uso;
	}


	public void setUso(String Uso) {
		this.Uso = Uso;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}
}
	
	
	
	

