public class Utils {

    public static void titleApp() {
        clearTerminal();

        System.out.println("CINEMA APP - TRABALHO DE LPOO C1 - Prf.Cinthia");
        System.out.println("Alunos: Catherine, Eve, Wilton, Yasmin e Yasmin");
        System.out.println();
    }

    public static void clearTerminal() {
        try {

            if (System.getProperty("os.name").contains("Windows")) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {

                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String centralizarTexto(String texto, int largura) {
        int espacos = (largura - texto.length()) / 2;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < espacos; i++) {
            builder.append(" ");
        }

        builder.append(texto);

        while (builder.length() < largura) {
            builder.append(" ");
        }

        return builder.toString();
    }

}
