public abstract class Vehicle {

    private int wheels;
    private int seats;
    private double speed;

    public abstract void start();
    public abstract void run();
    public abstract void stop();

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public double getSpeed() {
        return speed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
