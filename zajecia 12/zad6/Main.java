package zad6;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run){
            try{
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = a/b;
                System.out.println(result);
                run = false;
            }catch (InputMismatchException e){
                System.out.println("Error: " + e);
                scanner.nextLine();
            }
            catch (ArithmeticException e){
                System.out.println("Error: " + e);
            }
        }
    }
}
