class Car {

    public int gear;
    public int speed;

    public Car(int gear , int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String toString()
    {
            return("No. of gears are : " + gear + "\n" + "Speed of SuperCar is : " + speed + " mph");
    }
}

class SuperCar extends Car {

    public int setHeight;
    public SuperCar(int gear, int speed, int rideHeight)

    {
        super(gear, speed);
        setHeight = rideHeight;
    }

    public void setHeight(int newValue)
    {
        setHeight = newValue;
    }
    @Override public String toString()
    {
        return (super.toString() + "\nRide height is : " + setHeight + " inch");
    }
}
public class gears {
    public static void main(String[] args) {
        SuperCar mb = new SuperCar(5, 180, 15);
        System.out.println(mb.toString());
    }
}

