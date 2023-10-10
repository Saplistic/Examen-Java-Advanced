public class Conducteur extends Persoon implements geefDetails {

    private int ervaring;

    public Conducteur(String naam, int leeftijd) {
        super(naam, leeftijd);
    }

    public void setErvaring(int ervaring) {
        this.ervaring = ervaring;
    }

    @Override
    public String toString() {
        return "Conducteur [" +
                super.toString() + ", " +
                "jaren ervaring: " + this.ervaring +
                "]";
    }

}
