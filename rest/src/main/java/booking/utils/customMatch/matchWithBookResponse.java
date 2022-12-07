package booking.utils.customMatch;

import booking.models.ResponseGetBooking;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class matchWithBookResponse extends TypeSafeMatcher<ResponseGetBooking> {

    ResponseGetBooking booking;
    public static matchWithBookResponse andDataFeature(ResponseGetBooking booking){
        return new matchWithBookResponse(booking);
    }

    private matchWithBookResponse(ResponseGetBooking booking){
        this.booking=booking;
    }
    @Override
    protected boolean matchesSafely(ResponseGetBooking actualResponse) {
       return booking.getFirstname().equals(actualResponse.getFirstname())
               &&booking.getLastname().equals(actualResponse.getLastname());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("los valores son incorrectos ").appendValue(this.booking);
    }
}
