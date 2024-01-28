package sports;

public class Athlete {
    private String name;
    private String nationality;
    private double[] records;

    public Athlete(String name, String nationality, double[] records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double[] getRecords() {
        return records;
    }

    public void setRecords(double[] records) {
        this.records = records;
    }

    public String printArray(double[] arr){
        String res = "";
        for(double i:arr){
            res += i + ", ";
        }
        return res;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " name: " + name + ", nation: "+ nationality + ", records: " + printArray(this.records);
    }
}
