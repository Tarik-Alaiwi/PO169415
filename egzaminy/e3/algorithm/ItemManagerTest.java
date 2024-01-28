package algorithm;

public class ItemManagerTest {
    public static void main(String[] args){
        ItemManager<Integer> nums = new ItemManager<>();

        nums.addItem(10);
        nums.addItem(5);
        nums.addItem(20);

        System.out.println(nums.getItem(2));
        System.out.println(nums.getItemCount());
    }
}
