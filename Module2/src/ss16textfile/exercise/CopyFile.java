package ss16textfile.exercise;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
        public static void main(String[] args) {
            System.out.println("Nhập đường dẫn file: ");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();

            CopyFile fileCopy = new CopyFile();
            String str = fileCopy.readFile(path);
            fileCopy.writefile("copy.txt", str);
        }

        public String readFile(String filePath) {
            String str = "";
            try {
                File file = new File(filePath);

                if (!file.exists())
                    throw new FileNotFoundException();

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) !=null){
                    str = str.concat(line) + "\n";
                }
                br.close();
            } catch (Exception e) {
                System.err.println("Fie không tồn tại or nội dung có lỗi!");
            }
            return str;
        }

        public void writefile(String filePath,String str){
            try {
                FileWriter writer = new FileWriter(filePath);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(str);
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
