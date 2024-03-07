import java.util.Scanner;

public class Player {


    private String name;
    private Scanner nm;
    private int selectedCollumn;
    private int selectedRow;

    private Player() {
    }

    public Player(String name) {
        this.name = name;
        nm = new Scanner(System.in);
        this.selectedRow = -1;
        this.selectedCollumn = -1;
    }

    public void getCollumn() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a collumn (1 - 3): ");
        float selectedCollumn = scanner.nextInt();
        while (selectedCollumn < 1 || selectedCollumn > 3) {
            System.out.println("Please selected a valid collumn (1-3): ");
            selectedCollumn = scanner.nextInt();
        }

        return selectedCollumn;
    }
    

    
}