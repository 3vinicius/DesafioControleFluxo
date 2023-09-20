import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = validationNumber(terminal);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = validationNumber(terminal);

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e);
		}
		
	}


	//Fazendo uma chamada recursiva para validar o numero
	static Integer validationNumber(Scanner terminal) {
		if (terminal.hasNextInt()) {
			return terminal.nextInt();
		}
		System.out.println("Entrada Invalida: Digite um número valido");
		terminal.next();
		return validationNumber(terminal);
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (contagem < 0) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
				
        
		//realizar o for para imprimir os números com base na variável contagem
				System.out.println("RESULTADOS");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número "+i);
        }
				}
		
	}
}

