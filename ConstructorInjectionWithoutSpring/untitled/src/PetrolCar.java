public class PetrolCar {

    Engine engineType;


    PetrolCar(Engine engineType){
        this.engineType = engineType;  // constructor injection
    }

    void run(){
        this.engineType.start();
    }
}
