public class Main {
    public static void main(String[] args) {
        Persona test1 = new Persona("roy", "bagnarola", 25, "black");
        Persona test2 = new Persona("lucy", "wild", 22, "pink");

        System.out.println(test1.name + test1.surname);
        System.out.println(test2.name + test2.surname);
    }
}
