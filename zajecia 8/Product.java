import java.util.ArrayList;
import java.util.Comparator;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return " " + "id=" + id +", price=" + price;
    }

    public static void main(String[] args){
        var products = new ArrayList<Product>();
        products.add(new Product(1112, 20));
        products.add(new Product(1111, 20));
        products.add(new Product(1115, 22));
        products.add(new Product(1114, 25));
        products.add(new Product(1113, 30));

        System.out.println(products);
        products.sort(new ProductComparator());
        System.out.println(products);
    }
}

class ProductComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.price == o2.price){
            return (int)Math.signum(o1.id-o2.id);
        }
        return (int)Math.signum(o1.price-o2.price);
    }
}
