public class Persona {

    private String name;
    private String surname;

    private int age;

    private String job;
    static int numPersons;

    Persona(String name, String surname){

        this.name = name;
        this.surname = surname;
        numPersons++;
    }

    Persona(Persona person) {
        this.objCopy(person);
    }

    Persona(int age, String job) {
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    void greet(Persona greeted) {
        System.out.println("Hello " + greeted.name + " " + "I'm " + this.name + " " + this.surname);
    }

    void greet() {
        System.out.println("Hello !");
    }

    /* public String toString() {
        String recap = this.name + "\n" + this.surname;
        return recap;
    } */

    public void objCopy(Persona person) {
        this.setName(person.getName());
        this.setSurname(person.getSurname());
    }

    static void total() {
        System.out.println("Total number of persons: " + numPersons);
    }
}
