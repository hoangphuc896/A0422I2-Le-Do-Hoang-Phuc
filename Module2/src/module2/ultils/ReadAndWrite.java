package module2.ultils;


import module2.model.DanhSachBenhNhan;
import module2.model.DanhSachBenhNhanVip;


import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWrite {
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void writeAccount(List<DanhSachBenhNhan> accountList, String filer) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filer, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhSachBenhNhan account : accountList) {
                bufferedWriter.write(account.getInfo() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<DanhSachBenhNhan> readAccount(String filer) {
        List<DanhSachBenhNhan> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filer);
            bufferedReader = new BufferedReader(fileReader);
            String[] temp;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String maBenhNhan= temp[1];
                String ten = temp[2];
                Date ngayNhapVien= dateFormat.parse(temp[3]);
                Date ngayRaVien= dateFormat.parse(temp[4]);
                String lyDo= temp[5];
                int phiNamVien= Integer.parseInt(temp[6]);
                DanhSachBenhNhan account= new DanhSachBenhNhan(id, maBenhNhan, ten, ngayNhapVien,ngayRaVien,lyDo,phiNamVien);
                arrayList.add(account);

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static List<DanhSachBenhNhanVip> readPayAccount(String filer) {
        List<DanhSachBenhNhanVip> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filer);
            bufferedReader = new BufferedReader(fileReader);
            String[] temp ;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String maBenhNhan = temp[1];
                String ten =  temp[2];
                Date ngayNhapVien= dateFormat.parse( temp[3]);
                Date ngayRaVien= dateFormat.parse( temp[4]);
                String lyDo= temp[5];
                String loaiVip=temp[6];
                String thoiHan=temp[7];
                DanhSachBenhNhanVip payAccount = new DanhSachBenhNhanVip(id, maBenhNhan, ten, ngayNhapVien,ngayRaVien,lyDo,loaiVip,thoiHan);
                arrayList.add(payAccount);

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
    public static void writePayAccount(List<DanhSachBenhNhanVip> payAccountList, String filer) {
        FileWriter fileWriter ;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filer, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhSachBenhNhanVip payAccount : payAccountList) {
                bufferedWriter.write(payAccount.getInfo() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
