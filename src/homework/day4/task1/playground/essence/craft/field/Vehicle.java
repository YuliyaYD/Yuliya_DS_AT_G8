package homework.day4.task1.playground.essence.craft.field;

import homework.day4.task1.playground.essence.Matter;
import homework.day4.task1.playground.essence.craft.Rideable;
import homework.day4.task1.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String vehicleName;

    public Vehicle(int mass, String vehicleName) {
        super(mass);
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
