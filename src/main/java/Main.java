import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car("123", "audi", 100);

        myCar.accelerate(100);

        Vehicle myBicycle = new Bicycle("344", "superbike", 12);

        try {myBicycle.accelerate(14);
        }
        catch (NoSuchElementException myException){
            System.out.println("you are too fast my friend");
            System.out.println(myException);
        }
        }
    }

