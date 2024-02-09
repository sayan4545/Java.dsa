package Collections;

import java.util.Random;

public class EnumImpl {
    public static void main(String[] args) {
        DayOfWeek weekday = DayOfWeek.MON;
        System.out.println(weekday);
        DayOfWeek weekday2 = DayOfWeek.valueOf("WED");
//        System.out.println(weekday2);
//        System.out.println(weekday2.name()+ " "+ weekday2.ordinal());
//        for(int i=0;i<10;i++){
//            DayOfWeek weekDay3 = getRandomday();
//            //System.out.println(weekDay3.name()+ " "+ weekDay3.ordinal());
//            SwitchDayOfWeek(weekDay3);
//        }

        for(Toppings T : Toppings.values()){
            System.out.println(T.name()+" "+T.getPrice());
        }
//        for(DayOfWeek c : DayOfWeek.values()){
//            System.out.print(c.name()+ " " + c.ordinal() );
//        }
        //SwitchDayOfWeek(DayOfWeek.MON);
    }
    public static DayOfWeek getRandomday(){
        int randomInteger = new Random().nextInt(7);
        var allDaysOfWeek = DayOfWeek.values();

        return allDaysOfWeek[randomInteger];
    }

    public static void SwitchDayOfWeek(DayOfWeek weekD){
        int weekDayInteger = weekD.ordinal()+1;
        switch(weekD){
            case WED -> System.out.println(weekDayInteger);
            case FRI -> System.out.println(weekDayInteger);
            default -> System.out.println(weekD.name().charAt(0)+ weekD.name().substring(1).toLowerCase()+"Day is day "+ weekDayInteger);

        }
    }
}
