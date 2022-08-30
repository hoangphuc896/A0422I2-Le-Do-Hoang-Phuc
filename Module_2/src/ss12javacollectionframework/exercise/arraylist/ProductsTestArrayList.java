package ss12javacollectionframework.exercise.arraylist;

import java.util.Scanner;

public class ProductsTestArrayList {
    public static String nameEditProduct() {
        String name ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("New name Product");
        name = scanner.toString();
        return name ;
    }
    public static float priceEditProduct(){
        float price ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("New name Product");
        price =scanner.nextFloat();
        return price ;
    }

    public static Product editProduct() {
        String name = nameEditProduct();
        float price = priceEditProduct();
        return new Product(name , price);
    }

    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("import demand for services :");
        int service = scanner.nextInt();
        switch (service) {
            case 1:
                System.out.println("1.More Products : ");
                System.out.println("Enter a id Products :");
                int  idProduct = scanner.nextShort();
                System.out.println("Enter a name Products :");
                String nameProduct = scanner.toString();
                System.out.println("Enter a price Products : ");
                float priceProduct = scanner.nextFloat();
                Product product1 = new Product(idProduct, nameProduct, priceProduct);
                product.addProducts(product1);
                break;
            case 2:
                System.out.println("2. Edit information by Product By Id");
                System.out.println("Enter id Products : ");
                int id = scanner.nextInt();
                product.editProducts(id , editProduct());
                break;
            case 3:
                System.out.println("3.Delete Products: ");
                System.out.println("Enter a id Products : ");
                int ids = scanner.nextInt();
                product.removeProducts(ids);
                break;
        }
    }
}
