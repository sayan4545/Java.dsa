package OOPS.Interfaces;
public class Car implements Engine,Brake,Media{

    @Override
    public void braking() {
        System.out.println("Brakes normally!");
    }

    @Override
    public void start() {
        System.out.println("petrol Engine starts");

    }



    @Override
    public void stop() {
        System.out.println("Petrol engine stops");
    }

    @Override

    public void accelarate() {
        System.out.println("Petrol engine accelarates!");
    }



}
