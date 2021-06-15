public class Main {
    public static void main(String[] args) {
        Car normalCar = new Car();
        Motorcycle normalMotorCycle = new Motorcycle();
        ElectricCar electricCar = new ElectricCar();

        normalCar.start();
        normalCar.run();
        normalCar.stop();
        normalMotorCycle.start();
        normalMotorCycle.run();
        normalMotorCycle.stop();
        electricCar.start();
        electricCar.run();
        electricCar.stop();
        electricCar.recharge();


    }
}
