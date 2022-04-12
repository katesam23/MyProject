import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String FIO;
    private Group group;
    private String enrollDate;

    public Student(String FIO, Group group, String enrollDate) {
        this.FIO = FIO;
        this.group = group;
        this.enrollDate = enrollDate;

    }

    @Override
    public String toString() {
        return "Student{" +
                "FIO='" + FIO + '\'' +
                ", group=" + group +
                ", enrollDate='" + enrollDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(FIO, student.FIO) && Objects.equals(group, student.group) && Objects.equals(enrollDate, student.enrollDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, group, enrollDate);
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        if (this.group != null){
            this.group.getStudents().remove(this);
        }
        this.group = group;
        this.group.getStudents().add(this);
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }


}
