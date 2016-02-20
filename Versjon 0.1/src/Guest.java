import java.util.Date;

public class Guest extends Card {

    Date issued;

    public Guest(String name, int pin){
        setName(name);
        checkPIN(pin);
        issued = new Date();
    }

    @Override
    boolean checkPIN(int pin) {
        Date currentDate = new Date();
        int timePassed = (int)((currentDate.getTime() - issued.getTime()) / (1000 * 60 * 60 * 24));

        if (pin == 9999 & timePassed <= 7 && (!isCancelled())){
            return true;
        }
        return false;
    }
}
