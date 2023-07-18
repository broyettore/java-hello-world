import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> persons = new ArrayList<>();

        persons.add("Mao");
        persons.add("Lucy");
        persons.add("Mike");
        persons.add("Jones");
        persons.add("Derik");

        Iterator<String> it = persons.iterator();

        while (it.hasNext()) {

            if (it.next() == "Derik") {
                it.remove();
            }
        }
        System.out.println(persons);
    }
}




