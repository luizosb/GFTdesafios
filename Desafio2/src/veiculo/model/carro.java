package veiculo.model;

public class carro extends veiculo {
	
	private String Marca;
	private int Portas;
	private int Ano;
	
		
	
	public carro(String Modelo, float Velocidade, int Passageiros, double Combustivel, String Marca, int Portas, int Ano) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Marca = Marca;
		this.Portas = Portas;
		this.Ano = Ano;
		
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String Marca) {
		this.Marca = Marca;
	}


	public int getPortas() {
		return Portas;
	}


	public void setPortas(int Portas) {
		this.Portas = Portas;
	}


	public int getAno() {
		return Ano;
	}


	public void setAno(int Ano) {
		this.Ano = Ano;
	}

	
	
	}


