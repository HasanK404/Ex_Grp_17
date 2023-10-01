import java.util.Scanner;

public class Keyboard {
    private Scanner scanner;

    public Keyboard() {
        scanner = new Scanner(System.in);
    }

    public int getProductID() {
        System.out.print("Enter product ID: ");
        return scanner.nextInt();
    }
}
