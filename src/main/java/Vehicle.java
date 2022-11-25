public class Vehicle {
    private int gear;
    private int speed;
    private boolean isDriving;

    private int topSpeed;

    public Vehicle(int topSpeed) {
        this.gear = 0;
        this.speed = 0;
        this.isDriving = false;
        this.topSpeed = topSpeed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDriving() {
        return isDriving;
    }

    public void setDriving(boolean driving) {
        isDriving = driving;
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void increaseSpeed(int changeOfSpeed) {
        if (changeOfSpeed + speed <= topSpeed) {
            speed += changeOfSpeed;
            System.out.println("Speed increased by: " + changeOfSpeed + " New Speed:" + speed);
        } else {
            System.out.println("Change of speed cannot make max speed greater than top speed. Current Speed :" +
                    speed + " Change of speed :" + changeOfSpeed + " Top Speed: " + topSpeed);
        }
    }

    public void decreaseSpeed(int changeOfSpeed) {
        if (changeOfSpeed <= speed) {
            speed -= changeOfSpeed;
            System.out.println("Speed decreased by: " + changeOfSpeed + " New Speed:" + speed);
        } else {
            System.out.println("Change of speed cannot be lesser than current speed. Current Speed :" +
                    speed + " Change of speed :" + changeOfSpeed);
        }
    }
}
