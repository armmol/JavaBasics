public class Car extends Vehicle {
    private int doors;

    public Car(int doors, int topSpeed) {
        super(topSpeed);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
