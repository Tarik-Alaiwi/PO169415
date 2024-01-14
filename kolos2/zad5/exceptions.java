package zad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("podaj liczbe x1: ");
                int x1 = scanner.nextInt();
                System.out.println("podaj liczbe x2: ");
                int x2 = scanner.nextInt();

                try{
                    System.out.println(x1/x2);
                    break;
                }catch (ArithmeticException e){
                    System.out.println("dividing by 0!");
                }
            }catch (InputMismatchException e){
                System.out.println("wrong input!");
                scanner.nextLine();
            }
        }
    }
}
