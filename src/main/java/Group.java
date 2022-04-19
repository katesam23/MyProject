import java.io.Serializable;
import java.util.List;

public class Group implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numOfGroup;
    private String faculty;
    private transient List<Student> students;

    public void addStudent(Student student){
        student.setGroup(this);
    }

    public Group(int numOfGroup, String faculty, List<Student>students) {
        this.numOfGroup = numOfGroup;
        this.faculty = faculty;
        this.students = students;
    }



    public int getNumOfGroup() {
        return numOfGroup;
    }

    public void setNumOfGroup(int numOfGroup) {
        this.numOfGroup = numOfGroup;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
