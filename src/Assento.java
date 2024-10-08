// 1 – Implemente as classes a seguir
// a) Classe Assento que tem o seguinte atributo:
// • disponivel[ ][ ] → uma matriz booleana (5 filas e 4 lugares em cada fila) que
// armazena true se o assento está disponível e false se tiver sido vendido.

// No mínimo o método:
// • mostraLugares → que deve retornar um String contendo as informações da matriz
// disponivel da seguinte maneira: Se o assento estiver ocupado, coloque um X, se
// ele estiver vazio, deixe em branco, como mostrada abaixo:
// | | | |
// | X | | |

public class Assento {
    private boolean[][] disponivel = new boolean[5][4];

    // Construtor para percorrer a matriz que começa em true.
    public Assento() {
        for (int i = 0; i < disponivel.length; i++) {
            for (int j = 0; j < disponivel[j].length; j++) {
                disponivel[i][j] = true;
            }
        }

    }

    // Mostra os assentos ocupados em | X | e se tiver em branco | |
    public String mostraLugares() {
        StringBuilder builder = new StringBuilder();
        int filas = disponivel.length;
        int colunas = disponivel[0].length;

        builder.append("   ");
        for (int j = 0; j < colunas; j++) {
            builder.append(String.format("%3d ", j + 1));
        }
        builder.append("\n");

        for (int i = 0; i < filas; i++) {
            builder.append(String.format("%2d ", i + 1));

            for (int j = 0; j < colunas; j++) {
                if (disponivel[i][j]) {
                    builder.append("[ ] ");
                } else {
                    builder.append("[X] ");
                }
            }
            builder.append("\n\n");
        }

        return builder.toString();
    }

    // Vende e marca como ocupado.
    public boolean venderAssento(int fila, int lugar) {
        if (disponivel[fila][lugar]) {
            disponivel[fila][lugar] = false; // Marca o assento como ocupado
            return true; // Venda realizada com sucesso
        } else {
            return false; // Assento já vendido
        }
    }

    public int getNumFilas() {
        return disponivel.length;
    }

    public int getNumAssentosPorFila() {
        return disponivel[0].length;
    }
}
