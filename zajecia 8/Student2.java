import java.util.ArrayList;
import java.util.Collections;

public class Student2 implements Comparable<Student2>{
    String imie;
    double sredniaOcen;
    int rokStudiow;

    public Student2(double sredniaOcen, int rokStudiow) {
        this.sredniaOcen = sredniaOcen;
        this.rokStudiow = rokStudiow;
    }

    @Override
    public int compareTo(Student2 o) {
        if(this.sredniaOcen == o.sredniaOcen){
            return (int)Math.signum(this.rokStudiow-o.rokStudiow);
        }
        return (int)Math.signum(o.sredniaOcen-this.sredniaOcen);
    }

    @Override
    public String toString() {
        return " "+"sredniaOcen=" + sredniaOcen + ", rokStudiow=" + rokStudiow;
    }

    public static void main(String[] args){
        var studenci = new ArrayList<Student2>();
        studenci.add(new Student2(4.5, 1));
        studenci.add(new Student2(4.5, 2));
        studenci.add(new Student2(4.7, 1));
        studenci.add(new Student2(4.8, 1));
        studenci.add(new Student2(5.0, 1));

        System.out.println(studenci);
        Collections.sort(studenci);
        System.out.println(studenci);
    }
}
