package ss16textfile.exercise.readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readfile {


    public static List<Studen> getStuden(String path) throws IOException {
        List<Studen> studens = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] node;
        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            node = temp.split(",");
            int id = Integer.parseInt(node[0]);
            String name = node[1];
            String adress = node[2];
            Studen studen = new Studen(id, name, adress);
            studens.add(studen);
        }
        bufferedReader.close();
        return studens;
    }
}
