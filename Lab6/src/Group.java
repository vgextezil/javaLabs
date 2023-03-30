import java.util.List;

public class Group {
    private Integer grop;
    private List<Student> studentsList;

    public Group(Integer grop, List<Student> students) {
        this.grop = grop;
        this.studentsList = students;
    }

    public Integer getGrop() {
        return grop;
    }

    public void setGrop(Integer grop) {
        this.grop = grop;
    }

    public List<Student> getStudents() {
        return studentsList;
    }

    public void setStudents(List<Student> students) {
        this.studentsList = students;
    }
}
