
public abstract class Card {
    private String firstName;
    private String lastName;
    private String pin;
    private long cardNumber;
    private boolean accessCode;
    private static long card = 1;

    public Card(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.card++;
        this.accessCode = false;
    }

    String getName() { return this.firstName + " " + this.lastName; }

    abstract boolean checkPIN(int pin);

    @Override
    public String toString(){
        return "Name: " + getName() + "\nPIN: " + pin + "\nCard Number: " + cardNumber +
                "\nCancelled? " + accessCode;
     }

    boolean isCancelled(){ return accessCode; }
}
