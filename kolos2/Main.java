import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("x1: ");
                int x1 = scanner.nextInt();
                System.out.println("x2: ");
                int x2 = scanner.nextInt();
                try {
                    System.out.println(x1/x2);
                    break;
                }catch (ArithmeticException e){
                    System.out.println("0 division");
                }
            }catch (InputMismatchException e){
                System.out.println("wrong input");
                scanner.nextLine();
            }
        }
    }
}