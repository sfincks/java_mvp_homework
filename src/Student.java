import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private final UUID studID;

    private final String name;

    private String group;


    public Student(String name, String group) {
        this.name = name;
        this.studID = UUID.randomUUID();
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("name ='" + name + "'%n" +
                "group = '" + group + "'%n" +
                "stud_id = " + studID);

    }


}
