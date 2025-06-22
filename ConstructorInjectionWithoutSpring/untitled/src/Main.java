public class Main {
    public static void main(String[] args) {


        PetrolCar petrolCar = new PetrolCar(new PetrolEngine());

        ElectricCar electricCar = new ElectricCar(new ElectricEngine());


        petrolCar.run();
        electricCar.run();
    }
}