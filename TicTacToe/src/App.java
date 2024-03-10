import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    // Criar o jogo, o tabuleiro e o vencedor
    Board board = new Board();
    printBoard(board);
    String winner = playGame(board);
    printWinner(winner);    
}

private static String playGame(Board board) {
    return null;
    // criar os objetos players
    
    Player X = new Player("X", board);   
    Player O = new Player("O", board);  
    
    Scanner in = new Scanner(System.in);
    
    // trocar de player e repetir a função de escolha linha coluna

    Player currPlayer;
    int turnCount = 0;
    int play;
    boolean hasWon = false;
    String winner = "Tie";

    boolean keepPlaying = true;
    while (keepPlaying) {
        printBoard(board);
        turnCount++;


        if (turnCount % 2 == 0) {
            currPlayer = O;
        } else {
            currPlayer = X;
        }
        System.out.print(currPlayer.getName() + ", make a move (1 - 9)" );
        play = in.nextInt();
        
        hasWon = currPlayer.makePlay(Player.cells[play -1]);
        
        if (hasWon) {
            // fazer a detecção do tabuleiro
            winner = currPlayer.getName();
            keepPlaying = false;
        }
        
        // verificar se o tabuleiro está completo
        if (turnCount == 9) {
            keepPlaying = false;
        }
    }
    return winner;
    
    // definir vencedores

    private static void printWinner(String winner) {
        if (winner.equals("Tie")) {
            System.out.println("It's a tie!");
        } else {
            System.out.println(winner + " won!");
        }
    }
    
    
}
}