public class App {
    public static void main(String[] args) {
        int n = 3; // tamanho do tabuleiro 3x3
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        // imprimir tabuleiro
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
                if (j < n - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println(); // nova linha

            if (i < n - 1) {

                for (int k = 0; k < n * 4 - 1; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}