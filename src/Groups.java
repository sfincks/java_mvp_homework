import java.util.ArrayList;
import java.util.List;

public class Groups {

    private StudGroup group;
    private List<StudGroup> groups = new ArrayList<StudGroup>();

    public Groups(){
        this.groups = new ArrayList<StudGroup>();
    }

    public void addGroup(StudGroup name) {  // добавление группы в список
        this.groups.add(name);
    }

    public List<StudGroup> getGroups() {  // просмотр всех групп
        return List.copyOf(groups);
    }
    public List<Student> getGroup(String name){
        int index = this.groups.indexOf(name);
        return ;
    }
}
