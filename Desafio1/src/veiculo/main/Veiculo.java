package veiculo.main;

import java.util.Scanner;

import veiculo.model.VeiculoObjeto;

public class Veiculo {
	
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		int op = 7,qtdgas = 0;
		
		VeiculoObjeto v = new VeiculoObjeto(null, null, null, null, null, null, null, null, null);
		v.setMarca("Honda");	
		v.setModelo("NSX");
		v.setPlaca("ABC-1234");
		v.setCor("Vermelho");
		v.setKm((float) 0.0000);
		v.setisLigado(false);
		v.setLitrosCombustivel(90);
		v.setVelocidade(0);
		v.setPreco(0.0);	
		
		v.estadoAtual();
		do {
			System.out.println("Oque deseja fazer?\nDigite 1 para ligar.\nDigite 2 para acelerar\ndigite 3 para pintar\nDigite 4 para abastecer\nDigite 5 para desligar\nDigite 6 para frear\ndigite 7 para sair\n");
			op = leitor.nextInt();
			switch(op)
			{
			case 1:
				v.Ligar();
				v.estadoAtual();
				break;
			case 2:
				v.Acelerar(v.getVelocidade());
				v.estadoAtual();
				break;
			case 3:
				System.out.println("Digite a cr desejada: ");
				String cor = leitor.next();
				v.setCor(cor);
				v.estadoAtual();
				break;
			case 4:
				System.out.println("quanto deseja abastecer: \nDigite 1 para abastecer 20 litros\nDigite 2 para abastecer 3 litros\nDigite 4 para abastecer 50 litros\ndigite 5 para abastecer 100 litros\n");
				qtdgas = leitor.nextInt();
				switch(qtdgas)
				{
					case 1:
						v.Abastecer(20);
						v.estadoAtual();
						break;
					case 2:
						v.Abastecer(30);
						v.estadoAtual();
						break;
					case 3:
						v.Abastecer(40);
						v.estadoAtual();
						break;
					case 4:
						v.Abastecer(50);
						v.estadoAtual();
						break;
					case 5:
						v.Abastecer(100);
						v.estadoAtual();
						break;				
				}
			case 5:
				v.Desligar();
				v.estadoAtual();
				break;
			case 6:
				v.Frear();
				v.estadoAtual();
				break;
			case 7:
				op = 0;
			}
			
		}while(op != 0);
		leitor.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	
	VeiculoObjeto veiculo = new VeiculoObjeto(null,null,null, null, null, null, null, null, null);	
	
	//Scanner dados = new Scanner(System.in);	
	//System.out.println("Digite uma marca: ");
	
	//String marca = dados.toString();
		
	
	veiculo.setMarca("Honda");	
	veiculo.setModelo("NSX");
	veiculo.setPlaca("ABC-1234");
	veiculo.setCor("Vermelho");
	veiculo.setKm((float) 0.0000);
	veiculo.setisLigado(false);
	veiculo.setLitrosCombustivel(0);
	veiculo.setVelocidade(15);
	veiculo.setPreco(0.0);	
	
	//Printa(veiculo);
	
	veiculo.setVelocidade(Freia(veiculo.getVelocidade()));
	
	if (veiculo.getIsLigado() == true ) {
		
	
	}
	
	//Printa(veiculo);


		}

	public static void Printa(VeiculoObjeto v) {
		
		
		System.out.println("O carro é da marca " +  v.getMarca());
		System.out.println("O modelo do carro é " + v.getModelo());
		System.out.println("A placa é " + v.getPlaca());
		System.out.println("A cor é " + v.getCor());
		System.out.println("Quilometros rodados: " + v.getKm());
		System.out.println("Está " + v.getIsLigado());
		System.out.println("Com " + v.getLitrosCombustivel() + " litros de combustivel.");
		System.out.println("Com a velocidade de " +v.getVelocidade() + "por hora.");
		System.out.println("O preço do carro é de " +v.getPreco());
		
			
		
	}
	
	public static int Freia(int Vel) {
		
		if (Vel > 0 ) {
			Vel -= 10;
			return Vel;
		}
		return 0;
	}
	*/

}
	
	
	
	
	
	

