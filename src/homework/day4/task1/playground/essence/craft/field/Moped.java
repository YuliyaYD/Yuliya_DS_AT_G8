package homework.day4.task1.playground.essence.craft.field;

public class Moped extends Vehicle{
    public Moped(int mass, String vehicleName) {
        super(mass, vehicleName);
    }

    @Override
    public int move(int pointA, int pointB) {
        String str = String.format("I am %s my name is %s and I am moving from point %d to point %d", this.getClass().getSimpleName(), this.getVehicleName(), pointA, pointB);
        System.out.println(str);
        return pointB - pointA;
    }
}
