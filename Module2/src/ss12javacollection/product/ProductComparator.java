package ss12javacollection.product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    // công thức sắp xếp theo thông tin đối tượng
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() - o2.getId() > 0) {
            return 1;
        } else if (o1.getId() - o2.getId() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
