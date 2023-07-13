public class Student extends Persona {

    String favoriteSubject = "history";
    String classroom = "32B";
    int[] votes = {7, 9, 8};
    Student(String name, String surname) {
        super(name, surname);
    }

    void status() {
        System.out.println("I'm studying");
    }

    @Override
    void greet() {
        System.out.println("Hello Prof !");
    }
}
