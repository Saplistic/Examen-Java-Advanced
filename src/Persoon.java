import java.util.TreeSet;

public abstract class Persoon implements Comparable<Persoon> {

    private String naam;
    private int leeftijd;

    private static TreeSet<Persoon> personen = new TreeSet<>();

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        personen.add(this);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public static TreeSet<Persoon> getPersonen() {
        return personen;
    }

    public String geefDetails() {
        return this.toString();
    }

    @Override
    public int compareTo(Persoon p) {
        return this.naam.compareTo(p.naam);
    }

    @Override
    public String toString() {
        return "naam:  '" + naam + '\'' +
                ", leeftijd: " + leeftijd;
    }
}
