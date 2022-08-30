package ss12javacollectionframework.exercise.arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductManager<T> {
    private ArrayList<Product> products = new ArrayList<>();
    public ProductManager() {

    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public void removeProducts(int id) {
        products.remove(id);
    }

    public int indexofProducts(Product productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(productName))
                return i;
        }
        return -1;
    }

    public void editProducts(int id , Product product) {
        products.set(id,product);

    }

    public void displayProducts() {
        products.toString();
    }

    public int sizeProducts() {
        return products.size();
    }

    public void sortProductsIncrease() {
        products.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
    }

    public void sortProductsDecrease() {
        products.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
    }
}
