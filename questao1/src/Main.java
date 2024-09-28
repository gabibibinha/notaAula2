import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        SistemaBancar sb = new SistemaBancar();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();

        int tipoConta;
        int opCorrente;
        int opPoupanca;
        String repetir;

        System.out.println("NOME DO TITULAR:");
        sb.setTitular(sc2.nextLine());

        System.out.println("Olá, " + sb.getTitular());
        System.out.printf("Seu saldo inicial é R$%.2f%n", sb.getSaldo());

        do {
            System.out.println("Digite:\n[1] Conta Corrente\n[2] Conta Poupança");
            tipoConta = scanner.nextInt();

            switch (tipoConta) {
                case 1: // Conta Corrente
                    System.out.println("Digite o código da operação:\n[1] Depositar\n[2] Sacar\n[3] Usar cheuqe especial\n[4] Exibir dados da conta");
                    opCorrente = scanner.nextInt();
                    switch (opCorrente) {
                        case 1: // Depositar conta corrente
                            System.out.print("DIGITE O VALOR DO DEPÓSITO: R$");
                            cc.setDeposito(scanner.nextDouble());
                            cc.depositar();
                            break;
                        case 2: // Sacar conta corrente
                            System.out.print("DIGITE O VALOR DO SAQUE: R$");
                            cc.setSaque(scanner.nextDouble());
                            cc.sacar();
                            break;
                        case 3: // Usar cheque especial
                            System.out.print("DIGITE O VALOR DO SAQUE COM CHEQUE ESPECIAL: R$");
                            cc.setSaqueChequeEspecial(scanner.nextDouble());
                            cc.usarChequeEspecial();
                            break;
                        case 4: // Exibir dados da conta
                            System.out.println("TITULAR: " + sb.getTitular());
                            System.out.printf("SALDO DA CONTA: R$%.2f%n", cc.getSaldo());
                            System.out.printf("SALDO DO CHEQUE ESPECIAL: R$%.2f%n", cc.getSaldoChequeEspecial());
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA");
                            break;
                    }
                    break;
                case 2: // Conta Poupança
                    System.out.println("Digite o código da operação:\n[1] Depositar\n[2] Sacar\n[3] Calcular rendimento\n[4] Exibir dados da conta");
                    opPoupanca = scanner.nextInt();
                    switch (opPoupanca) {
                        case 1: // Depositar conta poupança
                            System.out.print("DIGITE O VALOR DO DEPÓSITO: R$");
                            cp.setDeposito(scanner.nextDouble());
                            cp.depositar();
                            break;
                        case 2: // Sacar conta poupança
                            System.out.print("DIGITE O VALOR DO SAQUE: R$");
                            cp.setSaque(scanner.nextDouble());
                            cp.sacar();
                            break;
                        case 3: // Calcular rendimento
                            System.out.print("DIGITE O VALOR DA SELIC (%):");
                            cp.setSelic(scanner.nextDouble());
                            cp.calcularRendimento();
                            break;
                        case 4: // Exibir dados da conta
                            System.out.println("TITULAR: " + sb.getTitular());
                            System.out.printf("SALDO DA POUPANÇA: R$%.2f%n", cp.getSaldo());
                            System.out.printf("RENDIMENTO DO MÊS: R$%.2f%n", cp.getRendimento());
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA");
                            break;
                    }
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
            System.out.println("\nDeseja repetir a operação? [S/N]");
            repetir = sc2.nextLine();
        } while(repetir.equalsIgnoreCase("S"));
    }
}