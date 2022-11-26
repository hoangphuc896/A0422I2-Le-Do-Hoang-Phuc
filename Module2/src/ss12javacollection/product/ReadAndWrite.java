package ss12javacollection.product;

import java.io.*;
import java.util.Collection;

public class ReadAndWrite {

    public static void write(Collection collection, String filler) {
        // ghi thông tin vào file
        File file = new File(filler);
        // Kiểm tra xem file có rỗng ko
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);// chuyển dữ liệu từ file ra thành list
            objectOutputStream = new ObjectOutputStream(fileOutputStream); // thao tác CRUD trên file
            objectOutputStream.writeObject(collection); // ghi lại thông tin từ đối tượng vào file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // bắt buộc đóng file
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object read(String filler) {
        //lấy ra và đọc file
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Object object;
        try {
            fileInputStream = new FileInputStream(filler);
            objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            return object;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Mời Bạn Nhập thêm danh sách");
        }
        return null;
    }

}