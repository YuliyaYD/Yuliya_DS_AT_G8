package homework.day4.task1.playground.essence.craft.hand;

import homework.day4.task1.playground.essence.Matter;

public abstract class Container extends Matter {

    protected String containerName;

    public Container(int mass, String containerName) {
        super(mass);
        this.containerName = containerName;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }
}
