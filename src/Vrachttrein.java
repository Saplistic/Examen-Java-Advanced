public class Vrachttrein extends Trein implements Aflaatbaar {

    private int laadvermogen = 60;
    private int geladen = 0;

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
    }

    public void setGeladen(int geladen) {
        this.geladen = geladen;
    }

    public int getLaadvermogen() {
        return laadvermogen;
    }

    public int getGeladen() {
        return geladen;
    }

    @Override
    public void afladen() {
        this.geladen = 0;
        System.out.println("Vrachttrein afgeladen");
    }

    @Override
    public String toString() {
        return "Vrachttrein{" +
                "laadvermogen=" + laadvermogen + "ton" +
                ", geladen=" + geladen + "ton" +
                "} " + super.toString();
    }
}
