import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("prova.txt");
            writer.write("hello world \n");
            writer.append("next is guten morgen");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.println((char)data);
                data = reader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




