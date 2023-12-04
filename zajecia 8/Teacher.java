public class Teacher implements Cloneable{
    String name;
    String subject;
    int exp;

    public Teacher(String name, String subject, int exp) {
        this.name = name;
        this.subject = subject;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
                '}';
    }

    @Override
    public Teacher clone() {
        try {
            Teacher clone = (Teacher) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args){
        var t1 = new Teacher("Marek", "matma", 10);
        var t2 = t1.clone();
        t1.exp = 20;
        System.out.println(t1 +" "+ t2);
    }
}
