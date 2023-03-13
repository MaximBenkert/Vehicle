public abstract class Vehicle implements Accelerateable {

    protected String id;
    protected String name;
    protected int velocity;

    public Vehicle(String id, String name, int velocity) { //Konstruktor
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public Vehicle() { // default Konstruktor
    }

    @Override
    public int accelerate(int kmh) {
        return 0;
    }
}
