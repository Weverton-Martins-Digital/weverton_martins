import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Mensagem de boas-vindas
        System.out.println("Olá! Seja muito bem-vindo(a) ao nosso sistema!");

        int userDecision;

        while (true) {
            // Menu principal
            System.out.println("\n--- Escolha uma opção abaixo: ---");
            System.out.println("[1] Abrir a Calculadora");
            System.out.println("[2] Ler nosso Guia Rápido");
            System.out.println("[3] Sair do Sistema");
            System.out.print("Sua escolha: ");

            try {
                userDecision = entrada.nextInt(); // Recebe a opção do usuário

                switch (userDecision) {
                    case 1:
                        System.out.println("\nCalculadora a caminho! Preparando os números...");
                        calculadora(entrada); // Caminhar para a calculadora
                        break;
                        
                    case 2:
                        System.out.println("\nAbrindo o Guia de Suporte... Sua jornada começa agora!");
                        guia(entrada);
                        break;

                    case 3:
                        System.out.println("\nAté a próxima! Foi um prazer te ajudar. Volte sempre!");
                        return; // Sai do programa

                    default:
                        System.out.println("\nOpção inválida! Por favor, digite um número entre 1 e 3.");
                        entrada.next(); // Limpa o buffer de entrada
                }

            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida! Por favor, digite apenas números inteiros.");
                entrada.next(); // Limpa o buffer de entrada para evitar loop infinito
            }
        }
    }

    public static void calculadora(Scanner entrada) {
        System.out.println("\n--- Bem-vindo(a) á nossa cálculadora ---");

        // Declaração de variável
        double number1 = 0, number2 = 0;

        // Verificação de prosseguir
        int calcuDecision = 0;

        while (true) {
            // Receber os dados de entrada do usuário
            System.out.print("\nDigite o primeiro número: ");
            number1 = entrada.nextDouble();

            System.out.print("Digite o segundo número: ");
            number2 = entrada.nextDouble();

            // Imprimir as opções que o usuário pode escolher
            System.out.println("\n--- O que você gostaria de saber? ---");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Sair da Cálculadora");
            System.out.print("Sua escolha: ");

            try {
                calcuDecision = entrada.nextInt();
                double resultado;

                switch (calcuDecision) {
                    case 1:
                        resultado = number1 + number2;
                        System.out.println("O Resultado é: " + resultado);
                        break;

                    case 2:
                        resultado = number1 - number2;
                        System.out.println("O Resultado é: " + resultado);
                        break;

                    case 3:
                        resultado = number1 * number2;
                        System.out.println("O Resultado é: " + resultado);
                        break;

                    case 4:
                        resultado = number1 / number2;
                        System.out.println("O Resultado é: " + resultado);
                        break;

                    case 5:
                        System.out.println("Até a próxima! Foi um prazer te ajudar. Volte sempre!");    
                        return;

                    default:
                        System.out.println("\nOpção inválida! Por favor, digite um número entre 1 e 3.");
                        entrada.next(); // Limpa o buffer de entrada
                }

            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida! Por favor, digite apenas números inteiros.");
                entrada.next(); // Limpa o buffer de entrada para evitar loop infinito
            }
        }
    }

    public static void guia(Scanner entrada) {
        System.out.println("\n--- Bem-vindo(a) ao nosso Guia de Suporte! ---");

        int guiaDecition;

        while (true) {
            // Menu do guia
            System.out.println("\n--- O que você gostaria de saber? ---");
            System.out.println("[1] Últimas Atualizações");
            System.out.println("[2] Conheça Nossa Equipe");
            System.out.println("[3] Sobre Nós");
            System.out.println("[4] Voltar para a Calculadora");
            System.out.println("[5] Sair do Guia e do Sistema");
            System.out.print("Sua escolha: ");

            try {
                guiaDecition = entrada.nextInt(); // Recebe a opção do usuário

                switch (guiaDecition) {
                    case 1:
                        System.out.println("\nEstamos sempre trabalhando para melhorar! Novas atualizações em breve...");
                        break;

                    case 2:
                        System.out.println("\nNossa equipe é formada por: Gestor Weverton e muitos outros talentos!");
                        break;

                    case 3:
                        System.out.println("\nSomos uma equipe iniciante e apaixonada por tecnologia, buscando sempre inovar!");
                        break;
                        
                    case 4:
                        System.out.println("\nRetornando à Calculadora... Vamos aos cálculos!");
                        calculadora(entrada); // Retorna para a calculadora
                        return; // Retorna ao menu principal

                    case 5:
                        System.out.println("\nObrigado por utilizar nosso guia! Volte sempre!");
                        System.exit(0); // Fecha o sistema por completo

                    default:
                        System.out.println("\nOpção inválida! Por favor, digite um número entre 1 e 5.");
                        entrada.next(); // Limpa o buffer de entrada
                }

            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida! Por favor, digite apenas números inteiros.");
                entrada.next(); // Impede que ocorra um loop infinito
            }
        }
    }
}