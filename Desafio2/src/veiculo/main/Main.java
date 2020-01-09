package veiculo.main;

import veiculo.model.aviao;
import veiculo.model.carro;
import veiculo.model.veiculo;

public class Main {

	public static void main(String[] args) {
		
		    veiculo v = new veiculo(null, 0, 0, 0);		
			carro c = new carro(null, 0, 0, 0, null, 0, 0);
			aviao a = new aviao(null, 0, 0, 0, null, null);
			
			v.setCombustivel(0);
			v.setModelo(null);
			v.setPassageiros(0);
			v.setVelocidade(0);
			
			c.setPortas(0);
			c.setAno(0);
			c.setMarca(null);
			
			a.setUso("Particular");
			a.setTipo(null);
			
			
			System.out.println(a.getCombustivel());
			
			
			
			
		}
	

}
