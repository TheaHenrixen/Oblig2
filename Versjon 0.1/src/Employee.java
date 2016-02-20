import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee extends Card{

    public Employee(String name, int pin){
        setName(name);
        checkPIN(pin);
    }

    @Override
    boolean checkPIN(int pin) {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        if (hour >= 7 && hour <= 17 && !isCancelled() && pin != 9999) {
            return true;
        }

        return false;
    }
}
