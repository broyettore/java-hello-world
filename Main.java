public class Main {
    public static void main(String[] args) {
        // Parent class
        Persona person1 = new Persona("hero", "jones");
        Persona person2 = new Persona("lucy", "Hones");

        //child class
        Student students1 = new Student("keen", "Herman", "history", "32B", new int[]{7,8,9});
        Teacher teacher1 = new Teacher("lewis", "Hamilton", "Math", new String[]{"33B","32B","34B"});

        for (int i = 0; i < teacher1.classrooms.length; i++) {
            if(students1.classroom == teacher1.classrooms[i]) {
                System.out.println("This student teacher is " + teacher1.name);
                break;
            } else {
                System.out.println("No match yet");
            }
        }
    }
}




