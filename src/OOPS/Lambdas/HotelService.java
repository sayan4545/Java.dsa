package OOPS.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();
    public HotelService(){
        hotels.add(new Hotel(2300,4,HotelType.THREE_STAR));
        hotels.add(new Hotel(1000,5,HotelType.FIVE_STAR));
        hotels.add(new Hotel(3000,4,HotelType.FOUR_STAR));
    }
    public boolean filterByprice(int price,Hotel hotel){
        return hotel.pricePerNight<=price;
    }
    public List<Hotel> filterHotelsLessThanPrice(int price){
        List<Hotel> filteredHotel = new ArrayList<>();
        for(Hotel h:hotels){
            if(filterByprice(price,h)){
                filteredHotel.add(h);
            }
        }
        return filteredHotel;

    }


}
