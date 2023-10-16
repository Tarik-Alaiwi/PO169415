import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {
//        ArrayList<Integer> listaLiczb = new ArrayList<>();
//
//        for(int i=0; i<10; i++){
//            listaLiczb.add(random.nextInt(21));
//        }
//        System.out.println(listaLiczb);
//        System.out.println();
//
//        odwrocArrayListe(listaLiczb);
//        Integer[] tab = {1, 2, 3};
        ArrayList<Double> lista = new ArrayList<>();

        for(int i=0; i<10; i++){
            lista.add(random.nextDouble(21));
        }
        //System.out.println(lista);

        ArrayList<Integer> lista2 = new ArrayList<>();

        for(int i=0; i<10; i++){
            lista2.add(random.nextInt(21));
        }
        //System.out.println(lista);

        //System.out.println(average(lista));
        //System.out.println(countZeros(lista2));
        //System.out.println(lista2);

        //stringBuilder();

        StringBuilder sb = new StringBuilder("Mariusz");
        //System.out.println(reverseString(sb));
        //System.out.println(sb);

    }

    public static StringBuilder reverseString(StringBuilder sb){
        StringBuilder sb2 = new StringBuilder(sb.reverse());
        sb.reverse();
        return sb2;
    }
    public static boolean czyZawiera(char a, StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==a){
                return true;
            }
        }
        return false;
    }

    public static void stringBuilder(){
        String napis = "bananowy";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<napis.length(); i++){
            if(!czyZawiera(napis.charAt(i), sb)){ //zamiast czyZawiera mozna wbudowanej metody contains xd
                sb.append(napis.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static int countZeros(ArrayList<Integer> lista){
        int iloscZer = 0;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).equals(0)){
                iloscZer++;
            }
        }
        return iloscZer;
    }
    public static double average(ArrayList<Double> lista){
        double suma = 0;
        double srednia;
        if(lista.isEmpty())
            return 0;
        for(int i=0; i<lista.size(); i++){
            suma += lista.get(i);
        }
        srednia = suma/ lista.size();
        return srednia;
    }
    public static void odwrocArrayListe(ArrayList<Integer> listaLiczb){
        for(int i=listaLiczb.size()-1; i>0; i--){
            System.out.print(listaLiczb.get(i));
            System.out.print(" ");
        }
    }
}