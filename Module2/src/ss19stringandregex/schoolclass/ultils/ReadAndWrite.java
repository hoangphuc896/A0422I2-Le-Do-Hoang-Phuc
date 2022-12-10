package ss19stringandregex.schoolclass.ultils;

import ss19stringandregex.schoolclass.model.Student;
import ss19stringandregex.schoolclass.model.Teacher;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWrite {
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void writeStudent(List<Student> studentList, String filer) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filer, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(student.getInfo() + "\n");
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

    public static List<Student> readStudent(String filer) {
        List<Student> arrayList = new ArrayList<>();
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
                String classsification = temp[3];
                Student student = new Student(id, name, birthDay, classsification);
                arrayList.add(student);

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

    public static List<Teacher> readTeacher(String filer) {
        List<Teacher> arrayList = new ArrayList<>();
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
                String position = temp[3];
                Teacher teacher = new Teacher(id, name, birthDay, position);
                arrayList.add(teacher);

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
    public static void writeTeacher(List<Teacher> teacherList, String filer) {
        FileWriter fileWriter ;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filer, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher : teacherList) {
                bufferedWriter.write(teacher.getInfo() + "\n");
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
