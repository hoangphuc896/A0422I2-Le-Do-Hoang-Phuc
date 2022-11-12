package ss12javacollection.product;

import castudymodule2.models.Employee;
import castudymodule2.ultils.RegexPerson;

import java.util.*;

public class ProductManager {
    private static List<Product> products = new ArrayList<Product>();
    private static Scanner scanner = new Scanner(System.in);

    public void addNew() {
        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter price : ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        products.add(product);
    }

    public void edit() {
        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Enter find Name:");
                product.setName(scanner.nextLine());
                System.out.println("Enter find price:");
                product.setPrice(Double.parseDouble(scanner.nextLine()));
                isExisted = true;
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id=%s Not existed.\n", id);
        } else {
            System.out.println(products);
        }
    }

    public void delete() {
        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        Product producter = null;
        for (Product product : products) {
            if (product.getId() == id) {
                producter = product;
                break;
            }
        }
        if (producter != null) {
            products.remove(producter);
            System.out.println("Delete product");
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }


    public void display() {
        System.out.println("list of products :");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void search() {
        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        Product producter = null;
        for (Product product : products){
            if (product.getName().equals(name)){
                producter = product;
                break;
            }
        }if (producter!=null){
            System.out.println("product you are looking for"+producter);
        }else {
            System.out.println("Not product in list :" + name);
        }
    }
    public void sort(){
    Collections.sort(products,new ProductComparator());
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
}
