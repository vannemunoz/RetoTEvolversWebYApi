package booking.utils.customMatch;

import booking.models.BookingdatesGetBooking;
import booking.models.ResponseGetBooking;

import java.util.Map;

import static booking.utils.customMatch.Keywords.*;

public class FillBody{
    private Map<String,String> data;

    public FillBody(Map<String,String> data){
        this.data=data;
    }
    public ResponseGetBooking Fill() {
        BookingdatesGetBooking dates=new BookingdatesGetBooking();
        dates.setCheckin(data.get(CHECKIN));
        dates.setCheckout(data.get(CHECKOUT));
        ResponseGetBooking booking=new ResponseGetBooking();
        booking.setFirstname(data.get(FIRSTNAME));
        booking.setLastname(data.get(LASTNAME));
        booking.setBookingdates(dates);
        booking.setAdditionalneeds(data.get(ADDITIONAL));
        booking.setTotalprice(Integer.parseInt(data.get(PRICE)));
        booking.setDepositpaid(Boolean.parseBoolean(data.get(DEPOSITE)));
        return booking;
    }
}
