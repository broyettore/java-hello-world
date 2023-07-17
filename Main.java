import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("joshua", "Parks");
        Teacher teacher1 = new Teacher("art", "lehman");

        Persona[] classroom = {student1, teacher1};

        for (Persona person: classroom
             ) {
            person.greet();
        }

    }
}




