package ss5accessmodifier.exercise.student;

public class ClassStudent {
    private String name;
    private String classe;

    public ClassStudent() {

    }

    public ClassStudent(String name, String classe) {
        this.name = name;
        this.classe = classe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", classe='" + classe + '\''
                ;
    }
}
