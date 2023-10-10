import java.util.ArrayList;
import java.util.Collections;

public class Passagierstrein extends Trein {

    private int maxCapaciteit = 15;
    private int huidigeCapaciteit = 0;
    private ArrayList<Passagier> passagiers;

    public Passagierstrein(int maxCapaciteit) {
        if (maxCapaciteit < 15) {
            this.maxCapaciteit = 3;
        } else {
            this.maxCapaciteit = maxCapaciteit;
        }
        this.passagiers = new ArrayList<>();
    }

    public void setMaxCapaciteit(int maxCapaciteit) {
        this.maxCapaciteit = maxCapaciteit;
    }

    public void stapOp(Passagier p) {

        if (p.isTicket()) {
            this.passagiers.add(p);
            p.setTicket(false);
            if (this.huidigeCapaciteit + 1 <= maxCapaciteit) {
                this.huidigeCapaciteit++;
            } else {
                System.out.println("Trein zit vol");
            }
        } else {
            System.out.println("Persoon bezit geen ticket.");
        }
    }

    public void stapAf(Passagier p) throws PassagierNietGevondenException {
        if (this.passagiers.contains(p)) {
            this.passagiers.remove(p);
            this.huidigeCapaciteit--;
        } else {
            throw new PassagierNietGevondenException("Gegeven passagier niet gevonden");
        }
    }

    //Natuurlijk sorteren
    public ArrayList<Passagier> geefPassagiersGesorteerdOpNaam() {

        ArrayList<Passagier> passagiersGesorteerd = new ArrayList<>(this.passagiers);
        Collections.sort(passagiersGesorteerd);
        return passagiersGesorteerd;

    }

    public ArrayList<Passagier> geefPassagiersGesorteerdOpLeeftijd() {

        ArrayList<Passagier> passagiersGesorteerd = new ArrayList<>(this.passagiers);
        Collections.sort(passagiersGesorteerd, new geefPassagiersGesorteerdOpLeeftijd());
        return passagiersGesorteerd;

    }

    @Override
    public String toString() {
        return "Passagierstrein{" +
                "maxCapaciteit=" + maxCapaciteit +
                ", huidigeCapaciteit=" + huidigeCapaciteit +
                ", passagiers=" + passagiers +
                "} " + super.toString();
    }
}
