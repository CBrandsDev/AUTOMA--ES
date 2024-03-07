import java.util.Scanner;

public class Player {


    private String name;
    private Scanner nm;
    private int position;
    
    public Player(String string, Board board) {
    }

    public Player(String name) {
        this.name = name;
        nm = new Scanner(System.in);
        this.position = -1;
    }

    public String getName() {
        return this.name;
    }
    public Scanner getNm() {
        return this.nm;
    }
    public int getPosition() {
        return this.position;
    }
    

    public Class<Integer> getPosition(Player position) {
        
        Scanner scanner = new Scanner(System.in);
        float position = scanner.nextInt();
        while (position < 1 || position > 9) {
            System.out.print("Select a position (1 - 9): ");
            try {
                position = scanner.nextInt();

            } catch (NumberFormatException e) {
                System.out.println("Insert a valid number (1 - 9): ");
            }
        }
        return int getPosition();

    }
    

    
}