public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        if(age<0)
            age = 0;
        if(firstName.isEmpty() || firstName == null){
            firstName = "";
        }
        if(lastName.isEmpty() || lastName == null){
            lastName = "";
        }
    }
}
