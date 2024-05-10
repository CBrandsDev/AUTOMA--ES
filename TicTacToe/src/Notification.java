final public class Notification {
    private Notification() {}

    public static void welcome() {
        System.out.println("Welcome to my first Tic Tac Toe game");

        System.out.println();
        System.out.println("Call for your best friend to play with him");


        System.out.println("Click in Y/y to play or any other key to exit.");
    }

    public static int start(String message) {
        if (message.equalsIgnoreCase("Y")) {
            System.out.println("Game starts");
        } else {
            System.out.println("Okay then, come back soon, bye bye!!!");
        }
    }

    public static void name(int index) {
        switch (index) {
            case 1:
                System.out.print("Player one - Enter your name: ");
                break;
            case 2:
                System.out.println("Player Two - Enter your name: ");
                break;
        }
    }
    public static void boardPosition(int index, String playerName) {
        switch (index) {
            case 1:
                System.out.print("Player " + playerName + " ,");
        }
    }
}