public class Car extends Vehicle{

    public Car() { // geerbter default Konstruktor
    }

    public Car(String id, String name, int velocity) { //geerbter Konstruktor
        super(id, name, velocity);
    }

    @Override
    public  int accelerate(int kmh) {
        kmh = kmh + 100;
        System.out.println("new car velocity: " + kmh);
        return kmh;
    }
}
