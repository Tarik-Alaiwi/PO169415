import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try{
//            checkAge(20);
//            checkAge(12);
//            checkAge(18);
//        }catch (IllegalArgumentException e){
//            System.out.println("Age under 18");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 2 liczby: ");
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            try{
                System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println("dzielenie przez 0");
            }
        }catch (InputMismatchException e){
            System.out.println("argument nie jest liczba");
        }


    }
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age under 18");
        }else{
            System.out.println(age);
        }
    }
}