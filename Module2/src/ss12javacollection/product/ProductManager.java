package ss12javacollection.product;


import castudymodule2.ultils.AgeException;
import ss12javacollection.product.data.regex.RegexAndValidate;

import java.util.*;

public class ProductManager {
    public static final String FOMAT_NAME = "([A-Z][a-z ]*)+";// MÃ Định dạnh tên cho đối tượng
    private static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addNew() {
        // Thêm thông tin
        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name : ");
        String name = RegexAndValidate.regexStr(scanner.nextLine(),FOMAT_NAME,"Bạn Nhập sai định dạnh mời bạn nhập lại");// công thức định dạnh tên cho đối tượng
        Date birthDay;
        do {
            System.out.println("Mời Bạn Nhập Ngày Sinh");
            String birth = scanner.nextLine();
            try {
                birthDay = RegexAndValidate.birthDay(birth);// công thức định dạng ngày sinh để người nhập đúng
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập Sai Ngày sinh Mời Bạn Nhập Lại");
            }
        }while (true);
        System.out.println("Enter price : ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id,name , birthDay, price);
        products.add(product);
        ReadAndWrite.write(products, "D:\\Codegym\\Module2\\src\\ss12javacollection\\product\\data\\product.csv"); // Thêm mới thông Tin Vào File
    }

    public void edit() {
        // sửa thông tin dựa theo ID
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
        ReadAndWrite.write(products ,"D:\\Codegym\\Module2\\src\\ss12javacollection\\product\\data\\product.csv");// Lưu Thay đổi file
    }

    public void delete() {
        // xóa thông tin dựa theo ID
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
            for (Product product : products) {
                System.out.println(product.toString());
            }
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
        castudymodule2.ultils.ReadAndWrite.write(products,"D:\\Codegym\\Module2\\src\\ss12javacollection\\product\\data\\product.csv"); // Xóa Một Đối tượng trong file
    }


    public void display() {
        products = (List<Product>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\ss12javacollection\\product\\data\\product.csv"); // hiển Thị danh sách 1 file
        if (products != null) {
            System.out.println("list of products :");
            for (Product product : products) {
                System.out.println(product.toString());
            }
        }
    }

    public void search() {
        // tìm kiếm thông tin dựa theo tên đối tượng
        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        Product producter = null;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                producter = product;
                break;
            }
        }
        if (producter != null) {
            System.out.println("product you are looking for" + producter);
        } else {
            System.out.println("Not product in list :" + name);
        }
    }

    public void sort() {
        // sắp xếp lại file theo thứ tự nhỏ tới lớn
        Collections.sort(products, new ProductComparator());
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
