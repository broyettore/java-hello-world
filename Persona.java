public class Persona {

    String name;
    String surname;
    int age;
    String favoriteColor;

    Persona(String name, String surname, int age, String favoriteColor){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    void greet() {
        System.out.println("Hello i'm"  + this.name + " " + this.surname);
    }

    int sum(int a, int b) {
        return a + b;
    }

    public String toString() {
        String recap = this.name + "\n" + this.surname + "\n" + this.age + "\n" + this.favoriteColor;
        return recap;
    }
}
