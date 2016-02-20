
public abstract class Card {
    private String firstName;
    private String lastName;
    private String pin;
    private long cardNumber = (long)Math.random()*1000000000000L;
    private boolean accessCode;
    private static long card = 1;

    public Card(){

    }

    public Card(String firstName, String lastName, String pin, long cardNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.card = card++;
        this.accessCode = false;
    }

    public String getName() { return firstName + " " + lastName; }

    public void setName(String fullName) { fullName = firstName + " " + lastName; }

    abstract boolean checkPIN(int pin);

    @Override
    public String toString(){
        return "Name: " + getName() + "\nPIN: " + pin + "\nCard Number: " + cardNumber +
                "\nCancelled? " + accessCode;
     }

    boolean isCancelled(){ return accessCode; }
}
