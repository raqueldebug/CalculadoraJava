import javax.swing.JOptionPane;
import Apoio.Matematica;


public class Cal {


    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Calculadora");

        Matematica m = new Matematica();

        int memoria;
        int selecione;
        double ms = 0;
        double valor1;
        double valor2;

        while (true) {

            // INSERIR NUMEROS

            // prompt user to enter first number
            String insert1 = JOptionPane.showInputDialog("Insira o primeiro numero:");
            valor1 = Double.valueOf(insert1).doubleValue();

            // prompt user to enter second number
            String insert2 = JOptionPane.showInputDialog("Insira o segundo numero:");
            valor2 = Double.valueOf(insert2).doubleValue();

            // SELECIONAR OPERADOR

            String insert3 = JOptionPane.showInputDialog("O que voce deseja fazer com os numeros digitados?\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n0 - Sair");
            selecione = Integer.parseInt(insert3);

            if (selecione == 0) {
                JOptionPane.showMessageDialog(null, "Operação finalizada.");
                break;
            }


            switch (selecione) {

                case 1:
                    m.somar(valor1, valor2);
                    JOptionPane.showMessageDialog(null, "Resultado da soma = " + m.getResultado());

                    break;
                case 2:
                    m.subtrair(valor1, valor2);
                    JOptionPane.showMessageDialog(null, "Resultado da subtracao = " + m.getResultado());
                    break;

                case 3:
                    m.multiplicar(valor1, valor2);
                    JOptionPane.showMessageDialog(null, "Resultado da multiplicação = " + m.getResultado());
                    break;
                case 4:
                    m.dividir(valor1, valor2);
                    JOptionPane.showMessageDialog(null, "Resultado da divisão = " + m.getResultado());
                    break;


            }

            if (selecione < 1 || selecione > 4) {
                System.out.print("\nOperador invalido.");
                JOptionPane.showMessageDialog(null, "Operador invalido.");
                break;
            }

            // ARMAZENAR O RESULTADO

            String insert4 = JOptionPane.showInputDialog("Deseja armazenar o resultado na memoria (MS)?\n1 - Somar (M+)\n2 - Subtrair (M-)\n3 - Nao Armazenar\n0 - Sair");

            memoria = Integer.parseInt(insert4);


            switch (memoria) {
                case 1:
                    ms += m.getResultado();
                    JOptionPane.showMessageDialog(null, "O resultado foi somado ao valor da memoria.\nMemoria armazenada (MS) = " + ms);
                    break;
                case 2:
                    ms -= m.getResultado();
                    JOptionPane.showMessageDialog(null, "O resultado foi subtraido ao valor da memoria.\nMemoria armazenada (MS) = " + ms);
                    break;
                case 3:

                    JOptionPane.showMessageDialog(null, "O valor da memoria nao foi alterado.\nMemoria armazenada (MS) = " + ms);
                    continue;
                    

            }
          

         
            if (memoria == 0) {
                JOptionPane.showMessageDialog(null, "Operação finalizada.");
                break;
            }

            if (memoria < 0 || memoria > 3) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, o valor nao foi salvo.\nMemoria armazenada (MS) = " + ms);
                continue;
            }

            // DESEJA CONTINUAR?

            String insert5 = JOptionPane.showInputDialog("Deseja continuar?\n1 - Sim\n0 - Sair:");

            selecione = Integer.parseInt(insert5);

            if (selecione == 0) {
                JOptionPane.showMessageDialog(null, "Operação finalizada.");
                break;
            }
        }
    }

}
