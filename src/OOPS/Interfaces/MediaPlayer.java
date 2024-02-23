package OOPS.Interfaces;

public class MediaPlayer implements Media{


    @Override
    public void start() {
        System.out.println("Music starts");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");

    }
}





