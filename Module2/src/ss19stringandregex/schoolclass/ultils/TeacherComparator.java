package ss19stringandregex.schoolclass.ultils;

import ss19stringandregex.schoolclass.model.Teacher;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.getId() - o2.getId() > 0) {
            return 1;
        } else if (o1.getId() - o2.getId() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
