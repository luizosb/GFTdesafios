package veiculo.model;

public class Veiculo {
	
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private Double Preco;



	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 20) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);
			System.out.println("A velocidade agora é de " + this.getVelocidade() + " km/h e resta apenas " + this.getLitrosCombustivel() + " litros de combustível.");
		} else if(this.getisLigado() == false) {
			System.out.println("Não é possivel acelerar pois o veículo está desligado.");
		} else {
			System.out.println("Não há combustível para acelerar.");
		}
	}
	
	public void Abastecer(int gasosa) {
		if( (this.getLitrosCombustivel() + gasosa) > 100) {
			System.out.println("Não é possivel abastecer essa quantidade, apenas é possível abastecer " + (100 - this.getLitrosCombustivel()) + " de combustível.");
			this.setLitrosCombustivel(100);
	} else {
			setLitrosCombustivel(this.getLitrosCombustivel() + gasosa);
			System.out.println("Veículo abastecido com sucesso.");
	}
		System.out.println("O veículo possui agora " + this.getLitrosCombustivel() + " no tanque.");
	}
	
	public void Frear() {
		if (this.getisLigado() == true && this.getLitrosCombustivel() > 0 && this.getVelocidade() > 0 ) {
			this.setVelocidade(this.getVelocidade() - 10);
			System.out.println("A velocidade foi diminuída em 10 km/h, ou seja, é de " + this.getVelocidade() + " km/h.");
		} else if (this.getisLigado() == false) {
			System.out.println("Não é possível frear pois está desligado o veículo."); 
		} else if(this.getVelocidade() - 10 < 0) {
			this.setVelocidade(0);
			System.out.println("A velocidade agora é de 0 km/h. O veículo está parado.");	
		}
	}
	
	public void Pintar() {
			this.setCor("Azul");
			System.out.println("Agora a cor do veículo é azul.");
	} 
	
	public void Ligar() {
		if(this.getisLigado() == false && this.getVelocidade() == 0 && this.getLitrosCombustivel() > 0) {
			this.setLigado(true);
			System.out.println("Agora o veículo está ligado.");
		} else if(this.getLitrosCombustivel() == 0 && this.getisLigado() == false && this.getVelocidade() == 0) {
			System.out.println("Para ligar o veículo, necessita abastece-lo primeiro.");
		} else if(this.getisLigado() == true && this.getVelocidade() > 0 && this.getLitrosCombustivel() > 0) {
			System.out.println("O veículo já esta ligado.");
		} 
	}
	
	public void Desligar() {
		if(this.getisLigado() == true && this.getVelocidade() == 0) {
			this.setLigado(false);
			System.out.println("O veículo foi desligado.");
		} else if(this.getisLigado() == false) {
			System.out.println("O veículo já está desligado.");
		} else {
			System.out.println("Para desligar, pare o veículo primeiro.");
		}
	}
		
	public Veiculo (String Marca,String Modelo,String Placa, String Cor,float Km,boolean isLigado,int litrosCombustivel, int Velocidade,Double Preco) {
		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setPlaca(Placa);
		this.setCor(Cor);
		this.setKm(Km);
		this.setLigado(isLigado);
		this.setLitrosCombustivel(litrosCombustivel);
		this.setVelocidade(Velocidade);
		this.setPreco(Preco);
}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public String getCor() {
		return Cor;
	}


	public void setCor(String cor) {
		Cor = cor;
	}


	public float getKm() {
		return Km;
	}


	public void setKm(float km) {
		Km = km;
	}


	public boolean getisLigado() {
		return isLigado;
	}


	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}


	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}


	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}


	public int getVelocidade() {
		return Velocidade;
	}


	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}


	public Double getPreco() {
		return Preco;
	}


	public void setPreco(Double preco) {
		Preco = preco;
	}
	
	
	
	
}
	