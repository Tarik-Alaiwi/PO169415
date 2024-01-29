package student;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord {
        if(gpa<0 || gpa>4) throw new IllegalArgumentException();
    }

    public boolean isHonorStudent(){
        return gpa>=3.5 ? true : false;
    }

    public void printDetails(){
        System.out.println(name + ", id: " + id + ", gpa: "+gpa);
    }
}
