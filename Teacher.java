public class Teacher extends Persona {

    String subject;
    String[] classrooms;
    Teacher(String name, String surname, String subject, String[] classrooms) {
        super(name, surname);

        this.subject = subject;
        this.classrooms = classrooms;
    }

    @Override
    void greet() {
        System.out.println("Hello Students !");
    }
}
