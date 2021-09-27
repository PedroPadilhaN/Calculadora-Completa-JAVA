
public class Calculadora {
	// Atributos
	private Double valor1;
	private Double valor2;
	private Double resultado;
	
	// Metodos
	public void iniciarCalculadora() {
		// Objeto da classe Tela
		Tela  tela = new Tela();
		
		String menu = "::: Calculadora ::: \n\n" +
				"1. Adi��o\n" +
				"2. Subtra��o\n" +
				"3. Dividis�o\n" +
				"4. Muiltiplica��o\n" +
				"0. Sair\n\n" +
				"Informe uma das opera��es"
				;
		String operacao = tela.informar(menu);
		
		// Verifica se escolheu Sair
		//if (operacao == "0" { //Recomendado para numeros
		/*if (operacao.equals("0")) { // Formato correto de compara��o de String
			tela.mostrar("Encerrando o sistema...");
			return;		
		}*/
		
		
		
		// Verifica a Opera��o escolhida
		switch (operacao) { //Testa o �ndice (int, string ou char)
		case "0": 
			tela.mostrar("Encerrando o sistema...");
			break;
			
		case "1":
			informarValores(tela); // usuario informa os valores
			resultado = somar();
			tela.mostrar("Resultado: " + resultado);
			//tela.mostrar(somar().toString()); // ENCURTADO
			break;
			
		case "2":
			informarValores(tela);
			resultado = subtrair();
			tela.mostrar("Resultado: "+ resultado);
			break;
			
		case "3":
			informarValores(tela);
			resultado = dividir();
			tela.mostrar("Resultado: " + resultado);
			break;
			
		case "4":
			informarValores(tela);
			resultado = multiplicar();
			tela.mostrar("Resultado: " + resultado);
			break;
			
		default:
			tela.mostrar("Escolha uma das op��es do menu");
			break;
			
		}
		
		/*
		// Verifica a Opera��o escolhida
		if (operacao.equals("1")) {
			somar();
			
		} else if (operacao.equals("2")) {
			//subtrair
			
		} else if (operacao.equals("3")) {
			//dividir
			
		} else if (operacao.equals("4")) {
			//multiplicar
			
		} else {
			tela.mostrar("Escolha uma das op��es do menu");
		}
		*/
	} // fecha iniciarCalcularora()
	private void informarValores(Tela tela) {
			this.valor1 = Double.parseDouble(tela.informar("Informe o primeiro valor"));
			this.valor2 = Double.parseDouble(tela.informar("Informe o segundo valor"));
	}
	private Double somar() {
		return this.valor1 + this.valor2;
	}
	private Double subtrair() {
		return this.valor1 - this.valor2;
	}
	private Double dividir() {
		return this.valor1 / this.valor2;
	}
	private Double multiplicar() {
		return this.valor1 * this.valor2;
	}
}
