package obiectConstructor;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class HotelTest {

    @Test

    public void hotelTest() {
        Hotel Timisoara = new Hotel("Timisoara", "Calea Timisorii", "Timisoara", "Romania", 3,
                ArrayList("-Spa","-Piscina"), 250);
        Timisoara.prezentareHotel();
    }
}
