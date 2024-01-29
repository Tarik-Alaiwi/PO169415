package student;

public class TestStudentRecord {
    public static void main(String[] args){
        StudentRecord s1 = new StudentRecord("marek", "10001", 3.5);
        StudentRecord s2 = new StudentRecord("karol", "10002", 2.5);

        s1.printDetails();
        s2.printDetails();

        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
