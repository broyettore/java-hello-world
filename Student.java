public class Student extends Persona {

    String favoriteSubject;
    String classroom;
    int[] votes;
    Student(String name, String surname, String favoriteSubject, String classroom, int[] votes) {
        super(name, surname);

        this.favoriteSubject = favoriteSubject;
        this.classroom = classroom;
        this.votes = votes;
    }

    void status() {
        System.out.println("I'm studying");
    }

    @Override
    void greet() {
        System.out.println("Hello Prof !");
    }
}
