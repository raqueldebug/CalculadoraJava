import java.util.Scanner;

public class Calculadora { 
	
	public static void main(String[] args) {

        System.out.println("\nCalculadora");

        Scanner input = new Scanner(System.in);

        int memoria;
        int selecione;
        double ms = 0;
        double valor_1;
        double valor_2;
        double resultado = 0;

        while (true) {

            // INSERIR NUMEROS

            System.out.print("\nInsira o primeiro numero: ");
            valor_1 = input.nextInt();

            System.out.print("\nInsira o segundo numero: ");
            valor_2 = input.nextInt();

            // SELECIONAR OPERADOR           

            System.out.print("\nO que voce deseja fazer com os numeros acima?");
            System.out.print("\n1 - Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 0 - Sair: ");
            selecione = input.nextInt();

            if (selecione == 0) {
                System.out.print("\nOperacao finalizada");
                break;
            }
            
            if (selecione == 1) {
                resultado = valor_1 + valor_2;
                System.out.printf("\nResultado da soma = %f%n", resultado);
            }

            if (selecione == 2) {
                resultado = valor_1 - valor_2;
                System.out.printf("\nResultado da subtracao = %f%n", resultado);
            }

            if (selecione == 3) {
                resultado = valor_1 * valor_2;
                System.out.printf("\nResultado da multiplicacao = %f%n", resultado);
            }

            if (selecione== 4) {
                resultado = valor_1 / valor_2;
                System.out.printf("\nResultado da divisao = %f%n", resultado);
            }
            
            if (selecione < 1 || selecione > 4) {
                System.out.print("\nOperador invalido.");
                break;
            }

            // ARMAZENAR O RESULTADO

            System.out.print("\nDeseja armazenar o resultado na memoria (MS)?");
            System.out.print("\n1 - Somar (M+) / 2 - Subtrair (M-) / 3 - Nao Armazenar / 0 - Sair: ");
            
            memoria = input.nextInt();
            
            if (memoria == 1) {
                ms += resultado;
                System.out.print("\nO resultado foi somado ao valor da memoria.");
                System.out.printf("\nMemoria armazenada (MS) = %f%n", ms);
            }
            
            if (memoria == 2) {
                ms -= resultado;
                System.out.print("\nO resultado foi subtraido do valor da memoria.");
                System.out.printf("\nMemoria armazenada (MS) = %f%n", ms);
            }

            if (memoria == 3) {
                System.out.print("\nO valor da memoria nao foi alterado.");
                System.out.printf("\nMemoria armazenada (MS) = %f%n", ms);
                continue;
            }
            if (memoria == 0) {
                System.out.print("\nOperacao finalizada");
                break;
            }
            
            if (memoria < 0 || memoria > 3) {
                System.out.print("\nEntrada invalida, o valor nao foi salvo.");
                System.out.printf("\nMemoria armazenada (MS) = %f%n", ms);
                continue;
            }

            // DESEJA CONTINUAR?

            System.out.print("\nDeseja continuar?");
            System.out.print("\n1 - Sim / 0 - Sair: ");
            
            selecione = input.nextInt();

            if (selecione == 0) {
                System.out.print("\nOperacao finalizada");
                break;
            }
        }
	}
}