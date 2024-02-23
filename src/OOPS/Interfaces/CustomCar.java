package OOPS.Interfaces;

public class CustomCar {
    private Engine engine;
    private Media cdPlayer = new MediaPlayer();
    CustomCar(){
        engine = new PowerEngine();
    }
    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void accelarate(){
        engine.accelarate();
    }
    void startMusic(){
        cdPlayer.start();
    }
    void stopMusic(){
        cdPlayer.stop();
    }
    void upgrade(){
        this.engine=new ElectricEngine();
    }
}
