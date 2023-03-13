import java.io.IOException;
import java.util.NoSuchElementException;

public class Bicycle extends Vehicle{

    public Bicycle(String id, String name, int velocity) {
        super(id, name, velocity);
    }


    @Override
    public int accelerate(int kmh) throws NoSuchElementException{
        if (velocity + kmh < 35) {
            System.out.println("new bike Velocity: " + (kmh + velocity));
            return velocity + kmh;
        }throw new NoSuchElementException("too fast");

        }

    }

