import java.util.Scanner;
import Apoio.Matematica;
import javax.swing.JOptionPane;

public class Calculadora { 
	
	public static void main(String[] args) {

        System.out.println("\nCalculadora");

        Scanner input = new Scanner(System.in);
        Matematica m = new Matematica();

        int memoria;
        int selecione;
        double ms = 0;
        double valor1;
        double valor2;
        double resultado = 0;

        while (true) {

            // INSERIR NUMEROS

            // prompt user to enter first number
            String insert1 = JOptionPane.showInputDialog("Insira o primeiro numero:");
            valor1 = Double.valueOf(insert1).doubleValue();

            // prompt user to enter second number
            String insert2 = JOptionPane.showInputDialog("Insira o segundo numero:");
            valor2 = Double.valueOf(insert2).doubleValue();

            // SELECIONAR OPERADOR           

            String insert3 = JOptionPane.showInputDialog("O que voce deseja fazer com os numeros digitados?\n1 - Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 0 - Sair:");
            selecione = Integer.parseInt(insert3);
            
            if (selecione == 0) {
            	JOptionPane.showMessageDialog(null, "Operação finalizada.");
                break;
            }
            
            if (selecione == 1) {
                m.somar(valor1, valor2);
                System.out.printf("\nResultado da soma = %f%n", m.resultado);
            }

            if (selecione == 2) {
                m.subtrair(valor1, valor2);
                System.out.printf("\nResultado da subtracao = %f%n", m.resultado);
            }

            if (selecione == 3) {
                m.multiplicar(valor1, valor2);
                System.out.printf("\nResultado da multiplicacao = %f%n", m.resultado);
            }

            if (selecione== 4) {
                m.dividir(valor1, valor2);
                System.out.printf("\nResultado da divisao = %f%n", m.resultado);
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
                ms += m.resultado;
                System.out.print("\nO resultado foi somado ao valor da memoria.");
                System.out.printf("\nMemoria armazenada (MS) = %f%n", ms);
            }
            
            if (memoria == 2) {
                ms -= m.resultado;
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