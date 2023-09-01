import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade em estoque: " + quantidade);
        do {
            

            String menu = "Menu:\n1. Consultar quantidade em estoque\n2. Adicionar produtos ao estoque\n3. Retirar produtos do estoque\n4. Alterar nome do produto\n5. Sair";
            System.out.println(menu);
            System.out.print("Escolha uma opção: \n");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Quantidade em estoque: " + quantidade);
            } else if (opcao == 2) {
                System.out.print("Quantidade a ser adicionada: ");
                int quantidadeAdicionar = scanner.nextInt();
                quantidade += quantidadeAdicionar;
            } else if (opcao == 3) {
                System.out.print("Quantidade a ser retirada: ");
                int quantidadeRetirar = scanner.nextInt();
                if (quantidadeRetirar <= quantidade) {
                    quantidade -= quantidadeRetirar;
                } else {
                    System.out.println("Quantidade insuficiente em estoque.");
                }
            } else if (opcao == 4) {
                System.out.print("Novo nome do produto: ");
                scanner.nextLine(); // Limpar o buffer
                produto = scanner.nextLine();
            } else if (opcao == 5) {
                System.out.println("Saindo do programa.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            if (quantidade < 10) {
                System.out.println("ALERTA: Quantidade em estoque está abaixo de 10 unidades.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
