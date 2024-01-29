package sports;

import java.util.Arrays;
import java.util.Objects;

public class FootballPlayer implements Cloneable{
    private String name;
    private int[] goals = new int[5];

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        if(goals.length>5){
            for(int i=0; i<5; i++){
                this.goals[i] = goals[i];
            }
        }else{
            this.goals = goals;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGoals() {
        return goals;
    }

    public void setGoals(int[] goals) {
        if(goals.length>5){
            for(int i=0; i<5; i++){
                this.goals[i] = goals[i];
            }
        }else{
            this.goals = goals;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballPlayer that = (FootballPlayer) o;
        return this.name.equals(that.name) && this.goals.equals(that.goals);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(goals);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FootballPlayer cloned = (FootballPlayer) super.clone();
        cloned.goals = this.goals.clone();
        return cloned;
    }

    public void setGoalsAtIndex(int id, int goal){
        this.goals[id] = goal;
    }
}
