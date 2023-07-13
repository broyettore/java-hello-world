public class Persona {

    String name;
    String surname;
    int age;
    String favoriteColor;
    static int numPers;

    Persona(String name, String surname, int age, String favoriteColor){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteColor = favoriteColor;
        numPers++;
    }

    void greet(Persona greeted) {
        System.out.println("Hello " + greeted.name + " " + "I'm " + this.name + " " + this.surname);
    }

    int sum(int a, int b) {
        return a + b;
    }

    public String toString() {
        String recap = this.name + "\n" + this.surname + "\n" + this.age + "\n" + this.favoriteColor;
        return recap;
    }

    static void total() {
        System.out.println("Numero totale di persone: " + numPers);
    }
}
