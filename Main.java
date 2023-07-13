public class Main {
    public static void main(String[] args) {
        Persona person1 = new Persona("hero", "jones", 24, "red");
        Persona person2 = new Persona("lucy", "Hones", 27, "pink");
        Persona person3 = new Persona("don", "Suzy", 22, "grey");

        Persona[] persone = {person1, person2, person3};

        for (int i = 0; i < persone.length; i++) {
            System.out.println(persone[i]);
        }
    }
}




