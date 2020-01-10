package veiculo.main;

import veiculo.model.Aviao;
import veiculo.model.Caminhao;
import veiculo.model.Carro;

public class Main {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("marca", "Modelo", "Placa", "Cor", 0.0f, false, 0, 0, 0.0, "PaisOrigem", "Classe");
		Carro carro = new Carro("Marca", "Modelo", "Placa", "Cor", 0.0f, true, 0, 0, 0.0, 0, 0);
		Caminhao caminhao = new Caminhao("Marca", "Modelo", "Placa", "Cor", 0.0f, false, 0, 0, 0.0, 0.0f, "Carga");
		
		aviao.Frear();
		aviao.Ligar();
		aviao.Abastecer("1000");
		aviao.Ligar();
		aviao.Acelerar();
		aviao.Frear();
		aviao.Desligar();

	}

}
