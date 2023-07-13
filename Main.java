public class Main {
    public static void main(String[] args) {
        // Parent class
        Persona person1 = new Persona("hero", "jones");
        Persona person2 = new Persona("lucy", "Hones");

        //child class
        Student students1 = new Student("keen", "Herman");
        Teacher teacher1 = new Teacher("lewis", "Hamilton");

        teacher1.greet();
    }
}




