package ss12javacollection.product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("1. add new list product");
            System.out.println("2. eddit list product");
            System.out.println("3. delete list product");
            System.out.println("4. search list product");
            System.out.println("5. display list product");
            System.out.println("6. sort list product");
            System.out.println("7. exit");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    productManager.addNew();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.search();
                    break;
                case 5:
                    productManager.display();
                    break;
                case 6:
                    productManager.sort();
                    break;
                default:
                    return;
            }
        }
    }
}
