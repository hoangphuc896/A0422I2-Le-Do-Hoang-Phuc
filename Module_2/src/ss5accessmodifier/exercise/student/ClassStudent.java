package ss5_Accessmodifier.exercise.accessmodifier;

import javax.naming.Name;

public class ClassStudent {
    private String name = "john";
    private String classes = "CO2";
    public ClassStudent(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

