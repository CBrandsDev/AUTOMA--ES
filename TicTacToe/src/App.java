import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstPlayerCollum = 0;


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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tic Tac Toe");
        System.out.print("First Player Moves:\n");
        System.out.print("Select a collum (1-3): ");
        
        int selectedColumn = scanner.nextInt();
        
        while (selectedColumn < 1 || selectedColumn > 3) {
            System.out.print("Please select a valid column (1-3): ");
            selectedColumn = scanner.nextInt();
        }
        System.out.println("You selected column: " + selectedColumn);
        System.out.print("First Player Moves:\n");
        System.out.print("Select a Row (1-3): ");

        int selectedRow = scanner.nextInt();

        while (selectedRow < 1 || selectedRow > 3) {
            System.out.print("Please select a valid row (1-3): ");
            selectedRow = scanner.nextInt();
        }
        System.out.println("You selected row: " + selectedRow);

        // imprimir o tabuleiro atualizado

        for(int i = 0; i < n; i++) {
            
        }
    }
}