package university;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student>{

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.averageGrade, averageGrade)!=0 ? Double.compare(o.averageGrade, averageGrade) : Integer.compare(yearOfStudy, o.yearOfStudy);
    }
}
