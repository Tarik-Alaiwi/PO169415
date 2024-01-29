package sports;

public class TestFootballPlayer {
    public static void main(String[] args){
        FootballPlayer f1 = new FootballPlayer("a", new int[]{1,2,3,4,5,6});

        try {
            FootballPlayer f2 = (FootballPlayer) f1.clone();
            f2.setGoalsAtIndex(4, 10);

            for(int i: f1.getGoals()){
                System.out.println(i);
            }
            System.out.println();
            for(int i: f2.getGoals()){
                System.out.println(i);
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
