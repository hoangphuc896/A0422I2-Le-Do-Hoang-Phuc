package ss12javacollection.product;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWrite {
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void write(List<Product> products, String filer) throws IOException {
        FileWriter fileWriter = new FileWriter(filer, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product product : products) {
            bufferedWriter.write(product.getId() + "," + product.getName() + "," + dateFormat.format(product.getBirtDay()) + "," + product.getPrice()+"\n");
        }
        bufferedWriter.close();
    }

    public static List<Product> read(String filer) throws IOException {
        List<Product> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filer);
             bufferedReader = new BufferedReader(fileReader);
            String[] temp;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                Date birthDay = dateFormat.parse(temp[2]);
                double price = Double.parseDouble(temp[3]);
                Product product = new Product(id, name, birthDay, price);
                arrayList.add(product);

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return arrayList;
    }


//    public static void write(Collection collection, String filler) {
//        File file = new File(filler);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write(String.valueOf(collection));
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//        // ghi thông tin vào file
//        File file = new File(filler);
//        // Kiểm tra xem file có rỗng ko
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//
//        try {
//            fileOutputStream = new FileOutputStream(file);// chuyển dữ liệu từ file ra thành list
//            objectOutputStream = new ObjectOutputStream(fileOutputStream); // thao tác CRUD trên file
//            objectOutputStream.writeObject(collection); // ghi lại thông tin từ đối tượng vào file
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                // bắt buộc đóng file
//                fileOutputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static List read(String filler) {
//        try {
//            FileReader fileReader = new FileReader(filler);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.read();
//            return (List) bufferedReader;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//        //lấy ra và đọc file
//        FileInputStream fileInputStream;
//        ObjectInputStream objectInputStream;
//        Object object;
//        try {
//            fileInputStream = new FileInputStream(filler);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            object = objectInputStream.readObject();
//            return object;
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Mời Bạn Nhập thêm danh sách");
//        }
//        return null;
//    }

}