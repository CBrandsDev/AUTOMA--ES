import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando as variáveis para armazenar o maior e o menor valor
        int bigger = Integer.MIN_VALUE;
        int lower = Integer.MAX_VALUE;
        
        System.out.println("Type a positive values(type a negative value to stop the program)");
        
        // Loop para ler os valores
        while (true) {
            int value = scanner.nextInt();
            if (value < 0)
                break;
            if (value > bigger)
                bigger = value;
            if (value < lower)
                lower = value;
        }
        if (bigger != Integer.MIN_VALUE) {
            System.out.println("the most bigger value informed: " + bigger);
            System.out.println("the most lower value informed " + lower);
        } else {
            System.out.println("any positve value informed...");
        }
        
        scanner.close();
    }
}