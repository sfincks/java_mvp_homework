import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudGroup {

    private UUID groupID;
    private final String groupName;
    private List<Student> group;



    public StudGroup(String name) {  // создание группы
        this.groupName = name;
        this.groupID = UUID.randomUUID();
        this.group = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public void addStudent(Student name) {  // добавление студента в группу
        this.group.add(name);
    }

    public UUID getGroupID() {
        return groupID;
    }

    public List<Student> getStudents() {  // просмотр всех студентов одной группы
        return List.copyOf(group);
    }

    @Override
    public String toString() {
        return "{"+ groupID + "} ["+ groupName +"]";
    }
}