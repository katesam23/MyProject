import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Controller {

    public void addToJson(Student student) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter("save.json");
        writer.write(gson.toJson(student));
        writer.close();
    }

    public void remove(){

    }
    public Student view() throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        BufferedReader reader = new BufferedReader(new FileReader("save.json"));
        Student student = gson.fromJson(reader, Student.class);
        return student;

    }
    public void change(){

    }
    public void search(){

    }
}
