import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //SumaCzterechLiczb();
        //NajwiekszaLiczba();
        //DzienTygodnia();
        //RokPrzestepny();
        //SumaCyfr();
        //Tablica10Liczb();
        //ZnakiNaParzystychIndeksach();
        //StringBuilder();
        //palindromLiczb();
    }

    public static void palindromLiczb(){
        System.out.println("Podaj liczbę");
        String l1 = scanner.nextLine();
        String[] l2 = new String[l1.length()];
        int j = 0;

        for (int i = l1.length() - 1; i >= 0; i--) {
            l2[j] = String.valueOf(l1.charAt(i));
            j++;
        }

        for (int i = 0; i < l1.length(); i++) {
            System.out.print(l2[i]);
        }
    }
    
    public static void SumaCzterechLiczb(){
        System.out.println("Podaj 4 liczby");
        Double l1 = scan.nextDouble();
        Double l2 = scan.nextDouble();
        Double l3 = scan.nextDouble();
        Double l4 = scan.nextDouble();

        System.out.println("Suma: "+(l1+l2+l3+l4));
    }

    public static void StringBuilder(){
        System.out.println("Podaj znak");
        String znak = scan.next();
        System.out.println("podaj wysokosc piramidy");
        int wysokosc = scan.nextInt();
        for(int i = 0; i < wysokosc; i++){
            StringBuilder sb = new StringBuilder();
            int liczbaSpacji = wysokosc - i - 1;
            int liczbaZnakow = 2 * i + 1;
            while(liczbaSpacji-- >0)
                sb.append(' ');
            while(liczbaZnakow-- >0)
                sb.append(znak);
            System.out.println(sb.toString());
        }
    }

    public static void ZnakiNaParzystychIndeksach(){
        System.out.println("podaj napis");
        String n = scan.nextLine();
        System.out.println(n);

        for(int i=0; i<n.length(); i++){
            if(i%2==0){
                System.out.println(n.charAt(i));
            }
        }
    }

    public static void Tablica10Liczb(){
        Integer[] tab = new Integer[10];

        for (int i = 0; i < 10; i++){
            tab[i] = i + 1;
        }

        for (int i = 9; i >= 0; i--){
            System.out.println(tab[i]);
        }
    }

    public static void SumaCyfr(){
        System.out.println("podaj liczbe");
        int l = scan.nextInt();
        int suma = 0;

        while(l>0){
            suma = suma+l%10;
            l = l/10;
        }

        System.out.println(suma);
    }

    public static void RokPrzestepny(){
        System.out.println("Podaj rok");
        int rok = scan.nextInt();

        if((rok%400==0) || ((rok%4==0) && (rok%100!=0))){
            System.out.println("Rok jest przestepny");
        } else if ((rok%400!=0) && ((rok%4!=0) || (rok%100==0))) {
            System.out.println("Rok nie jest przestepny");
        }
    }

    public static void DzienTygodnia(){
        System.out.println("Podaj numer dnia tygodnia");
        int dzien = scan.nextInt();

        switch(dzien){
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Bldeny dzien tygodnia");
        }
    }

    public static void NajwiekszaLiczba(){
        System.out.println("Podaj 3 liczby");
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();
        int l3 = scan.nextInt();
        int naj = 0;

        if(l1>l2){
            naj = l1;
            if(l1>l3){
                naj = l1;
            } else if (l1<l3) {
                naj = l3;
            }
        } else if (l1<l2) {
            naj = l2;
            if(l2>l3){
                naj = l2;
            } else if (l2<l3) {
                naj = l3;
            }
        }
        System.out.println(naj);
    }
}
