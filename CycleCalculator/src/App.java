public class App {
    public static void main(String[] args) {
        Prints print = new Prints();
        Code code = new Code();

        print.clean();
        print.main();
        code.insertDate();
        print.clean();
    }
}