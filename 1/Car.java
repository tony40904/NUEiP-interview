public class Car extends Vehicle{

    private int doors;

    @Override
    public void start() {
        System.out.println("The car starts.");
    }

    @Override
    public void run() {
        System.out.println("The car is running.");
    }

    @Override
    public void stop() {
        System.out.println("The car stops.");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    
}