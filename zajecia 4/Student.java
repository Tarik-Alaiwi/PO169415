public class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private int yearOfStudy;
    private int gradeAverage;

    public Student(String firstName, String lastName, int indexNumber,
                   int yearOfStudy, int gradeAverage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
        this.gradeAverage = gradeAverage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(int gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public void showInformation(){
        System.out.println(firstName+" "+lastName+"\n"+indexNumber+"\n"+yearOfStudy+"\n"+gradeAverage);
    }
}
