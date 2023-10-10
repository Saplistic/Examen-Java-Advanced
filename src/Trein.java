public class Trein {

    private String naam;
    private Conducteur treinConducteur;


    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setTreinConducteur(Conducteur treinConducteur) {
        this.treinConducteur = treinConducteur;
    }

    @Override
    public String toString() {
        return "Trein{" +
                "naam='" + naam + '\'' +
                ", treinConducteur=" + treinConducteur +
                '}';
    }
}
