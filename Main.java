public class Main {
    public static void main(String[] args) {
       String[][] people = {
               {"roy", "lucy", "joy"},
               {"yaru", "yuri", "yerim"},
               {"john", "eric", "fary"},
       };

       for (int i = 0; i < people.length; i++) {
           System.out.println();
           for (String name: people[i]) {
               System.out.print(name + " ");
           }
       }
    }
}
