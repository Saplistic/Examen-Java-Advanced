public class Passagier extends Persoon implements geefDetails{

    private boolean ticket;

    public Passagier(String naam, int leeftijd) {
        super(naam, leeftijd);
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }

    public boolean isTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        return "Passagier [" +
                super.toString() + ", " +
                "ticket: " + this.ticket +
                "]";
    }
}
