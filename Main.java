public class Main {
    public static void main(String[] args) {
        Persona person1 = new Persona("hero", "jones", 24, "red");
        Persona person2 = new Persona("lucy", "Hones", 27, "pink");

        final String test = "play";

        Persona.total();
        person1.greet(person2);
        person2.greet(person1);
    }
}




