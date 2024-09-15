
// c) Classe cinema que contém o método main e um menu:
// 1 – Cadastrar
// 2 – Vender
// 3 – Sair
// Cada opção do menu deve ser um método, exceto a opção 3. Assim, teremos pelo menos
// 2 métodos:
// • Cadastrar: vai pedir ao usuário as informações de 5 seções e cadastrá-las.
// • Venda: deve mostrar na tela todas as seções (nome do filme e horário). Assim, o
// usuário deve escolher a sessão. Em seguida, deve mostrar na tela os lugares da
// sessão, para que o usuário escolha a fila e o assento disponível para comprar.
// Então realiza a venda.
import java.util.Scanner;

public class Cinema {
    static Scanner ler = new Scanner(System.in);
    static Sessao[] sessao = new Sessao[5];
    static int quantSessao = 0;

    public static void main(String[] args) {
        char opcao;

        do {

            Utils.titleApp();

            System.out.println("    APLICATIVO CINEMA   \n" +
                    "\n1- Cadastrar sessão\n" +
                    "2- Vender Ingressos\n" +
                    "3- Sair do Programa\n" +
                    "\nEscolha uma opção para prosseguir: ");

            opcao = ler.next().charAt(0);

            switch (opcao) {
                case '1':
                    ler.nextLine();
                    cadastrarSessao(sessao);
                    break;
                case '2':
                    ler.nextLine();
                    venderSessao(sessao);
                    break;
                case '3':
                    ler.nextLine();
                    System.out.println("\nSaindo do programa...\n");
                    System.exit(0);
                default:
                    System.out.println("\nOpção Inválida! Favor digitar um  número de (1 a 3) para prosseguir!\n");
                    break;
            }
        } while (opcao != 3);

    }

    public static void cadastrarSessao(Sessao[] sessao) {
        String nomeFilme, horario;

        if (quantSessao >= sessao.length) {
            System.out.println("\nNúmero máximo de seções cadastradas.\n");
            System.out.println("Pressione qualquer tecla para continuar...");
            ler.nextLine();

            return;
        }

        for (int i = quantSessao; i < sessao.length; i++) {

            Utils.titleApp();

            System.out.println("\n─ Cadastro da sessão " + (i + 1) + " ─\n");

            System.out.print("Digite o nome do filme: ");
            nomeFilme = ler.nextLine();

            System.out.print("Digite o horário da sessão (ex: 20:00): ");
            horario = ler.nextLine();

            sessao[i] = new Sessao(nomeFilme, horario);
            quantSessao++;
        }

        System.out.println("\nTodas as seções foram cadastradas com sucesso!");
    }

    public static void venderSessao(Sessao[] sessoes) {
        int fila = 0, assento = 0;
        Sessao sessao;

        Utils.titleApp();

        if (sessoes.length == 0) {
            System.out.println("\nNenhuma sessão cadastrada. Cadastre seções primeiro.");
            return;
        }

        // Exibição das Sessões:
        System.out.println("\nEscolha uma Sessao:");
        for (int i = 0; i < sessoes.length; i++) {

            System.out.println("\n" +
                    (i + 1) + ": " + "Filme em Cartaz: " + sessoes[i].getNomeFilme() + "\n" + "─ " + "Horário: "
                    + sessoes[i].getHorario());
        }

        // Escolher uma Sessão cadastrada:
        System.out.print("\nEscolha o número da sessão: ");
        int escolha = ler.nextInt() - 1;
        ler.nextLine();

        System.out.println("  ");

        if (escolha < 0 || escolha >= sessoes.length) {
            System.out.println("\nsessão inválida.");
            return;
        } else {
            sessao = sessoes[escolha];
        }

        System.out.print(sessao.mostrarLugaresSecao());

        // Escolher uma fila(0 a 4) e um assento(0 a 3):
        do {

            System.out.print("Escolha a fila (1 a " + (sessao.getAssento().getNumFilas()) + "): ");
            fila = ler.nextInt();

            if (fila < 1 || fila > sessao.getAssento().getNumFilas()) {
                System.out.print("Fila Inexistente!");
            }

        } while (fila < 1 || fila > sessao.getAssento().getNumFilas());

        do {

            System.out.print("Escolha a fileira (1 a " + (sessao.getAssento().getNumAssentosPorFila()) + "): ");
            assento = ler.nextInt();

            if (assento < 1 || assento > sessao.getAssento().getNumAssentosPorFila()) {
                System.out.print("Assento Inexistente!");
            }

        } while (assento < 1 || assento > sessao.getAssento().getNumAssentosPorFila());

        ler.nextLine();

        // A venda doa sessão:
        boolean sucesso = sessao.venda(fila - 1, assento - 1);

        if (sucesso) {

            sessao.imprimirIngresso();

            System.out.println("\nAperte qualquer tecla para continuar.\n");
            ler.nextLine();
        } else {
            System.out.println("\nAssento já vendido ou inválido.\n");
            System.out.println("\nAperte qualquer tecla para continuar.\n");
            ler.nextLine();
        }
    }

}
