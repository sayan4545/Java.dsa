package Collections;

public enum Toppings {
    MUSTARD,
    CHILLIES,
    CHILLI_FLAKES,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case TOMATO -> 0.05;
            case MUSTARD -> 0.9;
            default -> 0.01;


        };
    }

}
