public class Persona {

    String name;
    String surname;

    private int age;

    private String job;
    static int numPersons;

    Persona(String name, String surname){

        this.name = name;
        this.surname = surname;
        numPersons++;
    }

    Persona(int age, String job) {
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void greet(Persona greeted) {
        System.out.println("Hello " + greeted.name + " " + "I'm " + this.name + " " + this.surname);
    }

    void greet() {
        System.out.println("Hello !");
    }

    public String toString() {
        String recap = this.name + "\n" + this.surname;
        return recap;
    }

    static void total() {
        System.out.println("Total number of persons: " + numPersons);
    }
}
