package OOPS.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine starts");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stops");

    }

    @Override
    public void accelarate() {
        System.out.println("PowerEngine accelarates");
    }
}
