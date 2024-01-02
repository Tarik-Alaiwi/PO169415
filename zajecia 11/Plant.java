public class Plant{
    public String name;

    public Plant(String name) {
        this.name = name;
    }
}

class Tree extends Plant implements Comparable{
    public int height;

    public Tree(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Tree){
            if (this.height > ((Tree) o).height){
                return this.height;
            }
            return ((Tree) o).height;
        }
        return 0;
    }
}
