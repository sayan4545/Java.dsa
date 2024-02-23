package OOPS.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");

    }

    @Override
    public void accelarate() {
        System.out.println("Electric engine accelarates");

    }
}
