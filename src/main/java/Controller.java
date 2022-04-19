import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Scanner;

public class Controller {

    public void addToJson(Student student) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter("save.json");
        writer.write(gson.toJson(student));
        writer.close();
    }

    public void addNewStudent(Student student){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные студента");
        System.out.println("Для завершения создания введите \"Создать\"");
        while (! scanner.nextLine().equals("Создать")){
            System.out.println("Фамилия Имя Отчество: ");
            String FIO = scanner.nextLine();
            while (true){
                if (FIO.length() == 0){
                    System.out.println("Вы не ввели имя!");
                    FIO = scanner.nextLine();
                }else {break;}
            }
            System.out.println("Группа: ");

        }
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
