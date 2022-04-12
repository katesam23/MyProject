import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        List<Student>students = new ArrayList<>();
        Group group1 = new Group(1, "economic", students);
        Student student1 = new Student("Jackson Jack", group1 , "01.09.2016");
        controller.addToJson(student1);
        System.out.println(controller.view());



    }

}
