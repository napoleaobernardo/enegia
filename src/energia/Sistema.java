package energia;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Conta conta;
        String op;
        do {
            System.out.println("\n*****CONTA ENERGÉTICA*****");
            System.out.println("Digite C para Comercial");
            System.out.println("Digite I para Indrustrial");
            System.out.println("Digite R para Residencial");
            System.out.println("Digite S para Sair do sistema");
            op = leia.next();
            switch (op) {
                case "S":
                    System.out.println("Sistema encerrado");
                    System.exit(0);
                default:
                    switch (op) {
                        case "R":
                            conta = new Residencial();
                            System.out.println("Informe o nome do Cliente");
                            conta.setNome(leia.next());
                            System.out.println("informe o consumo");
                            conta.setConsumo(leia.nextInt());
                            System.out.println("\nCONTA - RESIDENCIAL");
                            System.out.println("NOME:"+conta.getNome());
                            System.out.println("CONSUMO R$"+conta.getConsumo());
                            System.out.println("TAXA R$"+conta.getTaxa());
                            System.out.println("MULTA R$"+conta.multa(conta.getConsumo()));
                            System.out.println("VALOR CONTA R$"+conta.calcularConta(conta.getConsumo()));
                            break;
                        case "C":
                        case "I":
                        default:
                            System.out.println("Digito incoreto - Sistema Incerrado");
                            System.exit(0);
                    }
            }
        } while (true);
    }

}
