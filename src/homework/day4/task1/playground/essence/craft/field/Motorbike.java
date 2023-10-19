package homework.day4.task1.playground.essence.craft.field;

public class Motorbike extends Vehicle{
    public Motorbike(int mass, String vehicleName) {
        super(mass, vehicleName);
    }

    @Override
    public int move(int pointA, int pointB) {
        String str = String.format("I am %s my name is %s and I am moving from point %d to point %d", this.getClass().getSimpleName(), this.getVehicleName(), pointA, pointB);
        System.out.println(str);
        return pointB - pointA;
    }

    @Override
    public void drive(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd driving to %s",
                Moped.class.getSimpleName(), this.vehicleName, direction));
    }
}
