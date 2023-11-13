public class Student {
    public String firstName;
    public String lastName;
    public String fieldOfStudy;

    public Student(String firstName, String lastName, String fieldOfStudy){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String firstName, String lastName){
        this(firstName, lastName, "unknown");
    }
}
