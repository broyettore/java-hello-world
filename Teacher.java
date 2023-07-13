public class Teacher extends Persona {

    String subject = "Math";
    String[] classrooms = {"32B", "33B", "34B"};
    Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    void greet() {
        System.out.println("Hello Students !");
    }
}
