public class Automobile extends Vehicle {
    @Override
    void breaks() {
        System.out.println("Im putting my foot on the breaks");
    }

    @Override
    void move() {
        System.out.println("Im moving");
    }
}
