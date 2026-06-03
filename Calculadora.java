import java.util.Scanner;
   public static void main (String[] args){
    Scanner leia = new Scanner(System.in);
     int opcao = -1;
        double num1, num2, resultado;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = leia.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = leia.nextDouble();

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado atual: " + resultado);

                        // Submenu de Soma
                        int subOpcao;
                        do {
                            System.out.println("\n1 - Informar mais um número");
                            System.out.println("2 - Voltar para o menu principal");
                            System.out.print("Escolha uma opção: ");
                            subOpcao = leia.nextInt();

                            if (subOpcao == 1) {
                                System.out.print("Informe mais um número: ");
                                double novoNum = leia.nextDouble();
                                resultado += novoNum;
                                System.out.println("Resultado atual: " + resultado);
                            }
                        } while (subOpcao != 2);
                        break;

                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado atual: " + resultado);

                        // Submenu de Subtração
                        do {
                            System.out.println("\n1 - Informar mais um número");
                            System.out.println("2 - Voltar para o menu principal");
                            System.out.print("Escolha uma opção: ");
                            subOpcao = leia.nextInt();

                            if (subOpcao == 1) {
                                System.out.print("Informe mais um número: ");
                                double novoNum = leia.nextDouble();
                                resultado -= novoNum;
                                System.out.println("Resultado atual: " + resultado);
                            }
                        } while (subOpcao != 2);
                        break;

                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Calculadora encerrada!");
        leia.close();
    }

