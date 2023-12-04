package desconto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		double valor, desconto, porc; 

		System.out.println("Vamos verificar o desconto em porcentagem sobre o valor. \nDigite aqui o preço em R$: ");
		valor = entrada.nextDouble();

		System.out.println("Digite aqui a porcentagem: ");
		porc = entrada.nextDouble();
		
		desconto = valor * (porc/100);
		double valorcomDesconto = valor - (desconto);

		System.out.printf("O desconto de %.2f%% sobre o valor R$%.2f resulta em: R$%.2f\n", porc, valor, valorcomDesconto);
	
		
		
	}

}