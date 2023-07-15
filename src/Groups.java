import java.util.ArrayList;
import java.util.List;

public class Groups {

    private StudGroup group;
    private List<StudGroup> groups = new ArrayList<StudGroup>();

    public Groups() {
        this.groups = new ArrayList<StudGroup>();
    }

    public void addGroup(StudGroup name) {  // ���������� ������ � ������
        this.groups.add(name);
    }

    public List<StudGroup> getGroups() {  // �������� ���� �����
        return List.copyOf(groups);
    }
    public void getAllStudsInGroup(String groupName) {  /** �� ��� ������� ������ ���������, � �� ��������� ����� �� �������*/
        for (StudGroup group : this.groups) {
            for (Student student: group.getStudents()) {
                if (groupName.equals(group.getGroupName())){
                    group.getStudents();
                }
            }
        }
        return ;
    }
    public void addingStudents(String groupStud, String name) {
        for (StudGroup group : this.groups) {
            if (groupStud.equals(group.toString())) {
                group.addStudent(new Student(name, groupStud));
            }

        }
    }
}


