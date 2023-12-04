//import java.text.ParseException;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//
//public class Klient implements Comparable<Klient>{
//    String imie;
//    int nrKilenta;
//    Date ostatnieLogowanie;
//
//    @Override
//    public int compareTo(Klient o) {
//        return (int)Math.signum(o.ostatnieLogowanie - this.ostatnieLogowanie);
//    }
//    public static void main(String[] args) throws ParseException {
//        String date1String = "2019.01.02";
//        String date2String = "2000.01.02";
//        String date3String = "2017.01.02";
//        String date4String = "2010.01.02";
//        String date5String = "2010.03.02";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
//        Date date1 = sdf1.parse(date1String);
//        Date date2 = sdf1.parse(date2String);
//        Date date3 = sdf1.parse(date3String);
//        Date date4 = sdf1.parse(date4String);
//        Date date5 = sdf1.parse(date5String);
//    }
//}
