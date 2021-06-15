public class ElectricCar extends Car implements Rechargeable{

    @Override
    public void recharge() {
        System.out.println("The car is recharging");
    }
    
}
