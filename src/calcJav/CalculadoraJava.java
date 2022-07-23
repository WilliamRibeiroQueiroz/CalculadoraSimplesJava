package calcJav;

import java.util.*;

public class CalculadoraJava {

	public static void main(String[] args) {

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int num1 = 0;
			int num2 = 0;
			char operador = '0';
			int resultado = 0;
			char questionContinue1 = 's';

			while(true){
				try {

					num1 = scan.nextInt();
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("Esse não é um número válido");
					System.out.println("Por favor digite um número válido");
					scan = new Scanner (System.in);
				}
			}
			System.out.println("Digite outro número: ");
			while(true){
				try {

					num2 = scan.nextInt();
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("Esse não é um número válido");
					System.out.println("Por favor digite um número válido");
					scan = new Scanner (System.in); 
				}
			}

			int i = 1;
			while(i == 1) {
				System.out.println("Escolha um dos operadores; \n"


					+ "(1) Para Somar. \n"
					+ "(2) Para Subtrair \n"
					+ "(3) Para Multiplicar \n"
					+ "(4) Para Dividir \n");
				operador = scan.next().charAt(0);

				if (operador == '1'){
					resultado = num1 + num2;
					i = 0;
				}
				else if (operador == '2'){
					resultado = num1 - num2;
					i = 0;
				}
				else if (operador == '3') {
					resultado = num1 * num2;
					i = 0;
				}
				else if (operador == '4') {
					resultado = num1 / num2;
					i = 0;
				}
				else {
					System.out.println("Valor inválido. Digite um dos operadores");
				}
			}
			System.out.println("O resultado é " + resultado);



			while(i == 0) {

				System.out.println("Deseja continuar? \n"
						+ "(s) para sim.\n"
						+ "(n) para não.\n");
				questionContinue1 = scan.next().charAt(0);
				questionContinue1 = Character.toLowerCase(questionContinue1);

				if (questionContinue1 == 's') {
					System.out.println("Calculadora reiniciada!!");
					i = 1;
				}
				else if (questionContinue1 == 'n'){
					System.out.println("Calculadora desligada!!");
					i = 2;
					break;
				}
				else {
					System.out.println("Valor inválido");
				}
			}
			if (i == 2) {
				break;
			}

		}

	}

}
