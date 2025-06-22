public class ElectricCar {
    Engine engineType ;    // constructor injection


    ElectricCar(Engine engineType){
        this.engineType = engineType;   // constructor injection
    }

    void run(){
        this.engineType.start();
    }
}
